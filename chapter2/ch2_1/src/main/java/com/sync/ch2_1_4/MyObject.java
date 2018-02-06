package com.sync.ch2_1_4;

/**
 * @ClassName: MyObject
 * @Description: 2.1.4
 * @author dongzhou
 * @date 2018年2月6日 下午5:22:06
 */
class MyObject {

	// 调用关键字实现同步，只有共享资源才会需要同步
	public synchronized void methodA() {
		try {
			System.out.println("beign methodA  threadName=" + Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end,time=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void methodB() {
		try {
			System.out.println("beign methodA  threadName=" + Thread.currentThread().getName() + ",begin time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
