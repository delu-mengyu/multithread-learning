package com.learn.ch1_7_5;

/**
 * @ClassName: Run
 * @Description: 1.7.3 异常停止法
 * @author dongzhou
 * @date 2018年2月1日 下午2:01:44
 */
public class Run {
	public static void main(String[] args) {
		t2();
	}

	/*
	 * stop()方法会强制让一个线程停止，有可能使一些清理行的工作得不到完成
	 * 另外就是会对锁定的情况进行解锁，是数据得不到同步的处理，出现数据不一致的问题
	 * 所以    不建议使用stop方法来停止线程，还是建议使用抛出异常的方式来实现线程的停止，
	 * 因为在catch块中，可以使线程停止事件向上传播
	 */
	public static void t2() {
		MyThread2 mt = new MyThread2();
		mt.start();
	}

	// 使用stop方法暴力停止线程，不建议使用
	public static void t1() {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(8000);
			System.out.println("睡完了");
			thread.stop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}
}
