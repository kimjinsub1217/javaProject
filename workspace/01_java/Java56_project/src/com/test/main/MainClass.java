package com.test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * 조원 : 김진섭 , 장용진 ,천성민,신승헌
 */
public class MainClass {
	static ArrayList<StudentClass> list = new ArrayList<StudentClass>();
	static int totalKor = 0;// 국어 총점
	static int totalEng = 0;// 영어 총점
	static int totalMath = 0;// 수학 총점

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		do {

			System.out.println("");
			System.out.print("1. 학생정보 입력, 2. 학생정보 검색, 3. 과목별 총점 출력, 4. 과목별 평균 출력  5. 종료 : ");

			num = sc.nextInt();
			switch (num) {
			case 1:
				StudentInput(sc);
				break;
			case 2:
				studentInformationSearch(sc);
				break;
			case 3:
				totalScoreOutputSubject();
				break;
			case 4:
				averageOutputSubject();
				break;
			case 5:
				System.out.println("종료되었습니다!");
				break;
			default:
				System.out.println("1 ~ 5번 숫자를 입력해 주세요.");
			}

		} while (num != 5);

	}

	// 학생정보 입력
	public static void StudentInput(Scanner sc) {

		try {
			// 기본 스트림
			FileOutputStream fos = new FileOutputStream("student.dat");
			// 객체 출력 스트림
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			System.out.println("주의! 조건에 안 맞으면 처음부터 다시 입력해야 돼요!");
			System.out.print("학생 이름을 입력하세요 (2 ~ 4자만 가능해요) : ");
			String name = sc.next();
			if (name.length()<2 || name.length()>4) {
				System.out.println ("2 ~ 4자만 가능해요");
				return;
			}

			System.out.print("학년을 입력하세요 (1학년부터 6학년까지만 입력 가능합니다.) : ");
			int grade = sc.nextInt();
			if (grade < 1 || grade > 6) {
				System.out.println("1학년부터 6학년까지만 입력 가능합니다.");
				return;
			}
			System.out.println("");
			System.out.println("국어, 영어, 수학은 0 ~ 100 사이 숫자만 가능해요!");
			System.out.print("국어 점수를 입력하세요 : ");
			int kor = sc.nextInt();
			if (kor < 0 || kor > 100) {
				System.out.println("0 ~ 100 사이 숫자만 가능해요 ");
				return;
			}
			
			System.out.print("영어 점수를 입력하세요 : ");
			int eng = sc.nextInt();
			if (eng < 0 || eng > 100) {
				System.out.println("0 ~ 100 사이 숫자만 가능해요 ");
				return;
			}
			System.out.print("수학 점수를 입력하세요 : ");
			int math = sc.nextInt();
			if (math < 0 || math > 100) {
				System.out.println("0 ~ 100 사이 숫자만 가능해요 ");
				return;
			}

			// 객체 생성
			StudentClass student = new StudentClass(name, grade, kor, eng, math);
			list.add(student);

			// 객체를 쓴다.
			oos.writeObject(list);

			oos.flush();
			oos.close();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 학생정보 검색
	@SuppressWarnings("unchecked")
	private static void studentInformationSearch(Scanner sc) {

		/// 2번을 누른다
		System.out.print("학생 이름을 입력하세요 : ");
		String name = sc.next();
		if (name.equals("모두")) {

			try {
				FileInputStream fis = new FileInputStream("student.dat");
				// 객체 읽기 스트림
				ObjectInputStream ois = new ObjectInputStream(fis);

				// 객체를 복원한다.

				ArrayList<StudentClass> list = (ArrayList<StudentClass>) ois.readObject();

				for (StudentClass std : list) {
					std.printData();
					System.out.println();
				}

				ois.close();
				fis.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (name.equals(name)) {
			try {
				FileInputStream fis = new FileInputStream("student.dat");
				// 객체 읽기 스트림
				ObjectInputStream ois = new ObjectInputStream(fis);

				// 객체를 복원한다.

				ArrayList<StudentClass> list = (ArrayList<StudentClass>) ois.readObject();

				for (StudentClass std : list) {
					if (std.name.equals(name)) {
						std.printData();
					}
				}
				ois.close();
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// 과목 총합
	private static void totalScoreOutputSubject() {

		try {
			FileInputStream fis = new FileInputStream("student.dat");
			// 객체 읽기 스트림
			ObjectInputStream ois = new ObjectInputStream(fis);

			// 객체를 복원한다.

			@SuppressWarnings("unchecked")
			ArrayList<StudentClass> list = (ArrayList<StudentClass>) ois.readObject();

			for (StudentClass std : list) {
				totalKor += std.kor;
				totalEng += std.eng;
				totalMath += std.math;
			}
			System.out.println("국어총점 : " + totalKor);
			System.out.println("영어총점 : " + totalEng);
			System.out.println("수학총점 : " + totalMath);
			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 과목별 평균
	private static void averageOutputSubject() {
		try {
			FileInputStream fis = new FileInputStream("student.dat");
			// 객체 읽기 스트림
			ObjectInputStream ois = new ObjectInputStream(fis);

			// 객체를 복원한다.

			@SuppressWarnings("unchecked")
			ArrayList<StudentClass> list = (ArrayList<StudentClass>) ois.readObject();

			System.out.println("국어평균 : " + totalKor / (double) list.size());
			System.out.println("영어평균 : " + totalEng / (double) list.size());
			System.out.println("수학평균 : " + totalMath / (double) list.size());
			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

//학생클래스
@SuppressWarnings("serial")
class StudentClass implements Serializable {
	String name;
	int grade;
	int kor;
	int eng;
	int math;

	StudentClass(String name, int grade, int kor, int eng, int math) {
		this.name = name;
		this.grade = grade;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void printData() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("학년 : %d\n", grade);
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);

	}

}
