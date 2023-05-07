package com.psh.decorator.coffee.decorator;

import com.psh.decorator.coffee.Coffee;

import java.math.BigDecimal;

/**
 * @author psh 2023/5/7 19:50
 */
public class HoneyCofferDecorator extends CoffeeDecorator {

	private static final BigDecimal HONEY_COST = BigDecimal.valueOf(10);

	public HoneyCofferDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public BigDecimal cost() {
		return super.cost().add(HONEY_COST);
	}

	@Override
	public String description() {
		return super.description() + ", 添加了蜂蜜!";
	}

}
