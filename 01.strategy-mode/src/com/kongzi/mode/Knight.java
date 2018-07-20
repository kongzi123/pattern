package com.kongzi.mode;

import com.kongzi.mode.behavior.BowAndArrowBehavior;

/**
 * 骑士
 */
public class Knight extends Character {
	
	public Knight(String name) {
		this.name = name;
		weaponBehavior = new BowAndArrowBehavior();
	}
}
