package com.psh.decorator.coffee.decorator;

import com.psh.decorator.coffee.Coffee;

import java.math.BigDecimal;

/**
 * 牛奶咖啡 就要对原基础咖啡增强，那就要重写适配器方法
 *
 * @author psh 2023/5/7 19:44
 */
public class MilkCofferDecorator extends CoffeeDecorator {

	private static final BigDecimal MILK_COST = BigDecimal.valueOf(5);

	public MilkCofferDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public BigDecimal cost() {
		return super.cost().add(MILK_COST);
	}

	@Override
	public String description() {
		return super.description() + ", 添加了牛奶!";
	}

}
