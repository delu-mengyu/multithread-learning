package com.sync.ch2_1_5;

/**
 * @ClassName: ThreadA
 * @Description: TODO
 * @author dongzhou
 * @date 2018年2月7日 下午2:32:26
 */
class ThreadA extends Thread {
	private PublicVar var;

	public ThreadA(PublicVar var) {
		this.var = var;
	}
	
	@Override
	public void run() {
		var.setValue("B", "BB");
	}
}
