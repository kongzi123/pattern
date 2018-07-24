package com.kongzi.mode.observer;

/**
 * 观察者1
 */
public class OneObserver implements Observer {

	@Override
	public void update() {
		System.out.println("观察者1 接收到消息");
		
		System.out.println("观察者1 处理...");
	}
	
}
