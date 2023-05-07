package java12;

class Data{int x;}
public class MainClass {

	public static void main(String[] args) {
		Car c = new Car("white","auto",2);
		Data d = new Data();
		d.x =10;
		System.out.println("main() : x = "+d.x);
		
		change(d);
		System.out.println("After change main() x =" + d.x);
	}

	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() x =" + d.x);
	}
}

class Car{
	String color;//색상
	String gearType;//변속기의 타입
	int door; //문의 갯수
	
	Car(){}//컴파일러가 자동으로 만들어주는 기본 생성자
	Car(String c, String g, int d){
		color =c;
		gearType =g;
		door =d;
	}
}
