package com.psh.builder.car.builder;

import com.psh.builder.car.Car;

/**
 * 抽象建造者 定义了对象的创建过程以及如何将其各个部分组装成最终对象
 *
 * @author psh 2023/5/9 23:31
 */
public abstract class CarBuilder {

	/**
	 * 持有产品对象
	 */
	protected Car car;

	public Car getCar() {
		return car;
	}

	public void createNewCar() {
		car = new Car();
	}

	/**
	 * 制造商
	 */
	public abstract void buildMake();

	/**
	 * 型号
	 */
	public abstract void buildModel();

	/**
	 * 生产年份
	 */
	public abstract void buildYear();

	/**
	 * 车身颜色
	 */
	public abstract void buildColor();

	/**
	 * 座位数量
	 */
	public abstract void buildSeats();

}
