package ch06_for;

public class Ex11_ForEX {
    public static void main(String[] args) {
        /**
         * 별찍기
         * 출력
         * *
         * **
         * ***
         * ****
         * *****
         *
         */

        // 행마다 별을 찍는 for문
        for (int i = 0; i < 5 ; i++) {
            // 열의 개수만큼 별을 찍는 for문
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }
    }
}



