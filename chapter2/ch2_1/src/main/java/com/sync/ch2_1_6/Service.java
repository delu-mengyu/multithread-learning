package com.sync.ch2_1_6;

/**
 * @ClassName: Service
 * @Description: synchronized锁重入
 * @author dongzhou
 * @date 2018年2月7日 下午2:56:08
 */
class Service {
	synchronized public void service1() {
		System.out.println("service1");
		service2();
	}

	synchronized public void service2() {
		System.out.println("service2");
		service3();
	}

	synchronized public void service3() {
		System.out.println("service3");
	}

}
