package ch03_Scanner;

import java.util.Scanner;

public class Ex02_Calculator {

	public static void main(String[] args) {
		/**
		* 정수 2개를 각각 스캐너로 num1, num2애 입력받아서 입력받은 수의 합을 출력하새요.
		*/
		Scanner scanner= new Scanner(System.in);
		System.out.println("첫번째 숫자: ");
		int num1 = scanner.nextInt();
		System.out.println("두번째 숫자:");
		int num2 = scanner.nextInt();
		int sum = num1 + num2;
		System.out.println("합계: " + sum);
		
		scanner.close();
	}
}