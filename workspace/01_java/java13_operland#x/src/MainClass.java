
public class MainClass {

	public static void main(String[] args) {
		
		
	    // 문제1
        // 다음 변수에 저장되어 있는 값이 짝수면 "짝수"를
        // 홀수면 "홀수"를 결과하는 3항 연산 식을 작성하세요.
        int a1 = 123;
		System.out.println( a1%2==0 ? "a1는 짝수입니다." : "a1는 홀수입니다");
		
		 // 문제2
        // 다음 변수에 저장되어 있는 값을 십의 자리 이하를 버리는
        // 코드를 작성하여 출력한다.
        // 예) 421 -> 400
        int a2 = 421;
        int num =(a2/100)*100;
        
        System.out.println(num);
        

        // 문제3
        // 다음 변수에 저장되어 있는 값을 각 자리별로 뜯어내어 출력한다.
        // 예) 123
        // 1
        // 2
        // 3
        int a3 = 123;
        
        System.out.println("100의자리 : "+a3/100);
        System.out.println("10의자리 : "+(a3%100)/10);
        System.out.println("1의자리 : "+(a3%100)%10);

        // 문제4)
        // 주어진 화씨 온도를 섭씨 온도로 계산한다.
        // 섭씨온도 = 5 / 9 x (회씨온도 - 32)
        int a4 = 100;
        double celsius =  ((double)5/9*(a4-32));
        
        System.out.printf("섭씨 온도는 : %2f\n",celsius);


        // 문제5)
        // 다음에 주어진 대문자 알파벳을 소문자로 바꿔서 출력한다.
        // 대문자 A는 65이고, 소문자 a는 정수로 97이다.
        char a5 = 'C';
        char small_letter = (char) (a5+32);
        System.out.println(small_letter);
		

	}

}
