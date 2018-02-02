package com.learn.ch1_8_3;

/**
 * @ClassName: MyThread
 * @Description: 1.8.3 suspend和resume方法在线程暂停时引起的数据不同步
 * @author dongzhou
 * @date 2018年2月1日 下午4:27:18
 */
class MyObject {
	private String username = "1";
	private String password = "11";

	public void setValue(String u, String p) {
		this.username = u;
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("暂停a线程");
			Thread.currentThread().suspend();
		}
		this.password = p;
	}

	public void printString() {
		System.out.println(username + "---" + password);
	}
}
