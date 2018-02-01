package com.learn.ch1_7_2;

/**
 * @ClassName: InterruptedThread
 * @Description: 1.7.2 判断线程是否停止
 * @author dongzhou
 * @date 2018年2月1日 上午10:57:44
 */
class InterruptedThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 500000; i++) {
			System.out.println("i = " + (i + 1));
		}
	}

}
