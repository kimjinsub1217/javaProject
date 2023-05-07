package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];	//길이가 3인 Tv객체 배열
		
		//Tv 객체를 생성해서 Tv 객체 배열의 각 요소에 저장
		for(int i=0; i<tvArr.length;i++) {
			tvArr[i] = new Tv(); // tvArr의 객체 배열의 인스턴스를 생성한
			tvArr[i].channel = i+10;
		}
		
		for(int i=0; i<tvArr.length;i++) {
			tvArr[i].channelDown(); //tvArr 0, 1, 2 방에 채널을 내려준다.
			System.out.printf("tvArr[%d].channel=%d%n", i,tvArr[i].channel);
		}
	}

}

class Tv{
	String color; //색상
	boolean power; //전원상태(on/off)
	int channel; //채널
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
