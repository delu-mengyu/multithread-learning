package com.learn.ch1_2_1;

/**
 * @ClassName: Run
 * @Description: 1.2.1 继承Thread类
 * @author dongzhou
 * @date 2018年1月31日 上午11:39:49
 */
class Run {

	public static void main(String[] args) {
		// t1();
		t2();
	}

	/**
	 * @Title: t2
	 * @Description: start()方法的顺序，不代表线程的启动执行顺序
	 * @author dongzhou
	 * @date 2018年1月31日 下午1:48:47
	 */
	public static void t2() {
		for (int i = 0; i < 15; i++) {
			MyThread2 mt = new MyThread2(i);
			mt.start();
		}
	}

	/**
	 * @Title: t1
	 * @Description: Thread线程的随机性
	 * @author dongzhou
	 * @date 2018年1月31日 上午11:40:26
	 */
	public static void t1() {
		MyThread mt = new MyThread();
		mt.setName("myTh");
		// 此处注意run和start方法的区别，一个是同步，一个是异步
		// mt.run();
		mt.start();
		try {
			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("main = " + Thread.currentThread().getName() + "--" + i + "--" + time);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
