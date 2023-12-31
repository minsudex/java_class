package ch06_for;

import com.sun.security.jgss.GSSUtil;

public class Ex07_ForEx {
    public static void main(String[] args) {
        /**
         * 중첩 for문
         */
        System.out.println("바깥 for문 시작");
        // 바깥 for문의 i가 1, 2일 때 각각 실행됨
        for (int i = 1; i <= 2; i++) {
            System.out.println("안족 for문 시작");
            // 안쪽 for문의 j가 1, 2, 3일 때 각각 실행됨
            for (int j = 1; j <= 3; j++) {
                System.out.print("j = " + j);
                System.out.println("    i = " + i);
            }
            System.out.println("안쪽 for문 종료");
        }
        System.out.println("바깥 for문 종료");
    }
}