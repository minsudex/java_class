package ch02;

public class Ex03_AssignmentOperator {

	public static void main(String[] args) {
		int num1 = 10, num2 = 7;
		System.out.println("num1; "+ num1 + "num2; " + num2);
		// 대입연산자 활용
		num1 += num2; // num1 = num1 + num2;
		System.out.println("num1: " + num1 + " num2: " + num2); // num1:17 , num2:7
		num1 += num2; // num1 = num1 + num2;
		System.out.println("num1: " + num1 + " num2: " + num2); // num1:24 , num2:7
		num1 -= num2; // num1 = num1 - num2;
		System.out.println("num1: " + num1 + " num2: " + num2); // num1:17 , num2:7
		num1 *= num2;
		System.out.println("num1: " + num1 + " num2: " + num2); // num1:119 , num2:7
		num1 /= num2;
		System.out.println("num1: " + num1 + " num2: " + num2); // num1:17 , num2:7


		// 대입연산자
		// +=, -=. *=, /=
		int a = 10;
		a += 1;
		System.out.println(a); // 11
		a -= 2;
		System.out.println(a); // 9
		a *= 3;
		System.out.println(a); // 27
		a /= 2;
		System.out.println(a); // 13
	}
}