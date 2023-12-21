package ch04_if;

import java.util.Scanner;

public class Ex02_IfExample {

	public static void main(String[] args) {
		/**
		 * 성적 출력하기
		 * 자바점수(javaScore)가 60점 이상이면 합격, 아니면 불합격이라고 출력하기
		 * 자바점수는 미리 점수를 입력해놓고 실행함
		 */

		// 자바점수를 저장할 변수 선언
		int javaScore = 100;
		// 키보드 입력을 읽어오는 Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		// 키보드로 입력받은 자바점수를 저장
		javaScore = scanner.nextInt();
		// if문으로 자바점수의 합격 여부를 판단
		if	(javaScore >=60) {
			// 자바점수가 60점 이상이면 "합격" 출력
			System.out.println("합격");
			// 자바점수가 60점 미만이면 "불합격" 출력
		} else {
			System.out.println("불합격");
			
			scanner. close();
		}
	}

}
