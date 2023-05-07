package com.test.car;

import java.util.Scanner;

public class CarClass {
	Scanner scanner;
	
	// 자동차 객체들을 담을 배열
	public CarsClass [] carsClassArray;
	// 자동차 갯수
	public int carsCount;
	
	public CarClass(Scanner scanner) {
		this.scanner = scanner;
		carsClassArray = new CarsClass[1000];
		carsCount = 0;
	}
	
	// 자동차를 추가하는 메서드
	public void addAnimal(CarsClass Cars) {
		carsClassArray[carsCount] = Cars;
		carsCount++;
	}
	
	// 입력한 차들의 정보를 출력하는 메서드
	public void printAnimalInfo() {
		// 차의 수 만큼 반복한다.
		for(int i = 0 ; i < carsCount ; i++) {
			CarsClass car = carsClassArray[i];
			car.printInfo();
			car.howStartCar();
			System.out.println();
		}
	}
}
