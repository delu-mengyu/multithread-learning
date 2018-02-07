package com.sync.ch2_1_6;

/**
 * @ClassName: Parent
 * @Description: 父子可重入锁
 * @author dongzhou
 * @date 2018年2月7日 下午3:07:43
 */
class Parent {
	public int i = 10;

	public synchronized void parentMethod() {
		try {
			i--;
			System.out.println("parent i = " + i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
