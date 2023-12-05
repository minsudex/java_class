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
        for (int i = 2; i <= 9; i++) { // 몇 단
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {   // 곱하는 수(1~9)
                System.out.print(i + "x" + j + "=" + (i + j) + " ");
                System.out.print("");
            }
            System.out.println();
            System.out.println("");

        }
    }
}
