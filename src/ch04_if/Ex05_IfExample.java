package ch04_if;

import java.util.Scanner;

public class Ex05_IfExample {

	public static void main(String[] args) {
		/**
		 *  정수 하나를 입력 받아서 양수, 음수, 0인지를 출력
		 */
		Scanner scanner= new Scanner(System.in);	// *    키보드 입력을 읽어오기 위해 Scanner 객체를 생성합니다.	*`System.in`은 표준 입력 스트림으로, 키보드 입력을 의미합니다.
		System.out.println("정수를 입력하세요");		//	 사용자에게 점수를 입력하도록 안내 메시지를 출력합니다
		int num1  = scanner.nextInt();				//	키보드로 입력된 정수 값을 num1 변수에 저장합니다.	* `scanner.nextInt()` 메서드는 키보드에서 정수 값을 읽어오는 역할을 합니다.
		
		if (num1 == 0) {							// 입력받은 정수가 0과 같으면 "0입니다"를 출력합니다.
			System.out.println("0입니다");
		} else if (num1 > 0) {						// 입력받은 정수가 0보다 크면 "양수입니다"를 출력합니다
			System.out.println("양수입니다");
		} else if (num1 < 0) {						//	입력받은 정수가 0보다 작으면 "음수입니다"를 출력합니다.
			System.out.println("음수입니다");
		}	scanner.close();						//	입력받은 정수를 처리한 후, Scanner 객체를 닫습니다.
	}	
}
