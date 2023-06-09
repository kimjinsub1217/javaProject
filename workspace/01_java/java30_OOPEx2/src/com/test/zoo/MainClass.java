package com.test.zoo;

// 동물원
// 모든 클래스는 com.test.zoo 라는 패키지에 만들어준다.
// 동물들의 특징은 다음과 같다.
// 코끼리
// 다리 : 4개, 코 : 길다, 몸 : 크다, 식사방법 : 코를 이용해 먹는다.
// 사막여우
// 다리 : 4개, 코 : 짧다, 몸 : 작다, 식사방법 : 손을 이용해 먹는다.
// 캥거루
// 다리 : 2개, 코 : 짧다, 몸 : 크다, 식사방법 : 나뭇잎을 뜯어 먹는다.
// 다리, 코, 몸, 식사방법은 변수로 정의한다.
// 각 동물은 자신의 정보를 출력하는 메서드를 가지고 있다.

// 예시
// 동물의 종류를 입력해주세요
// 1. 코끼리, 2. 사막여우, 3. 캥거루, 0. 입력끝 : 1
// 동물의 이름을 입력해주세요 : 맘모스
// 위의 입력을 0을 입력할 때 까지 반복한다....
// 0을 눌러 입력이 끝나면 모든 동물의 정보를 출력한다.
// 타입 : 코끼리
// 이름 : 맘모스
// 다리 : 4개
// 코 : 길다
// 몸 : 크다
// 식사방법 : 손을 이용해 먹는다.
// .......
import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<Animal>();// Animal 객체를 담는 ArrayList 생성
       
        
        int input;

        // do~while : 최소한 1번 실행 하지만 0만나면
        do {
            System.out.println("동물의 종류를 입력해주세요.");
            System.out.println("1. 코끼리, 2. 사막여우, 3. 캥거루, 0. 입력끝");
            input = scanner.nextInt();

            if (input == 1) { //코끼리 입력
                System.out.print("동물의 이름을 입력해주세요 : ");
                String name = scanner.next();
                animals.add(new Elephant(name));
            } else if (input == 2) { //사막여우 입력
                System.out.print("동물의 이름을 입력해주세요 : ");
                String name = scanner.next();
                animals.add(new FennecFox(name));
            } else if (input == 3) { //캥거루 입력
                System.out.print("동물의 이름을 입력해주세요 : ");
                String name = scanner.next();
                animals.add(new Kangaroo(name));
            }
        } while (input != 0);

        System.out.println("입력이 끝났습니다.");
        
     // animals ArrayList에 있는 동물들의 정보 출력
        for (Animal animal : animals) {
            System.out.println("타입 : " + animal.type);
            System.out.println("이름 : " + animal.name);
            System.out.println("다리 : " + animal.legs + "개");
            System.out.println("코 : " + animal.nose);
            System.out.println("몸 : " + animal.body);
            System.out.println("식사방법 : " + animal.eatingHabits);
            System.out.println();
        }
    }
}

 class Animal {
	
    String type;
    String name;
    int legs;
    String nose;
    String body;
    String eatingHabits;
    
 // 생성자 메서드 : Animal 객체를 생성할 때 인스턴스 변수들을 초기화한다.
    public Animal(String type, String name, int legs, String nose, String body, String eatingHabits) {
        this.type = type;
        this.name = name;
        this.legs = legs;
        this.nose = nose;
        this.body = body;
        this.eatingHabits = eatingHabits;
    }
}

 //Animal 상속 다형성 이용
class Elephant extends Animal {
    public Elephant(String name) {
        super("코끼리", name, 4, "길다", "크다", "손을 이용해 먹는다.");
    }
}

class FennecFox extends Animal {
    public FennecFox(String name) {
        super("사막여우", name, 4, "짧다", "작다", "손을 이용해 먹는다.");
    }
}

class Kangaroo extends Animal {
    public Kangaroo(String name) {
        super("캥거루", name, 2, "길다", "작다", "나뭇잎을 먹는다.");
    }
}

