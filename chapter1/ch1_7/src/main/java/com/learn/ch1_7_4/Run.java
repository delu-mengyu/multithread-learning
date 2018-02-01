package com.learn.ch1_7_4;

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

	public static void t2() {
		MyThread2 thread = new MyThread2();
		thread.start();
		thread.interrupt();
		System.out.println("end");
	}

	// 再沉睡中停止
	public static void t1() {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("来到  main方法的catch中！");
			e.printStackTrace();
		}
		System.out.println("end");

	}
}
