package com.sync.ch2_1_6;

/**
 * @ClassName: Sub
 * @Description: 父子可重入锁
 * @author dongzhou
 * @date 2018年2月7日 下午3:07:43
 */
class Sub extends Parent {

	public synchronized void subMethod() {
		try {
			while (i > 0) {
				i--;
				System.out.println("sub i = " + i);
				Thread.sleep(1000);
				this.parentMethod();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
