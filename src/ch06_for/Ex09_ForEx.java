package ch06_for;

public class Ex09_ForEx {
    public static void main(String[] args) {
        /**
         * 4x + 5y = 60 을 만족하는 x, y 값을 출력
         * x, y는 1이상 10이하인 정수
         *
         * 출력 (정답)
         * 5, 8 10, 4
         */
        // 4x + 5y = 60 의 해를 구하는 코드

        // x 값을 0부터 10까지 반복
        for (int x = 0; x <= 10; x++) {
            // y 값을 0부터 10까지 반복
            for (int y = 0; y <= 10; y++) {
                // 4x + 5y = 60 의 식을 만족하는 경우
                if (4 * x + 5 * y == 60) {
                    // x, y 값을 출력
                    System.out.println("x: " + x + ", y: " + y);
                }
            }
        }
    }
}


