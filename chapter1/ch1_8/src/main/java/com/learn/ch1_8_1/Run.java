package com.learn.ch1_8_1;

/**
 * @ClassName: Run
 * @Description: 1.8.1 suspend和resume方法的使用
 * @author dongzhou
 * @date 2018年2月1日 下午4:29:11
 */
public class Run {
	public static void main(String[] args) {

	}

	/*
	 * Thread可以被suspend()方法暂停，也可以被resume()重新恢复
	 */
	public static void t1() {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(3000);
			// A
			thread.suspend();
			System.out.println("A=" + System.currentTimeMillis() + ",i=" + thread.getI());
			Thread.sleep(3000);
			System.out.println("A=" + System.currentTimeMillis() + ",i=" + thread.getI());
			// B
			thread.resume();
			Thread.sleep(3000);
			// C
			thread.suspend();
			System.out.println("B=" + System.currentTimeMillis() + ",i=" + thread.getI());
			Thread.sleep(3000);
			System.out.println("B=" + System.currentTimeMillis() + ",i=" + thread.getI());

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
