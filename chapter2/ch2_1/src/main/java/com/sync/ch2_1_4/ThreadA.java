package com.sync.ch2_1_4;

/**
 * @ClassName: ThreadA
 * @Description: 2.1.4
 * @author dongzhou
 * @date 2018年2月5日 上午11:37:03
 */
class ThreadA extends Thread {
	private MyObject object;

	public ThreadA(MyObject object) {
		this.object = object;
	}

	@Override
	public void run() {
		object.methodA();
	}

}
