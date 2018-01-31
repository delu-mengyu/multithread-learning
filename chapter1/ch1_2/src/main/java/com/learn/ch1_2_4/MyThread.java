package com.learn.ch1_2_4;

/**
 * @ClassName: MyThread
 * @Description: 1.2.4 i++和println()方法联合使用可能出现的非线程安全
 * @author dongzhou
 * @date 2018年1月31日 下午3:27:35
 */
class MyThread extends Thread {
	private int i = 5;

	// 虽然println方法是在内部进行同步的，但是i--操作是在进入该方法前执行的，所以会出现非线程安全的问题
	@Override
	public void run() {
		System.out.println("i=" + (i--) + ",threadName=" + Thread.currentThread().getName());
	}
}
