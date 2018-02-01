package com.learn.ch1_7_4;

/**
 * @ClassName: MyThread
 * @Description: 1.7.4 在沉睡中停止
 * @author dongzhou
 * @date 2018年2月1日 下午2:14:24
 */
class MyThread2 extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 500000; i++) {
				System.out.println("i = " + (i + 1));
			}
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("先停止，再遇到sleep！进入catch");
			e.printStackTrace();
		}
	}
}
