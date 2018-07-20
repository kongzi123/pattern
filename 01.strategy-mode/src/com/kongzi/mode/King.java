package com.kongzi.mode;

/**
 * 国王
 */
public class King extends Character {
	
	public King(String name) {
		this.name = name;
		weaponBehavior = new SwordBehavior();
	}
	
}
