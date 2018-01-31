package com.learn.ch1_3;

/**
 * @ClassName: MyThread
 * @Description: 1.3 currentThread()方法使用
 * @author dongzhou
 * @date 2018年1月31日 下午4:37:24
 */
class MyThread extends Thread {
	public MyThread() {
		System.out.println("无参构造方法：" + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		System.out.println("run方法：" + Thread.currentThread().getName());
	}
}
