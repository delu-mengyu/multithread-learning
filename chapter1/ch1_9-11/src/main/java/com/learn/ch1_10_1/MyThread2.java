package com.learn.ch1_10_1;

/**
 * @ClassName: MyThread2
 * @Description: 1.10.1 线程优先级的继承特性
 * @author dongzhou
 * @date 2018年2月2日 下午5:05:26
 */
class MyThread2 extends Thread {
	@Override
	public void run() {
		System.out.println("t2 run priority =" + this.getPriority());
	}
}
