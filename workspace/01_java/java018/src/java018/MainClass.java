package java018;

public class MainClass {

	public static void main(String[] args) {
		Cat c =new Cat();
		Dog d = new Dog();
		
		c.cry();
		d.cry();
		
		

	}

}

interface Animal {
	public abstract void cry();
}

class Cat implements Animal{

	@Override
	public void cry() {
		System.out.println("야용~");
		
	}
	
}

class Dog implements Animal{

	@Override
	public void cry() {
		System.out.println("멍멍~");	
	}
}


