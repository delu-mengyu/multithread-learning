package com.learn.ch1_3;

/**
 * @ClassName: CountOperate
 * @Description: 1.3
 * @author dongzhou
 * @date 2018年1月31日 下午4:44:57
 */
class CountOperate extends Thread {

	public CountOperate() {
		System.out.println("CountOperate---begin");
		System.out.println("无参构造方法 name=" + Thread.currentThread().getName());
		System.out.println("CountOperate---end");
	}

	@Override
	public void run() {
		System.out.println("run---begin");
		System.out.println("run方法 name=" + Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("run---end");
	}

}
