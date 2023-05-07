package java15_controlstaementex;
import java.util.*;
public class Ex4 {

	public static void main(String[] args) {
		// 사용자에게 숫자를 입력 받아 그 숫자 까지의 총합을 구한다.
		
		
		// 입력받은 숫자까지 반복한다.

		// 누적한다.
		//사용자에게 숫자를 입력한다.
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int number =scan.nextInt();
		
		//누적값을 가지고 있을 변수
		int total = 0;
		
		//입력받을 숫자까지 반복한다.
		
		for(int i =1; i<=number ; i++) {
			total+=i;
		}
		
		System.out.printf("총합: %d\n",total);
		scan.close();
		
		
		
	}

}
