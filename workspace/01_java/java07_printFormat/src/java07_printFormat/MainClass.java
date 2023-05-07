package java07_printFormat;

public class MainClass {

	public static void main(String[] args) {
		System.out.printf("정수: %d, 실수:%f, 문자열 :%s\n", 100,11.11,"안녕하세요");
		
		//정수를 출력할 때 %c
		System.out.printf("%c\n", 65);

		//문자를 출력할 때 %d를 사용하는 경우
		//오류 발생
		//System.out.printf("%d\n", 'A');
		
		//%s를 사용하는 경우
		//%s에 설정될 값을 문자열로 변환한 다음 출력한다.
		 System.out.printf("%s, %s, %s, %s\n", 100, 11.11, 'A', true);
		 
		 //정수를 출력할 때 지정된 개수만큼 자리를 확보하고 우측 정렬로 출력한다.
		 System.out.printf("%d\n", 100);
		 System.out.printf("%d\n", 10000);
	     System.out.printf("%10d\n", 100);
	     System.out.printf("%10d\n", 10000);
	     
	     //정수를 출력할 때 지정된 개수만큼 자리를 확보하고 우측 정렬로 출력한다.
	     //남은 공간은 0으로 채워준다.
	     System.out.printf("%010d\n",100);
	     System.out.printf("%010d\n", 10000);
	     
	     //실수를 출력할 때 정수자리와 소수점 이하 자리의 개수를 설정해준다.
	     //10자리를 확보하고 뒤에 소수점 2자리 사용
	     System.out.printf("%10.2f\n",11111.1111);
	     
	     //문자열
	     //10자리를 확보하고 우측 정렬로 출력한다.
	     System.out.printf("%7s\n", "abc");
	     
	}
}
