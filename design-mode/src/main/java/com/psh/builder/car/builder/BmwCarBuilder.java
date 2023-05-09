package com.psh.builder.car.builder;

/**
 * @author psh 2023/5/9 23:36
 */
public class BmwCarBuilder extends CarBuilder {

	@Override
	public void buildMake() {
		car.setMake("宝马");
	}

	@Override
	public void buildModel() {
		car.setModel("X7");
	}

	@Override
	public void buildYear() {
		car.setYear(2016);
	}

	@Override
	public void buildColor() {
		car.setColor("奶油色");
	}

	@Override
	public void buildSeats() {
		car.setSeats(2);
	}

}
