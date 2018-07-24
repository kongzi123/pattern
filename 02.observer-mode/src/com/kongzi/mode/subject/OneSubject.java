package com.kongzi.mode.subject;

/**
 * 具体主题1
 */
public class OneSubject extends Subject {

	@Override
	public void handle() {
		System.out.println("主题1 开始处理");
		
		//通知所有观察者
		this.notifyAllObserver();
	}

}
