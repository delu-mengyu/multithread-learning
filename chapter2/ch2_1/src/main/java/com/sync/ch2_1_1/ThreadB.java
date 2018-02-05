package com.sync.ch2_1_1;

/**
 * @ClassName: ThreadB
 * @Description: 2.1.1 方法内部的私有变量是线程安全的
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
