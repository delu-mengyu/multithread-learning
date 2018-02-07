package com.sync.ch2_1_5;

/**
 * @ClassName: PublicVar
 * @Description: 2.1.5 脏读
 * @author dongzhou
 * @date 2018年2月7日 下午2:25:17
 */
class PublicVar {
	public String name = "A";
	public String pwd = "AA";

	public synchronized void setValue(String name, String pwd) {
		try {
			this.name = name;
			Thread.sleep(5000);
			this.pwd = pwd;
			System.out.println(
					"setValue thread name=" + Thread.currentThread().getName() + ",name=" + name + ",pwd=" + pwd);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 方法上加上synchronized关键字，是方法同步，解决脏读的问题
	 * 
	 * @Description: TODO
	 */
	public void getValue() {
		System.out.println(
				"getValue thread name=" + Thread.currentThread().getName() + ",name=" + name + ",pwd=" + pwd);
	}
}
