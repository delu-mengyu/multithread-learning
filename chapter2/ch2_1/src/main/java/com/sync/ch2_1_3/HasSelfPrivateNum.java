package com.sync.ch2_1_3;

/**
 * @ClassName: HasSelfPrivateNum
 * @Description: 2.1.3 多个对象多个锁
 * @author dongzhou
 * @date 2018年2月2日 下午5:46:43
 */
class HasSelfPrivateNum {
	private int num = 0;

	public synchronized void addI(String username) {
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
