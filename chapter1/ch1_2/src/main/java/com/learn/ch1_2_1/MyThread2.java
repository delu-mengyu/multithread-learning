package com.learn.ch1_2_1;

/**
 * @ClassName: MyThread
 * @Description: 1.2.1 继承Thread类
 * @author dongzhou
 * @date 2018年1月31日 上午11:37:13
 */
class MyThread2 extends Thread {

	private int i;

	public MyThread2(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println(i);
	}
}
