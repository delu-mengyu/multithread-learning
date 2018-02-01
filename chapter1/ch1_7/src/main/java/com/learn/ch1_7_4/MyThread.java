package com.learn.ch1_7_4;

/**
 * @ClassName: MyThread
 * @Description: 1.7.4 在沉睡中停止
 * @author dongzhou
 * @date 2018年2月1日 下午2:14:24
 */
class MyThread extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("在沉睡中被停止！进入到run方法的catch中：" + this.isInterrupted());
			e.printStackTrace();
		}
	}
}
