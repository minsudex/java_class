package ch04_if;

import java.util.Scanner;

public class Ex07_Example {

	public static void main(String[] args) {

		/*
		 * 성적 출력 예제 응용
		 * 입역값: 학년(year), 점수(score)
		 * 처리
		 * - 1~3학년은 60점 이상이면 합격
		 * - 4학년은 70점 이상이어야 합격
		 */
		Scanner scanner= new Scanner(System.in);
		System.out.println("학년을 입력하세요.");
		int year = scanner.nextInt();
		System.out.println("점수를 입력하세요.");
		int score = scanner.nextInt();
		
//	    if (score >= 60) { // 60점이상 합격
//            if (year != 4) // 1,2,3 학년 / 4학년
//                System.out.println("합격!"); // 4학년 아니면 합격 (1,2,3학년 해당)
// 
//            else if (score >= 70)
//                System.out.println("합격!");// 4학년이 70점일떄 합격
// 
//            else
//                System.out.println("불합격"); // 4학년이 70점 미만이면 불합격
//        }
// 
//        else 
//            System.out.println("불합격"); // 60점 미만 불합격
//	    	scanner.close();
		if (year >= 1 && year <= 4 && score >= 0 && score <= 100) {
			if (score >= 60) {
				if (year != 4) {
					// 1~3학년 합격
					System.out.println("합격");
				} else if (score >= 70) {
					// 4학년 합격
					System.out.println("합격");
				} else {
					// 위의 두 조건을 만족하지 않기 때문에 불합격
					System.out.println("불합격");
				}
			}else {
				System.out.println("불합격");
			}
		}	else {
			System.out.println("점수, 학년 값이 입력범위를 벗어났습니다.");
			}
		}
	}

