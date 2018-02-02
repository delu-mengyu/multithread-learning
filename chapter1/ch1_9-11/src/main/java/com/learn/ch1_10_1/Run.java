package com.learn.ch1_10_1;

/**
 * @ClassName: Run
 * @Description: 1.10.1 线程优先级的继承特性
 * @author dongzhou
 * @date 2018年2月2日 下午5:06:55
 */
public class Run {
	// 一个线程的启动交给另一个线程，则两个线程的优先级是一样的
	public static void main(String[] args) {
		System.out.println("main thread begin priority =" + Thread.currentThread().getPriority());
		// Thread.currentThread().setPriority(6);
		System.out.println("main thread end priority =" + Thread.currentThread().getPriority());
		MyThread mt = new MyThread();
		mt.start();

	}
}
