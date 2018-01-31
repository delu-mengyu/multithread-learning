package com.learn.ch1_2_3;

/**
 * @ClassName: MyThread
 * @Description: 1.2.3 实例变量与线程安全
 * @author dongzhou
 * @date 2018年1月31日 下午1:59:33
 */
class MyThread extends Thread {
	private int count = 5;

	public MyThread(String name) {
		this.setName(name);
	}

	// 数据不共享
	@Override
	public void run() {
		while (count > 0) {
			count--;
			System.out.println("由" + Thread.currentThread().getName() + "计算，count = " + count);
		}
	}

}
