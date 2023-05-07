package java15_controlstaementex;

public class Ex2 {

	public static void main(String[] args) {
		// 출력 예시와 똑같이 출력
		// 문제1)
		// 1 2 3
		// 4 5 6
		// 7 8 9

		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " ");
			if (i % 3 == 0) {
				System.out.print("\n");
			}

		}

		System.out.print("\n");
		// 문제2)
		// 3 2 1
		// 6 5 4
		// 9 8 7

		for (int i = 3; i <= 9; i += 3) {
			System.out.print(i + " ");
			System.out.print(i - 1 + " ");
			System.out.println(i - 2 + " ");

		}
		System.out.print("\n");
		// 문제3)
		// 1 4 7
		// 2 5 8
		// 3 6 9
		System.out.print("\n");
		for (int i = 1; i <= 3; i++) {
			System.out.print(i + " ");
			System.out.print(i + 3 + " ");
			System.out.println(i + 6 + " ");

		}

		// 문제4)
		// *
		// * *
		// * * *
		System.out.print("\n");
		for (int i = 1; i <= 3; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}

		// 문제5)
		// 	   *
		//   * *
		// * * *

		System.out.print("\n");
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j > 0; j--) {
				if (i < j) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.print("\n");
		}

		// 문제6)
		// *   *
        //   *
        // *   *
		System.out.print("\n");
		for (int i = 1; i <= 9; i++) {
			if(i%2==1) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
			
			if(i%3==0) {
				System.out.println();
			}
		}

	}

}
