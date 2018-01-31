package com.learn.ch1_2_1;

/**
 * @ClassName: MyThread
 * @Description: 1.2.1 继承Thread类
 * @author dongzhou
 * @date 2018年1月31日 上午11:37:13
 */
class MyThread extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("run = " + Thread.currentThread().getName() + "--" + i + "--" + time);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
