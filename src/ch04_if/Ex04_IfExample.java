package ch04_if;

import java.util.Scanner;

public class Ex04_IfExample {

	public static void main(String[] args) {
		/**
		 * 중첩 if문을 적용한 학점 출력
		 * 100점을 초과하거나 0점 미만을 점수를 입력하면 "입력범위를 초과하였슴니다." 출력
		 * 0~100 점 사이의 값을 입력했다면 앞의 예제에서 헸던 학점 출력을 진행함.
		 * 단, 각 조건마다 학점값을 출력하는 것이 아니라 학점 출력을 위하 print 문장은 한번만 사용
		 */
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("점수를 입력하세요");	// 사용자에게 점수를 입력하도록 안내 메시지를 출력합니다
		int score = scanner.nextInt();			// 키보드로 입력된 정수 값을 score 변수에 저장합니다.		scanner.nextInt() 메서드는 키보드에서 정수 값을 읽어오는 역할을 합니다.
		String grade = "";
		if (score > 100 || score <0) {						//	입력한 점수가 100점 이상이거나 0점 미만이면 입력범위를 초과하였습니다. 메시지를 출력합니다.
			System.out.println("입력범위를 초과하였습니다.");
		} else {
			// 학점 처리 
			if (score >= 90) {				//	점수가 90점 이상이면 A 학점을 할당합니다.
				grade = "A";
		} else if (score >= 80) {			//	점수가 80점 이상이면 B 학점을 할당합니다.
			grade = "B";
		} else if(score >= 70) {
			grade = "C";
		} else if(score >= 60) {		  //	점수가 60점 미만이면 F 학점을 할당합니다.
				grade = "D";
		} else {
			grade = "F";
		}System.out.println(grade);		//	학점을 출력합니다.
			scanner.close();
	}
	}
}

			
			
			