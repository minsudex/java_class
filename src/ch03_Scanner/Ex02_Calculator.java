package ch03_Scanner;

import java.util.Scanner;

public class Ex02_Calculator {

	public static void main(String[] args) {
		/**
		* 정수 2개를 각각 스캐너로 num1, num2애 입력받아서 입력받은 수의 합을 출력하새요.
		*/
		// 두 개의 정수 입력받아 합계를 출력하는 프로그램

		// Scanner 객체 생성								// Scanner 클래스는 키보드 입력을 읽어오는 기능을 제공한다.
														//// new 키워드를 사용하여 Scanner 객체를 생성하고,
														//// System.in 인스턴스를 매개변수로 전달한다.
		Scanner scanner= new Scanner(System.in);
		// 첫 번째 숫자 입력
		System.out.println("첫번째 숫자: ");
		int num1 = scanner.nextInt();
		// 두 번째 숫자 입력
		System.out.println("두번째 숫자:");
		int num2 = scanner.nextInt();
		// 두 수의 합 계산
		int sum = num1 + num2;
		// 합계 출력
		System.out.println("합계: " + sum);
		
		scanner.close();
	}
}