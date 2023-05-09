package com.psh.builder.car;

import com.psh.builder.car.builder.CarBuilder;

/**
 * 指挥者：负责安排Builder实例以正确顺序执行构造过程。
 *
 * @author psh 2023/5/9 23:40
 */
public class CarFactory {

	private CarBuilder carBuilder;

	public void setCarBuilder(CarBuilder builder) {
		carBuilder = builder;
	}

	public Car getCar() {
		return carBuilder.getCar();
	}

	public void buildCar() {
		carBuilder.createNewCar();
		carBuilder.buildMake();
		carBuilder.buildModel();
		carBuilder.buildYear();
		carBuilder.buildColor();
		carBuilder.buildSeats();
	}

}
