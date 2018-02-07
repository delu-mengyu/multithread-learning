package com.sync.ch2_1_6;

/**
 * @ClassName: MyThread
 * @Description: synchronized锁重入
 * @author dongzhou
 * @date 2018年2月7日 下午2:58:09
 */
class MyThread extends Thread {
	@Override
	public void run() {
		/*Service service = new Service();
		service.service1();*/
		Sub sub = new Sub();
		sub.subMethod();
	}
}
