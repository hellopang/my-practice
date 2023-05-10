package com.psh.builder.car;

import lombok.*;

/**
 * 最终要建造的产品
 *
 * @author psh 2023/5/9 23:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

	/**
	 * 制造商
	 */
	private String make;

	/**
	 * 型号
	 */
	private String model;

	/**
	 * 生产年份
	 */
	private int year;

	/**
	 * 车身颜色
	 */
	private String color;

	/**
	 * 座位数量
	 */
	private int seats;

	/** ========= builder ========== */
	public static CarBuilder builder() {
		return new CarBuilder();
	}

	@NoArgsConstructor
	public static class CarBuilder {

		private String make;

		private String model;

		private int year;

		private String color;

		private int seats;

		public CarBuilder make(String make) {
			this.make = make;
			return this;
		}

		public CarBuilder model(String model) {
			this.model = model;
			return this;
		}

		public CarBuilder year(int year) {
			this.year = year;
			return this;
		}

		public CarBuilder color(String color) {
			this.color = color;
			return this;
		}

		public CarBuilder seats(int seats) {
			this.seats = seats;
			return this;
		}

		public Car build() {
			return new Car(this.make, this.model, this.year, this.color, this.seats);
		}

	}

}
