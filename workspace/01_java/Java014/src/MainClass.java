
public class MainClass {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();

	}

}

class Parent{
	int x=10;
}

class Child extends Parent{
	int x=20;
	
	void method() {
		System.out.println("x="+x);//Child의 멤버변수 x의 20이 출력됨
		System.out.println("this.x="+this.x);//Child에 선언된 멤버변수가 출력됨
		System.out.println("super.x="+super.x);//Parent에서의 멤버변수 x의 10이 출력됨
		
	}
}
