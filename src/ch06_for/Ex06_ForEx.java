package ch06_for;

public class Ex06_ForEx {
    public static void main(String[] args) {
        /**
         *  1부터 100까지의 숫자 중에서 3의 배수만 출력하고 합계도 구하기
         */

        int sum = 0;                        // 1~100까지의 3의 배수의 합을 저장할 변수
        System.out.println("3의 배수 ");    // 3의 배수를 출력할 것임을 알림
        for (int i = 1; i <= 100; i++) {   // 1부터 100까지 반복
            if (i % 3 == 0) {               // i가 3의 배수이면
                sum += i;                   // sum에 i를 더함
                System.out.println(i);      // i를 출력함
            }
        }
        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0) {

            }
        }
        System.out.println("1~100까지 중 3의 배수의 합 = " + sum);  // 1~100까지 중 3의 배수의 합을 출력함
    }
}
