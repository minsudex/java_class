package ch03_Scanner;

import java.util.Scanner;

// java.util 패키지에 소속된 Scanner 클래스를 가져옴.
public class Ex01_Scanner {

	public static void main(String[] args) {
		// scanner 라는 이름의 Scanner 쿨래스 객체 선언
		Scanner scanner= new Scanner(System.in);
//		System.out.println("숫자를 입력하세요; ");
//		int num1 = scanner.nextInt();
//		System.out.println("숫자를 입력하세요; ");
//		int num2 = scanner.nextInt();
//		int sum = (num1+num2);
//		System.out.println("합계: " + sum);
//
//		scanner.close();


		// Scanner sc = new Scanner(System.in);
		// 변수 선언
		// 변수타입 변수이름 = 값;
		// 변수의 타입 : Scanner
		// 변수의 이름 : sc
		// 값 : new Scanner(System.in)

		int a = scanner.nextInt(); // 숫자를 입력받아 a에 저장하겠다.
		String b = scanner.next();scanner.nextLine(); // 띄어쓰기 불가능
		String c = scanner.nextLine(); // 띄어쓰기 가능

		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);


	}

}
