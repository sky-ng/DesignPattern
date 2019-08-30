package com.sky.pattern.Null;

/**
 * 空对象模式测试类
 * @author SKY
 *
 */
public class NullPatternDemo {
	public static void main(String[] args) {
		AbstractObject object1 = ObjectFactory.getObject("light");
		AbstractObject object2 = ObjectFactory.getObject("bed");
		AbstractObject object3 = ObjectFactory.getObject("table");
		AbstractObject object4 = ObjectFactory.getObject("sun");
		object1.show();
		object2.show();
		object3.show();
		object4.show();
	}
}
