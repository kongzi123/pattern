package com.kongzi.mode;

import com.kongzi.mode.behavior.NothingBehavior;

/**
 * 王后
 */
public class Queen extends Character {
	
	public Queen(String name) {
		this.name = name;
		weaponBehavior = new NothingBehavior();
	}
	
}
