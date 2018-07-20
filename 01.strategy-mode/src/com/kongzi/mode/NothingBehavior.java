package com.kongzi.mode;

public class NothingBehavior implements WeaponBehavior {

	@Override
	public void userWeapon() {
		System.out.println("不会使用武器...");
	}

}
