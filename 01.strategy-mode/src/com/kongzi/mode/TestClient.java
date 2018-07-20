package com.kongzi.mode;


/**
 * 测试客户端（策略模式）
 *
 */
public class TestClient {
	
	/**
	 * 需求：
	 * 动作冒险游戏。你将看到代表游戏角色的类，以及武器行为的类。每个角色一次只能使用一个武器，但是可以在游戏的过程中换武器
	 * 
	 * 解析：
	 * C h a r a c t e r （ 角色） 是抽象类， 让具体的角色继承之。具体的角色包括： 国王（ K i n g ） 、
	 * 皇后（ Q u e e n ） 、骑士（ K n i g h t ） 、	 * 妖怪（T r o l l）。
	 * 而W e a p o n（武器）是接口，让具体的武器继承之。所有实际的角色和武器都是具体类。
	 * 任何角色如果想换武器，可以调用s e t W e a p o n ( ) 方法，此方法定义在C h a r a c t e r 超类中。
	 * 在打斗（ f l i g h t ） 过程中， 会调用到目前武器的u s e W e a p o n ( ) 方法，攻击其他角色。
	 */	
	public static void main(String[] args) {
		
		 King king = new King("国王");
		 king.flight();
		 
		 System.out.println("******************************");
		 Queen queen = new Queen("王后");
		 queen.flight();
		 
		 System.out.println("******************************");
		 Knight knight = new Knight("骑士");
		 knight.flight();
	}	
}
