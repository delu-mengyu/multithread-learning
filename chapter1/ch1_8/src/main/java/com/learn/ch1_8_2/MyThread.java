package com.learn.ch1_8_2;

/**
 * @ClassName: MyThread
 * @Description: 1.8.2 suspend和resume方法的缺点---独占
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
			// 当程序运行到println()方法内部停止时，同步锁并未被释放，使prntln()方面处于暂停状态，并且锁未释放
			System.out.println("i=" + i);
		}
	}

}
