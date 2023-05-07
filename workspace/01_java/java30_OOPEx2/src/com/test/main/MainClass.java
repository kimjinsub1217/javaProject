package com.test.main;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 동물원 객체를 생성한다.
		ZooClass zooClass =new ZooClass(scanner);
        
        // 입력받은 동물의 타입 번호
        int typeNumber = 0;
        
        // 입력 받는 동물 번호가 0이 아닌 동안 반복한다.
        do {
            // 동물 타입 번호를 입력받는다.

            // 동물 타입 번호가 0이 아니라면...

            // 동물의 이름을 입력받는다.

            // 동물 객체를 생성한다.

            // 동물 객체를 담아준다.
        } while(typeNumber != 0);
		scanner.close();

	}

}

	
