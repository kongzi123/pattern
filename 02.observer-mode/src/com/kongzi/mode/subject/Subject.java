package com.kongzi.mode.subject;

import java.util.Vector;

import com.kongzi.mode.observer.Observer;

/**
 * 主题类
 */
public abstract class Subject {
	
	public Vector<Observer> obs = new Vector<>();
	
	/**
	 * 增加观察者
	 * @param obs
	 */
	public void addObserver(Observer obs) {
		if(this.obs.contains(obs)) {
			return;
		}
		this.obs.add(obs);
	}
	
	/**
	 * 删除观察者
	 * @param obs
	 */
	public void removeObserver(Observer obs) {
		if(this.obs.contains(obs)) {
			this.obs.remove(obs);
		}		
	}
	
	/**
	 * 通知所有观察者
	 */
	protected void notifyAllObserver() {
		for(Observer obs : this.obs) {
			obs.update();
		}
	}
	
	/**
	 * 自定义处理
	 */
	public abstract void handle();
	
}
