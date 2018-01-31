package com.learn.ch1_2_3;

/**
 * @ClassName: LoginServlet
 * @Description: 模仿一个servlet组件
 * @author dongzhou
 * @date 2018年1月31日 下午2:32:28
 */
class LoginServlet {
	private static String nameRef;
	private static String passwordRef;

	public synchronized static void doPost(String name, String pwd) {
		try {
			nameRef = name;
			if (name.equals("a")) {
				Thread.sleep(3000);
			}
			// 当a挂起后，被重新刷成了b值，之后又重新赋值aa（非线程安全的情况下）
			passwordRef = pwd;
			System.out.println("name=" + nameRef + ",password=" + passwordRef);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
