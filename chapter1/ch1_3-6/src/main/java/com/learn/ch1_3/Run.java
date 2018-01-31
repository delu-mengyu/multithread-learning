package com.learn.ch1_3;

/**
 * @ClassName: Run
 * @Description: 1.3 currentThread()方法使用
 * @author dongzhou
 * @date 2018年1月31日 下午4:41:12
 */
public class Run {

	public static void main(String[] args) {
		// t1();
		// t2();

	}

	// currentThread()方法就是返回当前执行线程的调用信息
	public static void t2() {
		CountOperate c = new CountOperate();
		Thread t = new Thread(c);
		// t.setName("AAA");
		t.start();
	}

	// start和run方法的区别
	public static void t1() {
		MyThread mt = new MyThread();
		// start和run方法的区别在于一个是启动线程来调用run方法，一个是通过方法直接调用run方法
		// mt.start();
		mt.run();
	}

}
