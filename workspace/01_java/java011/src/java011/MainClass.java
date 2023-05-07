package java011;

public class MainClass {

	public static void main(String[] args) {
		Tv t = new Tv(); // Tv의 인스턴스를 생성 후 변수 t에 참조한다.
		t.channel = 7; // Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
		t.channelDown();// Tv의인스턴스의 메서드 channelDown()을 호출한다.

		System.out.println(t.channel + "번");

	}

}

class Tv {

	// Tv의 속성 (멤버변수)
	String color; // 색상
	boolean power; // 전원상태(on/off)
	int channel; // 채널

	// TV의 기능 ( 메서드)
	void power() {
		power = !power;
	} // TV를 켜거나 끄는 기능을 하는 메서드

	void channelUp() {
		++channel;
	} // TV의 채널을 올리는 기능을 하는 메서드

	void channelDown() {
		--channel;
	}// TV의 채널을 내리는 기능을 하는 메서드

}
