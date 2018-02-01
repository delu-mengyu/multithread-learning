package com.learn.ch1_8_2;

/**
 * @ClassName: Run
 * @Description: 1.8.1 suspend和resume方法的使用
 * @author dongzhou
 * @date 2018年2月1日 下午4:29:11
 */
public class Run {
	public static void main(String[] args) {
		t2();
	}

	// 线程被暂停
	public static void t2() {
		try {
			MyThread mt = new MyThread();
			mt.start();
			Thread.sleep(1000);
			mt.suspend();
			System.out.println("main end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 线程被a占用后未释放，就形成了独占
	public static void t1() {
		try {
			final SynchronizedObject object = new SynchronizedObject();
			Thread t1 = new Thread() {
				@Override
				public void run() {
					object.printString();
				}
			};
			t1.setName("a");
			t1.start();
			Thread.sleep(1000);
			Thread t2 = new Thread() {
				@Override
				public void run() {
					System.out.println("t2启动了，但是进不了printString()方法，只打印了一个begin");
					System.out.println("因为printString()方法被a线程锁定并且永远暂停了");
					object.printString();
				}
			};
			t2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
