package com.kongzi.mode;

/**
 * 
 * 角色
 */
public abstract class Character {
	
	/**
	 * 武器行为
	 */
	WeaponBehavior weaponBehavior;	
	
	/**
	 * 名称
	 */
	String name;

	public void setName(String name) {
		this.name = name;
	}

	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}

	/**
	 * 使用武器打斗
	 */
	void flight() {
		System.out.println("当前是：" + name);
		weaponBehavior.userWeapon();
	}
	
}
