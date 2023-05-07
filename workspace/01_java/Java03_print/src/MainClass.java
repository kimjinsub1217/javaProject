
public class MainClass {

	public static void main(String[] args) {
		// ( ) 안에 내용을 출력하고 한줄 내려준다.
		System.out.println("안녕하세요 반갑습니다.");
		System.out.println("날씨가 흐려요");
		
		// ( ) 안의 내용을 출력하고 한 줄 내려주지 않는다.
		System.out.print("안녕");
		System.out.print("하세요");
		
		//System.out.println 사용시 아무 것도 지정하지 않으면 
		//아무런 내용을 출력하지 않고 밑으로 내려준다.
		System.out.println();
		System.out.println("맥도날드");
		
		//다양한 형태의 값을 지원한다.
		System.out.println(100);
		System.out.println(11.11);
		
		//문자열과 문자열을 더하면 하나의 문자열이 된다.
		System.out.println("문자열1 + 문자열2");
		
		//문자열과 문자열이 아닌 것을 더하면 문자열이 아닌 것이
		//문자열로 변환되고 문자열 + 문자열을 수행하다.
		System.out.println("정수 : " +100);
		
	}

}
