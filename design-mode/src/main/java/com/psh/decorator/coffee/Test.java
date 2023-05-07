package com.psh.decorator.coffee;

import com.psh.decorator.coffee.decorator.HoneyCofferDecorator;
import com.psh.decorator.coffee.decorator.MilkCofferDecorator;

/**
 * @author psh 2023/5/7 19:52
 */
public class Test {

	@SuppressWarnings("ALL")
	public static void main(String[] args) {

		// 基础咖啡
		Coffee coffee = new SimpleCoffee();

		// 牛奶咖啡
		MilkCofferDecorator milkCofferDecorator = new MilkCofferDecorator(coffee);
		System.out.println("牛奶咖啡：" + "价格：" + milkCofferDecorator.cost() + "，描述："
				+ milkCofferDecorator.description());

		// 蜂蜜咖啡
		HoneyCofferDecorator honeyCofferDecorator = new HoneyCofferDecorator(coffee);
		System.out.println("蜂蜜咖啡：" + "价格：" + honeyCofferDecorator.cost() + "，描述："
				+ honeyCofferDecorator.description());

	}

}
