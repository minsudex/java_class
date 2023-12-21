package ch06_for;

import java.util.concurrent.LinkedTransferQueue;

public class Ex08_ForEx {

    /***
     * manin method
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 구구단 출력하기
         */
        for (int i = 2; i <= 9; i++) { // 몇 단인지 확인하는 for문
            System.out.println(i + "단");        // 몇 단인지 출력
            for (int j = 1; j <= 9; j++) {   // 곱하는 수(1~9)를 확인하는 for문
                System.out.print(i + "x" + j + "=" + (i + j) + " ");  // 곱셈 결과를 출력
                System.out.print("t");  // 탭 문자를 출력
            }
            System.out.println();       // 줄 바꿈 문자를 출력
            System.out.println("/n");       // 개행 문자를 출력

        }
    }
}
