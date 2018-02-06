package com.sync.ch2_1_3;

/**
 * @ClassName: ThreadA
 * @Description: 2.1.3 多个对象多个锁
 * @author dongzhou
 * @date 2018年2月5日 上午11:37:03
 */
class ThreadA extends Thread {
	private HasSelfPrivateNum numRef;

	public ThreadA(HasSelfPrivateNum numRef) {
		this.numRef = numRef;
	}

	@Override
	public void run() {
		numRef.addI("a");
	}

}
