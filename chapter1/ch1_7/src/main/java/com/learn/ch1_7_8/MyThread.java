package com.learn.ch1_7_8;

/**
 * @ClassName: MyThread
 * @Description: 1.7.8 使用return方法停止线程
 * @author dongzhou
 * @date 2018年2月1日 下午3:34:58
 */
class MyThread extends Thread {
	@Override
	public void run() {
		while (true) {
			if (this.isInterrupted()) {
				System.out.println("停止了");
				return;
			}
			System.out.println("timer = " + System.currentTimeMillis());
		}
	}
}
