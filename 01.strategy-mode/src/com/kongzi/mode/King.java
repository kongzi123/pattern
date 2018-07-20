package com.kongzi.mode;

import com.kongzi.mode.behavior.SwordBehavior;

/**
 * 国王
 */
public class King extends Character {
	
	public King(String name) {
		this.name = name;
		weaponBehavior = new SwordBehavior();
	}
	
}
