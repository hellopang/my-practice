package com.psh.builder.car.builder;

/**
 * @author psh 2023/5/9 23:36
 */
public class BensCarBuilder extends CarBuilder {

	@Override
	public void buildMake() {
		car.setMake("奔驰");
	}

	@Override
	public void buildModel() {
		car.setModel("S");
	}

	@Override
	public void buildYear() {
		car.setYear(2013);
	}

	@Override
	public void buildColor() {
		car.setColor("黑色");
	}

	@Override
	public void buildSeats() {
		car.setSeats(4);
	}

}
