package java11_variableEx;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1)
        // 다음 중 기본 자료형에서 바이트 수에 맞는 자료형을 ( )안에 작성하세요
        // 없는 것은 X 를 넣어주세요
        // 논리형 : 1 byte - (boolean), 2 byte - (x ), 4 byte - (x ), 8 byte - (x )
        // 문자형 : 1 byte - ( x), 2 byte - (char ), 4 byte - ( x), 8 byte - ( x)
        // 정수형 : 1 byte - ( byte), 2 byte - ( short,char), 4 byte - ( int), 8 byte - ( long)
        // 실수형 : 1 byte - (x ), 2 byte - ( x), 4 byte - (float ), 8 byte - (double )

        // 문제2)
        // 주민등록 번호를 13자리를 정수형 값으로 변수에 저장하고자 한다.
        // 변수에 저장하고 저장된 변수의 값을 출력하는 코드를 작성해주세요
		Long number = 1212121212121L;
        System.out.printf("주민등록 번호 : %d\n", number);

        // 문제3)
        // 다음에 정의된 변수의 값을 다른 변수의 담으려고 한다.
        // 오류 없이 실행될 수 있도록 코드를 작성해주세요
        byte b = 10;
        char ch = 'A';
        short s = 50;
        int i = 100;
        long l = 1000L;
        
    
        // 변수 b의 값을 int 타입의 a1 변수에 저장하고 출력하세요
        int a1 = b;
        System.out.printf("a1 : %d\n", a1);
        
        // 변수 l의 값을 int 타입의 a2 변수에 저장하고 출력하세요
        int a2 = (int)l;
        System.out.printf("a2 : %d\n", a2);
        
        // 변수 s의 값을 char 타입의 a3 변수에 저장하고 문자로 출력하세요
        char a3 =(char)s;
        System.out.printf("a3 : %c\n", a3);
        		
        // 변수 ch의 값을 byte 타입의 a4 변수에 저장하고 출력하세요
        byte a4 =(byte)ch;
        System.out.printf("a4 : %d\n", a4);
	}

}
