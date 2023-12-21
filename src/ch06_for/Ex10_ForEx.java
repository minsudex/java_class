package ch06_for;

import java.util.Scanner;

public class Ex10_ForEx {
    public static void main(String[] args) {
        /**
         * 정수를 하나 입력 받고
         * 1부터 입력받은 정수까지의 정수 중에서
         * 2의 배수 3의 배수를 제외한 총 합 출력
         */
        // 1부터 입력받은 수까지 짝수와 홀수가 아닌 숫자의 합을 구하는 코드
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        // 입력 받기
        System.out.print("숫자 입력: ");
        int n = scanner.nextInt();
        // 합 계산 변수
        int sum = 0;
        // 1부터 입력받은 수까지 반복
        for (int i = 1; i <= n; i++) {
            // 짝수와 홀수가 아닌지 확인
            if (i % 2 != 0 && i % 3 != 0) {
                // 합에 더하기
                sum += i;
            }
        }
        // 합 출력
        System.out.println("합계: " + sum);
    }
}



