package java15_controlstaementex;

import java.util.*;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자에게 숫자를 입력 받아 2에서 부터 그 숫자까지의 범위 안에서
		// 소수(1과 자기 자신으로만 나눠지는 수)를 모두 출력한다.

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int number = scan.nextInt();
		int cnt = 0;
		for (int i = 2; i <= number; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}

			if (cnt == 0) {
				System.out.print(i + " ");
			}
			cnt = 0;

		}
		scan.close();
	}

}
