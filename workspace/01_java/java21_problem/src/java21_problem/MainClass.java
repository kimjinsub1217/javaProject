package java21_problem;

import java.util.Scanner;



public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student sdt = new Student();
		int sumk =0;
		int sumE =0;
		int sumM =0;
		
		double avgK =0;
		double avgE =0;
		double avgM =0;
		
        for (int i = 0; i < 3; i++) {
            System.out.print("이름 : ");
            sdt.name = scan.next();

            System.out.print("학년 : ");
            sdt.grade = scan.nextInt();

            System.out.print("국어 : ");
            sdt.kor = scan.nextInt();

            System.out.print("영어 : ");
            sdt.eng = scan.nextInt();

            System.out.print("수학 : ");
            sdt.math = scan.nextInt();

            System.out.println();
            sumk = sumk + sdt.kor;
            sumE = sumE + sdt.eng;
            sumM = sumM + sdt.math;

        }
        avgK = sumk / 3;
        avgE = sumE / 3;
        avgM = sumM / 3;

        System.out.println("과목별 총점");
        System.out.printf("국어 : %d\n", sumk);
        System.out.printf("영어 : %d\n", sumE);
        System.out.printf("수학 : %d\n", sumM);

        System.out.println();

        System.out.println("과목별 평균");
        System.out.printf("국어 : %.2f\n", avgK);
        System.out.printf("영어 : %.2f\n", avgE);
        System.out.printf("수학 : %.2f\n", avgM);

	}

}
//강사님 코드
/*public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        // Avg 객체 생성
        Avg avg = new Avg();
        // 학생 수 만큼 객체를 생성한다.
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        // 입력받는다.
        s1.inputStudentInfo(scanner);
        s2.inputStudentInfo(scanner);
        s3.inputStudentInfo(scanner);
        
        // 학생 정보를 출력한다
        s1.printStudentInfo();
        s2.printStudentInfo();
        s3.printStudentInfo();
        
        // 과목별 총점과 평균을 구해 출력한다.
        avg.printPointTotal(s1, s2, s3);
        avg.printPointAvg();
    }

}

// 학생 클래스
class Student{
    // 이름
    String name;
    // 학년
    int grade;
    // 국어
    int korean;
    // 영어
    int english;
    // 수학
    int math;
    // 학생의 정보를 출력하는 메서드
    public void printStudentInfo() {
        System.out.printf("이름 : %s\n", name);
        System.out.printf("학년 : %d\n", grade);
        System.out.printf("국어 : %d\n", korean);
        System.out.printf("영어 : %d\n", english);
        System.out.printf("수학 : %d\n", math);
    }
    
    // 학생의 정보를 입력받는 메서드
    public void inputStudentInfo(Scanner scanner) {
        // 입력받는다
        System.out.print("이름 : ");
        name = scanner.next();
        System.out.print("학년 : ");
        grade = scanner.nextInt();
        System.out.print("국어 : ");
        korean = scanner.nextInt();
        System.out.print("영어 : ");
        english = scanner.nextInt();
        System.out.print("수학 : ");
        math = scanner.nextInt();
    }
}

1. 문제 분석
2. 기능 정리
3. 기능 구현을 위해 필요한 변수
4. 클래스를 설계(주석)
5. 클래스 내부의 변수와 메서드를 정의
 * 
 * 
 */
