package com.sync.ch2_1_2;

/**
 * @ClassName: HasSelfPrivateNum
 * @Description: 2.1.2 实例变量是非线程安全的
 * @author dongzhou
 * @date 2018年2月2日 下午5:46:43
 */
class HasSelfPrivateNum {
	private int num = 0;

	public void addI(String username) {
		try {
			if (username.equals("a")) {
				num = 100;
				System.out.println("a set over");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over");
			}
			System.out.println(username + " num =" + num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
