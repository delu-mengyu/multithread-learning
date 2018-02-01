package com.learn.ch1_7_1;

/**
 * @ClassName: InterruptThread
 * @Description: 1.7.1 停止不了的线程，使用interrupt()中止线程
 * @author dongzhou
 * @date 2018年2月1日 上午10:04:59
 */
class InterruptThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 500000; i++) {
			System.out.println("i = " + (i + 1));
		}
	}

}
