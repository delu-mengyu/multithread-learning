package com.learn.ch1_11;

/**
 * @ClassName: Run
 * @Description: 1.11 守护线程
 * @author dongzhou
 * @date 2018年2月2日 下午5:36:58
 */
public class Run {
	
	/*
	 * 守护线程的作用就是为其他线程的运行提供便利的服务；
	 * 当JVM中有非守护线程存在，守护线程就不会结束；
	 * 典型的守护线程  就是GC（垃圾回收器）
	 */
	public static void main(String[] args) {
		try {
			MyThread mt = new MyThread();
			// 设置守护线程
			mt.setDaemon(true);
			mt.start();
			Thread.sleep(5000);
			System.out.println("我离开mt对象也就不再打印了，停止了");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
