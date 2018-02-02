package com.learn.ch1_9;

/**
 * @ClassName: MyThread
 * @Description: 1.9 使用yield()方法
 * @author dongzhou
 * @date 2018年2月2日 下午4:06:30
 */
class MyThread extends Thread {
	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		int count = 0;
		for (int i = 0; i < 50000000; i++) {
			// yield()方法使当前线程放弃当前的CPU资源，将他让给其他任务去占用CPU的执行时间，
			// 放弃和重新获得CPU时间片的时间不确定,由系统自己决定
			Thread.yield();
			count += i + 1;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("用时：" + (endTime - beginTime) + "毫秒");
	}
}
