package ch04_if;

import java.util.Scanner;

public class Ex08_IfExample {

	public static void main(String[] args) {
	/*
	 * 서로 다른 정수 3개를 입력받ㅇ아서 가장 큰 정수 출력하기
	 * (같은 숫자는 입력하지 않는다고 가정)
	 * 입력 예
	 * 	첫번째숫자:
	 * 	두번째숫자:
	 * 	세번쩨숫자:
	 * 
	 * 출력 예
	 * 	가장 큰 숫자는 00 입니다.
	 */
		Scanner scanner= new Scanner(System.in);
		System.out.println("첫번째숫자:");
		int num1 = scanner.nextInt();
		System.out.println("두번째숫자:");
		int num2 = scanner.nextInt();
		System.out.println("세번째숫자:");
		int num3 = scanner.nextInt();
		
//		int max= 0;
//		if (num1 > num2) {
//			if (num1 > num3) {
//				max = num1;
//			} else { //else if (num1 < num3)
//				max = num3;
//			}
//		} else  { //else if (num1 < num2)
//			if (num2 >num3) {
//				max = num2;
//			} else  { //else if (num2 < num3)
//				max = num3;
//			}
//		}
//		System.out.println("가장 큰 숫자는 "+ max +" 입니다.");

	}
}