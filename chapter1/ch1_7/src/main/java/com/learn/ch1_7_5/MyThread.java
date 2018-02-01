package com.learn.ch1_7_5;

/**
 * @ClassName: MyThread
 * @Description: 1.7.5 暴力停止
 * @author dongzhou
 * @date 2018年2月1日 下午2:59:49
 */
class MyThread extends Thread {
	private int i = 0;
	@Override
	public void run() {
		try {
			while (true) {
				i++;
				System.out.println("i=" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
