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
        for (int i = 0; i < 5; i++) {  // 줄수, 별을 출력할 횟수
            // 열의 개수만큼 별을 찍는 for문
            for (int j = 0; j <= i; j++) {  // 별을 줄수만큼 출력
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();


        }
    }
}




