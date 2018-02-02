package com.learn.ch1_10_4;

/**
 * @ClassName: MyThread
 * @Description: 1.10.4 看谁跑得快
 * @author dongzhou
 * @date 2018年2月2日 下午5:06:49
 */
class MyThreadB extends Thread {
	private int count = 0;

	public int getCount() {
		return count;
	}

	@Override
	public void run() {
		while (true) {
			count++;
		}
	}
}
