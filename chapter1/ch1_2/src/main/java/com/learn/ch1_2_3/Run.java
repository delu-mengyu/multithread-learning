package com.learn.ch1_2_3;

/**
 * @ClassName: Run
 * @Description: 1.2.3 实例变量与线程安全
 * @author dongzhou
 * @date 2018年1月31日 下午2:02:52
 */
public class Run {
	public static void main(String[] args) {
		// t1();
		// t2();
		// t3();
		t4();
	}

	/**
	 * @Description: 模仿一个非线程安全的问题
	 */
	public static void t4() {
		ALogin a = new ALogin();
		a.start();
		BLogin b = new BLogin();
		b.start();
	}

	/**
	 * @Description: 与t2的区别是在run方法上添加了synchronized关键字
	 * 实现了线程的同步
	 */
	public static void t3() {
		MyThread3 mt = new MyThread3();
		// 将mt这个变量交给不同的线程来启动
		Thread a = new Thread(mt, "A");
		Thread b = new Thread(mt, "B");
		Thread c = new Thread(mt, "C");
		Thread d = new Thread(mt, "D");
		Thread e = new Thread(mt, "E");

		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}

	/**
	 * @Description: 共享变量数据
	 * 就是多个线程访问同一变量
	 * 打印结果面含有非线程安全的问题
	 */
	public static void t2() {
		MyThread2 mt = new MyThread2();
		// 将mt这个变量交给不同的线程来启动
		Thread a = new Thread(mt, "A");
		Thread b = new Thread(mt, "B");
		Thread c = new Thread(mt, "C");
		Thread d = new Thread(mt, "D");
		Thread e = new Thread(mt, "E");

		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}

	/**
	 * @Description: 不共享数据的线程运行
	 * 每个线程只会使用自己的变量
	 */
	public static void t1() {
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		MyThread d = new MyThread("D");

		a.start();
		b.start();
		c.start();
		d.start();
	}
}
