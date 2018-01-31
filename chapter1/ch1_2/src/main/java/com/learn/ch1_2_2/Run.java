package com.learn.ch1_2_2;

/**
 * @ClassName: Run
 * @Description: 1.2.2 实现Runnable接口
 * @author dongzhou
 * @date 2018年1月31日 下午1:52:06
 */
public class Run {
	public static void main(String[] args) {
		t1();
	}

	/**
	 * @Title: t1
	 * @Description: Runnable接口的运行
	 * @author dongzhou
	 * @date 2018年1月31日 下午1:52:52
	 */
	public static void t1() {
		MyRunnable mr = new MyRunnable();
		// Runnable接口启动线程必须交给其他线程来执行，（一个线程可以交给另一个线程来执行）
		Thread thread = new Thread(mr);
		thread.start();
		System.out.println("运行结束");
	}
}
