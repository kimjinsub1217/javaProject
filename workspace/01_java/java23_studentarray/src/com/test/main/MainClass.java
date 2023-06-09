package com.test.main;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// 학교 객체를 생성한다.
		School school = new School();

		// 학생 수를 입력받는다.
		school.inputStudentCount(scan);
		// 학생 데이터를 입력받는다.
		school.inputStudentInfo(scan);
		System.out.println();
		
		//학생 정보를 출력한다.
		school.printStudentInfo();
		System.out.println();
		//총점을 구하고 출력한다.
		school.printPointTotal();
		
		//평균을 구하고 출력한다.
		school.printPointAvg();
		scan.close();

		// 학생 수만큼 객체 생성
//		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = new Student();
//		Student[] array3 = new Student[3];
//
//		array3[0] = new Student();
//		array3[1] = new Student();
//		array3[2] = new Student();
//
//		// 입력 받는다
//		array3[0].inputStudentInfo(scan);
//		array3[1].inputStudentInfo(scan);
//		array3[2].inputStudentInfo(scan);
//
//		// 학생 정보를 출력
//		array3[0].printStudentInfo();
//		array3[1].printStudentInfo();
//		array3[2].printStudentInfo();
//
//		// 과목별 총점, 평균을 구한다
//		avg.printPointTotal(array3[0], array3[1], array3[2]);
//		avg.printPointAvg();

	}

}

class School {
	// 학생수
	int studentCount = 3;

	int koreanTotal = 0;
	int englishTotal = 0;
	int mathTotal = 0;
	// 학생 정보를 담을 배열의 변수
	Student[] studentArray;

	// 학생 수를 입력받는 메서드
	public void inputStudentCount(Scanner scanner) {
		System.out.print("학생 수 : ");
		studentCount = scanner.nextInt();

		// 배열을 생성한다.
		studentArray = new Student[studentCount];
		// 학생의 수 만큼 객체를 생성한다.
		for (int i = 0; i < studentCount; i++) {
			studentArray[i] = new Student();
		}
	}

	// 학생의 정보를 입력받는 메서드
	public void inputStudentInfo(Scanner scanner) {
		// 학생의 수 만큼 반복한다.
		for (Student s1 : studentArray) {
			s1.inputStudentInfo(scanner);
		}
	}

	// 과목별 총점을 구하는 메서드
	public void printPointTotal() {
		// 변수 초기화
		koreanTotal = 0;
		englishTotal = 0;
		mathTotal = 0;

		// 학생의 수 만큼 박복
		for (Student s1 : studentArray) {
			koreanTotal = koreanTotal + s1.k;
			englishTotal = englishTotal + s1.e;
			mathTotal = mathTotal + s1.m;
		}

		System.out.printf("국어 총점 : %d\n", koreanTotal);
		System.out.printf("영어 총점 : %d\n", englishTotal);
		System.out.printf("수학 총점 : %d\n", mathTotal);
	}
	
	//학생의 정보를 출력하는 메서드
	 public void printStudentInfo() {
	        // 학생의 수 만큼 반복한다.
	        for(Student s1 : studentArray) {
	            s1.printStudentInfo();
	        }
	    }
	

	// 과목별 평균을 구하고 출력하는 메서드
	public void printPointAvg() {

		double koreanAvg = koreanTotal / studentCount;
		double englishAvg = englishTotal / studentCount;
		double mathAvg = mathTotal / studentCount;

		System.out.printf("국어 평균 : %.2f\n", koreanAvg);
		System.out.printf("영어 평균 : %.2f\n", englishAvg);
		System.out.printf("수학 평균 : %.2f\n", mathAvg);
	}

}

class Student {

	String name;

	int grade;
	int k;
	int e;
	int m;

	// 학생의 정보를 출력하는 메서드
	public void printStudentInfo() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("학년 : %d\n", grade);
		System.out.printf("국어 : %d\n", k);
		System.out.printf("영어 : %d\n", e);
		System.out.printf("수학 : %d\n", m);
	}

	public void inputStudentInfo(Scanner scan) {
		System.out.print("이름 : ");
		name = scan.next();

		System.out.print("학년 : ");
		grade = scan.nextInt();

		System.out.print("국어 : ");
		k = scan.nextInt();

		System.out.print("영어 : ");
		e = scan.nextInt();

		System.out.print("수학 : ");
		m = scan.nextInt();
	}

}