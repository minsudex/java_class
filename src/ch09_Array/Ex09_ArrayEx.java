package ch09_Array;

import java.util.Scanner;

public class Ex09_ArrayEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Scanner 객체를 생성하여 사용자 입력을 받습니다.
        int studentNum;
        // 학생 수를 저장할 변수를 선언합니다.
        int[] score = null;
        // 점수를 저장할 배열을 선언하고 null로 초기화합니다.

        while (true) {
            // 메뉴를 출력하고 사용자의 선택을 받습니다.
            System.out.println("---------------------------------------------------------");
            System.out.println("1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료");
            System.out.println("---------------------------------------------------------");
            System.out.print("선택> ");

            int select = scanner.nextInt();
            // 선택에 따라 처리합니다.
            if (select == 1) {
                System.out.print("학생수>");
                studentNum = scanner.nextInt();
                // 학생 수만큼 점수를 저장할 배열을 생성합니다.
                score = new int[studentNum];
            } else if (select == 2) {
                // 점수를 입력받아 배열에 저장합니다.
                for (int i = 0; i < score.length; i++) {
                    System.out.print((i + 1) + "번 학생 점수: ");
                    score[i] = scanner.nextInt();
                }
            } else if (select == 3) {
                // 점수 목록을 출력합니다.
                for (int i = 0; i < score.length; i++) {
                    System.out.println((i + 1) + "번 학생 점수: " + score[i]);
                }
            } else if (select == 4) {
                // 최댓값, 평균값 계산 및 출력
                // 최댓값을 저장할 변수를 선언합니다.
                int min = 0;
                // 점수의 합을 저장할 변수를 선언합니다.
                int sum = 0;
                // 배열의 모든 요소를 순회하면서 최댓값과 합을 계산합니다.
                for (int i = 0; i < score.length; i++) {
                    sum += score[i];
                    for (int j = i + 1; j < score.length; j++) {
                        if (score[i] < score[j]) {

                            min = score[i];
                            score[i] = score[j];
                            score[j] = min;
                        }
                    }
                }
                // 최댓값과 평균값을 출력합니다.
                System.out.println("최고점수: " + score[0]);
                System.out.println("평균점수: " + (double) (sum / score.length));
                // 등수를 매겨 출력합니다.
                for (int i = 0; i < score.length; i++) {
                    System.out.println((i + 1) + "등: " + score[i]);
                }
            } else if (select == 5) {
                // 종료합니다.
                System.out.println("종료");
                break;
            }
        }
    }
}