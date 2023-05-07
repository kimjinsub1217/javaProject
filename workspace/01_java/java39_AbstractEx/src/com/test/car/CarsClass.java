package com.test.car;

public abstract class CarsClass {
	// 자동차의 종류
	protected String vehicleType;
	// 이름
	protected String name;
	// 가격
	protected String price;
	// 자동차 색상
	protected String autoColor;

	// 시동 방법
	public abstract void howStartCar();

	// 출력
	public void printInfo() {
		System.out.printf("자동차 종류 : %s\n", vehicleType);
		System.out.printf("이름 : %s\n", name);
		System.out.printf("가격 : %s\n", price);
		System.out.printf("색상 : %s\n", autoColor);
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setAutoColor(String autoColor) {
		this.autoColor = autoColor;
	}

}
