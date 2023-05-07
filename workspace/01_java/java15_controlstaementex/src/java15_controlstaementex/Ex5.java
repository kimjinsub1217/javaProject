package java15_controlstaementex;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		// 사용자에게 숫자를 입력 받아 그 숫자의 배수 100개를 출력한다.
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int number = scan.nextInt();

		for (int i = 1; i <= 100; i++) {
			System.out.print(number * i + " ");
		}
		scan.close();

	}

}
