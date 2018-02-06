package com.sync.ch2_1_3;

/**
 * @ClassName: ThreadB
 * @Description: 2.1.3 多个对象多个锁
 * @author dongzhou
 * @date 2018年2月5日 上午11:37:03
 */
class ThreadB extends Thread {
	private HasSelfPrivateNum numRef;

	public ThreadB(HasSelfPrivateNum numRef) {
		this.numRef = numRef;
	}

	@Override
	public void run() {
		numRef.addI("b");
	}

}
