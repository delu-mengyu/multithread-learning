package com.learn.ch1_8_1;

/**
 * @ClassName: MyThread
 * @Description: 1.8.1 suspend和resume方法的使用
 * @author dongzhou
 * @date 2018年2月1日 下午4:27:18
 */
class MyThread extends Thread {
	private long i = 0;

	public long getI() {
		return i;
	}

	public void setI(long i) {
		this.i = i;
	}

	@Override
	public void run() {
		while (true) {
			i++;
			// System.out.println("i=" + i);
		}
	}

}
