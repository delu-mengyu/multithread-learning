package com.learn.ch1_8_3;

/**
 * @ClassName: Run
 * @Description: 1.8.3 suspend和resume方法在线程暂停时引起的数据不同步
 * @author dongzhou
 * @date 2018年2月1日 下午4:29:11
 */
public class Run {
	public static void main(String[] args) {
		t1();
	}


	public static void t1() {
		final MyObject mb = new MyObject();
		try {
			Thread thread1 = new Thread() {
				public void run() {
					// 线程被暂停后，代码运行未进行到给password赋值那一步，导致thread2打印时，pwd取得事默认值
					mb.setValue("a", "aa");
				};
			};
			thread1.setName("a");
			thread1.start();
			Thread.sleep(1000);
			Thread thread2 = new Thread() {
				public void run() {
					mb.printString();
				};
			};
			thread2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
