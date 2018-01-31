package com.learn.ch1_5;

/**
 * @ClassName: MyThread
 * @Description: 1.5 sleep()方法
 * @author dongzhou
 * @date 2018年1月31日 下午5:33:43
 */
class MyThread extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("run threadName =" + this.currentThread().getName() + "--begin");
			Thread.sleep(2000);
			System.out.println("run threadName =" + this.currentThread().getName() + "--end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
