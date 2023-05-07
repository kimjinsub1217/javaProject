package java15_controlstaementex;

import java.util.*;

public class Ex7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("주빈번호 13자리를 입력해주세요(-없이) : ");
		long number = scan.nextLong();
		scan.close();

		// 각 자리수를 뜯어낸다.
		long a1 = number / 1000000000000L;
		number = number % 1000000000000L;

		long a2 = number / 100000000000L;
		number = number % 100000000000L;

		long a3 = number / 10000000000L;
		number = number % 10000000000L;

		long a4 = number / 1000000000L;
		number = number % 1000000000L;

		long a5 = number / 100000000L;
		number = number % 100000000L;

		long a6 = number / 10000000L;
		number = number % 10000000L;

		long a7 = number / 1000000L;
		number = number % 1000000L;

		long a8 = number / 100000L;
		number = number % 100000L;

		long a9 = number / 10000L;
		number = number % 10000L;

		long a10 = number / 1000L;
		number = number % 1000L;

		long a11 = number / 100L;
		number = number % 100L;

		long a12 = number / 10L;
		long a13 = number % 10L;
		long total = (a1 * 2) + (a2 * 3) + (a3 * 4) + (a4 * 5) + (a5 * 6) + (a6 * 7) + (a7 * 8) + (a8 * 9) + (a9 * 2)
				+ (a10 * 3) + (a11 * 4) + (a12 * 5);

		long total2 = total % 11;
		long total3 = 11 - total2;
		long total4 = total3 % 10;

	} 

} 
