package com.learn.ch1_7_2;

/**
 * @ClassName: Run
 * @Description: 1.7.2 判断线程是否停止
 * @author dongzhou
 * @date 2018年2月1日 上午10:58:33
 */
public class Run {
	public static void main(String[] args) {
		// 当前线程是main方法
		// t1();

		// t2();

		t3();
	}

	// isInterrupted() 测试线程是否停止
	public static void t3() {
		try {
			InterruptedThread it = new InterruptedThread();
			it.start();
			Thread.sleep(1000);
			// 该方法时停止it线程，而不是当前线程
			it.interrupt();
			System.out.println("是否停止1：" + it.isInterrupted());
			System.out.println("是否停止2：" + it.isInterrupted());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

	public static void t2() {
		Thread.currentThread().interrupt();
		System.out.println("当前线程：" + Thread.currentThread().getName() + ",是否停止1：" + Thread.interrupted());
		/*
		 * 第二个返回false的原因是因为interrupted方法具有清除状态的功能 
		 * 在第一次调用时获取线程以中断，之后清除了中断状态，线程此时的状态变更为未中断
		 */
		System.out.println("是否停止2：" + Thread.interrupted());
		System.out.println("end");
	}

	/*
	 * interrupt()--判断当前线程是否中断
	 */
	public static void t1() {
		InterruptedThread it = new InterruptedThread();
		try {
			it.start();
			Thread.sleep(3000);
			// 该方法时停止it线程，而不是当前线程
			it.interrupt();
			System.out.println("当前线程：" + Thread.currentThread().getName() + ",是否停止1：" + it.interrupted());
			System.out.println("是否停止2：" + it.interrupted());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
