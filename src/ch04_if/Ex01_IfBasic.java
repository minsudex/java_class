package ch04_if;

public class Ex01_IfBasic {

	public static void main(String[] args) {
		// if문
		// if문은 조건이 참이면 블록 내부의 코드를 실행하고, 거짓이면 블록 내부의 코드를 실행하지 않는다.
		System.out.println("if문 전");
		boolean cond = false;
		// cond 변수를 false로 초기화한다.
		if (!cond) {
			// cond 변수가 false이므로 블록 내부의 코드를 실행한다.
			System.out.println("조건을 만족하면 내가 보임");
		}
		System.out.println("if문 후");

		// if else
		// if else문은 if문과 else 블록으로 구성된다.
		// if문의 조건이 참이면 if 블록 내부의 코드를 실행하고, 거짓이면 else 블록 내부의 코드를 실행한다.
		System.out.println("if else문 전");
		if (cond) {
			// cond 변수가 true이므로 if 블록 내부의 코드를 실행한다.
			System.out.println("조건 만족");
		} else {
			// cond 변수가 false이므로 else 블록 내부의 코드를 실행한다.
			System.out.println("조건 만족하지 않음");
		}
		System.out.println("if else문 후");

		// if else if
		// if else if문은 if문과 else if 블록으로 구성된다.
		// if문의 조건이 참이면 if 블록 내부의 코드를 실행하고, 거짓이면 다음 else if 블록의 조건을 검사한다.
		// else if 블록의 조건이 참이면 해당 블록 내부의 코드를 실행하고, 거짓이면 다음 else if 블록의 조건을 검사한다.
		// 이 과정을 모든 else if 블록에 대해 반복하며, 모든 else if 블록의 조건이 거짓이면 else 블록 내부의 코드를 실행한다.
		int num1 = 10, num2 = 10;
		if (num1 < num2) {
			// num1이 num2보다 작으므로 해당 블록 내부의 코드를 실행하지 않는다.

			System.out.println("num1이 num2보다 크다");
		}
	
		// if else if
		if (num1 > num2) {
		// num1이 num2보다 크므로 해당 블록 내부의 코드를 실행한다.
			System.out.println("num1이 크다");
		} else if (num1 < num2) {
			// num1이 num2보다 작으므로 해당 블록 내부의 코드를 실행한다.
			System.out.println("num2가 크다");
		} else if (num1 == num2) {
			// num1과 num2가 같으므로 해당 블록 내부의 코드를 실행한다.
			System.out.println("둘이 같다");
		} else {
			// 모든 else if 블록의 조건이 거짓이므로 해당 블록 내부의 코드를 실행한다.
			System.out.println("비교 불가");
		}
	}
}
