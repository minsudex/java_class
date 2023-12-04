package ch04_if;

import java.util.Scanner;

public class Ex05_IfExample {

	public static void main(String[] args) {
		/**
		 *  정수 하나를 입력 받아서 양수, 음수, 0인지를 출력
		 */
		Scanner scanner= new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num1  = scanner.nextInt();
		
		if (num1 == 0) {
			System.out.println("0입니다");
		} else if (num1 > 0) {
			System.out.println("양수입니다");
		} else if (num1 < 0) {
			System.out.println("음수입니다");
		}	scanner.close();
	}	
}
