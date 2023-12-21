package ch04_if;

import java.util.Scanner;

public class Ex03_IfExample {

	public static void main(String[] args) {
		/**
		 * 스캐너로 점수(score)룰 하나 입력받아서
		 * 90점 이상이면 A
		 * 80점 이상이면 B
		 * 70점 이상이면 C
		 * 60점 이상이면 D
		 * 60점 보다 적은 점수면 F
		 * 를 출력
		 */

		// 키보드 입력을 읽어오는 Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		// 사용자에게 점수 입력 요청
		System.out.print("점수: ");
		// 키보드로 입력된 점수 저장
		int score = scanner.nextInt();
		// 점수에 따른 학점 출력
		// if-else if 문을 사용하여 점수 범위에 따라 학점 부여
		if (score >= 90) {
			// 90점 이상: A 학점
			System.out.println("A");
		} else if (score >= 80) {
			// 80점 이상: B 학점
			System.out.println("B");
		} else if (score >= 70) {
			// 70점 이상: C 학점
			System.out.println("C");
		} else if (score >= 60) {
			// 60점 이상: D 학점
			System.out.println("D");
		} else {
			// 60점 미만: F 학점
			System.out.println("F");
		}

	}

}