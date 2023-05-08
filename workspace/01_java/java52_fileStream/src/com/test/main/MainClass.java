package com.test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass {

	public static void main(String[] args) {
		// stream : 데이터를 외부와 읽고 쓸 수 있도록 제공되는

		// 자바 클래스들
		// 기본스트림
		// 데이터를 직접 읽고 쓸 수 있는 스트림들
		// InputStream과 OutputStream을 상속받고 있다.
		// 필터스트림
		// 기본 스트림들의 보조 역할을 하며 주 목적이 데이터를 가공하는 것이다.

		// saveData1();
		// saveData2();
		readData();
	}

	// 데이터 저장
	public static void saveData1() {
		try {
			// 파일을 쓰기 위한 스트림을 생성한다.
			// 이미 파일이 있다면 파일의 내용을 모두 지우고 새로 쓴다.
			// 파일이 없다면 파일을 생성해준다.
			FileOutputStream fos = new FileOutputStream("test.txt");

			// 쓰기할 데이터를 준비한다.
			String value1 = "안녕하세요";

			// 데이터를 바이트 형태로 가공한다.
			byte[] data1 = value1.getBytes();

			// 데이터를 쓴다.
			fos.write(data1);
			// 출력버퍼에 데이터가 남아 있을 수도 있기 때문에
			fos.flush();
			// 닫아준다.
			fos.close();
			System.out.println("쓰기 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void saveData2() {
		try {
			// 파일을 쓰기 위한 스트림을 생성한다.
			// 이미 파일이 있다면 기존 내용에 이어서 작성한다.
			// 파일이 없다면 파일을 생성해준다.
			FileOutputStream fos = new FileOutputStream("test2.txt", true);

			// 쓰기할 데이터를 준비한다.
			String value1 = "안녕하세요\n";

			// 데이터를 바이트 형태로 가공한다.
			byte[] data1 = value1.getBytes();

			// 데이터를 쓴다.
			fos.write(data1);
			// 출력버퍼에 데이터가 남아 있을 수도 있기 때문에
			fos.flush();
			// 닫아준다.
			fos.close();
			System.out.println("쓰기 완료 2");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 읽어오기
	public static void readData() {
		try {
			// FileInputStream을 생성한다.
			// 지정한 파일이 없으면 오류가 발생한다.
			FileInputStream fis = new FileInputStream("test2.txt");
			// 읽어올 데이터의 양(파일 용량 byte)를 구한다.
			int byteSize = fis.available();
			// 데이터 담을 바이트 배열을 만들어준다.
			// System.out.println(byteSize);

			// 데이터를 담을 byte 타입의 배열을 생성한다.
			byte[] byteArray = new byte[byteSize];
			// 데이터를 읽어온다.
			fis.read(byteArray);
			// 닫아준다
			fis.close();

			// 문자열 객체를 생성한다.
			String str1 = new String(byteArray);
			System.out.println(str1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
