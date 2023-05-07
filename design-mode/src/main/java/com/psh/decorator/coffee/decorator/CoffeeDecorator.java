package com.psh.decorator.coffee.decorator;

import com.psh.decorator.coffee.Coffee;

import java.math.BigDecimal;

/**
 * 通过咖啡装饰器对原有咖啡类增强 想要增强就对其适配器做各种实现
 *
 * @author psh 2023/5/7 19:41
 */
public class CoffeeDecorator implements Coffee {

	protected final Coffee coffee;

	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public BigDecimal cost() {
		return coffee.cost();
	}

	@Override
	public String description() {
		return coffee.description();
	}

}
