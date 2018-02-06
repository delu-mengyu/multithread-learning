package com.sync.ch2_1_4;

/**
 * @ClassName: ThreadB
 * @Description: 2.1.4
 * @author dongzhou
 * @date 2018年2月5日 上午11:37:03
 */
class ThreadB extends Thread {
	private MyObject object;

	public ThreadB(MyObject object) {
		this.object = object;
	}

	@Override
	public void run() {
		object.methodB();
	}

}
