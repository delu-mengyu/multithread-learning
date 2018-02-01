package com.learn.ch1_7_5;

/**
 * @ClassName: MyThread
 * @Description: 1.7.5 暴力停止
 * @author dongzhou
 * @date 2018年2月1日 下午2:59:49
 */
class MyThread2 extends Thread {
	@Override
	public void run() {
		try {
			this.stop();
		} catch (Exception e) {
			System.out.println("进入catch中");
			e.printStackTrace();
		}
	}
}
