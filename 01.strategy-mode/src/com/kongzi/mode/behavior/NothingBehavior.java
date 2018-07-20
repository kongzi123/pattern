package com.kongzi.mode.behavior;

public class NothingBehavior implements WeaponBehavior {

	@Override
	public void userWeapon() {
		System.out.println("不会使用武器...");
	}

}
