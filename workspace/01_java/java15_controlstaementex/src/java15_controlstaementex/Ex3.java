package java15_controlstaementex;

public class Ex3 {

	public static void main(String[] args) {

		// 문제1)
		// 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4)
		// + (1 + 2 + 3 + 4 + 5) + ... + (1 + 2 + ... + 9 + 10)
		// 의 총 합을 출력하세요
		int hap = 0; //합을 담기 위한 변수
		for (int i = 1; i <= 11; i++) {
			for (int j = 1; j < i; j++) { 
//				System.out.print(j + " ");
				hap += j;
			}
//			System.out.println("합계" + hap);
//			System.out.println();

		}

		System.out.println(hap);
		System.out.println("---------------------------------");

		// 문제2)
		// 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + ...
		// 이런식으로 더했을 때 몇 까지 더해야지 총 합이 100 이상이 되는지 구하세요.

		int i = 1;
		int hap2 = 0;
		int minus = 0;
		int answer = 0;
		while (true) {
			if (i % 2 == 0) { //2의 배수면
				minus = i * -1; // 음수로 변환 2 * -1 = -2
//				System.out.println(minus);
				hap2 += minus; 
			} else { 
//				System.out.println(i);
				hap2 += i;
			}

			if (hap2 >= 100) {//만약 hap2가 100보다 크거나 같을 때
				answer = i; 
				break;
			}
			i++;
		}
//		System.out.println(hap2);
		System.out.println(i);
		System.out.println("---------------------------------");

		// 문제3)
		// 방정식 2x + 4y = 10 에서 가능한 모든 x, y 의 조합을 출력하세요
		// 단, x는 0 ~ 10, y는 0 ~ 10 까지 이다.
		for (int x = 0; x <= 10; x++) { // x는 0 ~ 10
			for (int y = 0; y <= 10; y++) {// y는 0 ~ 10
				if ((2 * x) + (4 * y) == 10) {// 만약 (2 * x) + (4 * y) = 10이면
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}

}
