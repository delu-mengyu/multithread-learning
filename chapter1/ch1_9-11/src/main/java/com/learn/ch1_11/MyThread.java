package com.learn.ch1_11;

/**
 * @ClassName: MyThread
 * @Description: 1.11 守护线程
 * @author dongzhou
 * @date 2018年2月2日 下午4:06:30
 */
class MyThread extends Thread {
	private int i = 0;
	@Override
	public void run() {
		try {
			while (true) {
				i++;
				System.out.println("i = " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
