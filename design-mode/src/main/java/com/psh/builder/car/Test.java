package com.psh.builder.car;

import com.psh.builder.car.builder.BensCarBuilder;
import com.psh.builder.car.builder.BmwCarBuilder;
import com.psh.builder.car.builder.CarBuilder;

/**
 * @author psh 2023/5/9 23:41
 */
public class Test {

	public static void main(String[] args) {

		// 简易版
		Car audi = Car.builder().make("奥迪").model("A4").color("白色").year(2023).seats(4)
				.build();
		System.out.println("奥迪: " + audi);

		CarFactory carFactory = new CarFactory();

		CarBuilder sedanBuilder = new BensCarBuilder();
		carFactory.setCarBuilder(sedanBuilder);
		carFactory.buildCar();
		Car bens = carFactory.getCar();

		CarBuilder sportsCarBuilder = new BmwCarBuilder();
		carFactory.setCarBuilder(sportsCarBuilder);
		carFactory.buildCar();
		Car bmw = carFactory.getCar();

		System.out.println("奔驰: " + bens);
		System.out.println("宝马: " + bmw);
	}

}
