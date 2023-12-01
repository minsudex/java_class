package ch02;

public class ex01_ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 10;
		System.out.print("덧셈결과;" + (num1 + num2));
		System.out.print("덧셈결과;" + (num1 + num2));
		System.out.print("덧셈결과;" + (num1 - num2));
		System.out.print("덧셈결과;" + (num1 * num2));
		System.out.print("덧셈결과;" + (num1 / num2));
		System.out.print("덧셈결과;" + (num1 % num2));
	
		int result = 0;
		result = num1 + num2;
		System.out.println(result);
		result = num1 - num2;
		System.out.println(result);
		result = num1 * num2;
		System.out.println(result);
		result = num1 / num2;
		System.out.println(result);
		result = num1 % num2;
		System.out.println(result);
	
	
	// 계산 결과 변수를 따로 선언
		int sumResult = num1 + num2;
		System.out.println(sumResult);
		int subResult = num1 - num2;
		System.out.println(subResult);
		int mulResult = num1 * num2;
		System.out.println(mulResult);
		int divResult = num1 / num2;
		System.out.println(divResult);
		int remainResult = num1 % num2;
		System.out.println(remainResult);
	}
}
