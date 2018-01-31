package com.learn.ch1_4;

/**
 * @ClassName: MyThread
 * @Description: 1.4 isAlive方法
 * @author dongzhou
 * @date 2018年1月31日 下午5:33:43
 */
class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("run=" + this.isAlive());
	}
}
