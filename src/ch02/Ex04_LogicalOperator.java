package ch02;

public class Ex04_LogicalOperator {

	public static void main(String[] args) {
		// 놀리연산자
		System.out.println(true && true);
		System.out.println(false && false); //
		System.out.println(true || true);
		
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		
		System.out.println(bool1 && bool2);
		// bool2,bool3의 OR 연산 렬과를 result라는 변수에 담고 result 변수값 출력
		boolean result =bool2 || bool3;
		System.out.println(result);

		// num1, num2 정수형 변수에 각각 10, 20을 대입하여 선언하고
		int num1 = 10, num2 = 20;
		// num1 > num2 결과를 result1 에 저장하고
		boolean result1 = num1 > num2;
		// num1 != num2 결과를 result2 에 저장해서
		boolean result2 = num1 != num2;
		// result1 && result2 결과를 result3에 저장한뒤
		boolean result3 = result1 && result2;
		// result3의 값을 출력
		System.out.println(result3);

		boolean result4 = (num1 > num2) && (num1 != num2);
		System.out.println(result4);
		
		System.out.println(bool1); // t
		System.out.println(bool1); // t
		System.out.println(bool1 && bool2); // f
		System.out.println(!(bool1 && bool2)); // t

		System.out.println("Not 연산 수행 전: " + bool2);
		bool2 = !bool2;
		System.out.println("Not 연산 수행 후: " + bool2);


		// 논리연산자
		// &&(and) : 둘 다 true일때 true
		// ||(or) : 둘 중에 하나라도 true이면 true
		System.out.println(true&&true); // true
		System.out.println(true&&false); // false
		System.out.println(false&&true); // flase
		System.out.println(false&&false); // false

		System.out.println(true||true); // true
		System.out.println(true||false); // true
		System.out.println(false||true); // true
		System.out.println(false||false); // false
	}

}
