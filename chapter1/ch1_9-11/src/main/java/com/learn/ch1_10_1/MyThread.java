package com.learn.ch1_10_1;

/**
 * @ClassName: MyThread
 * @Description: 1.10.1 线程优先级的继承特性
 * @author dongzhou
 * @date 2018年2月2日 下午5:06:49
 */
class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("t1 run priority =" + this.getPriority());
		MyThread2 t2 = new MyThread2();
		t2.start();
	}
}
