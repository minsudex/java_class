package ch04_if;

import java.util.Scanner;

public class Ex06_IfExmaple {

	public static void main(String[] args) {
		/**
		 * 정수 하나를 입력받아서
		 * 3의 배수인지, 5의 배수인지 또는 3과 5의 공배수인지, 아무것도 아닌지를 출력
		 */
		Scanner scanner= new Scanner(System.in);	// 키보드 입력을 읽어오기 위해 Scanner 객체를 생성합니다. 	*    `System.in`은 표준 입력 스트림으로, 키보드 입력을 의미합니다.
		System.out.println("정수를 입력하세요.");		//	사용자에게 점수를 입력하도록 안내 메시지를 출력합니다.
		int num = scanner.nextInt();				//	키보드로 입력된 정수 값을 num 변수에 저장합니다.		*scanner.nextInt()` 메서드는 키보드에서 정수 값을 읽어오는 역할을 합니다.
		
		if (num % 3 == 0 && num % 5 == 0) {			//	입력받은 정수가 3과 5의 공배수이면 "3, 5의 공배수"를 출력합니다.
			System.out.println("3, 5의 공배수");
		} else if (num % 5 ==0)	{					//	입력받은 정수가 5의 배수이면 "5의 배수"를 출력합니다
			System.out.println("5의 배수");
		} else if (num % 3 == 0) {					//	입력받은 정수가 3의 배수이면 "3의 배수"를 출력합니다.
			System.out.println("3의 배수");
		} else {									//	입력받은 정수가 3, 5의 배수가 아닌 경우 "3, 5의 배수가 아닙니다."를 출력합니다.
			System.out.println("3, 5의 배수가 아닙니다.");
		}
			scanner.close();						//	입력받은 정수를 처리한 후, Scanner 객체를 닫습니다.

		
	}

}
