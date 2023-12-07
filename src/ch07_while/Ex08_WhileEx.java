package ch07_while;

import java.util.Scanner;

public class Ex08_WhileEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * 은행계좌 만들기
         *
         */
        // 초기 금액을 설정합니다.
        int balance = 0;

        // while문을 사용하여 반복합니다.
        while (true) {
            // 예금, 출금, 잔고확인, 종료를 묻는 질문을 합니다.
            System.out.println("*******************************");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("*******************************");
            System.out.println("선택> ");
            int menu = scanner.nextInt();

            // 사용자가 원하는 질문에 대해 처리합니다.
            switch (menu) {
                case 1: {
                    // 예금을 받습니다.
                    System.out.println("예금할 금액을 입력하세요: ");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    System.out.println("예금이 완료되었습니다.");
                    System.out.println("잔액은 " + balance + "원입니다.");
                    break;
                }
                case 2: {
                    // 출금을 처리합니다.
                    System.out.println("출금할 금액을 입력하세요: ");
                    int withdraw = scanner.nextInt();
                    if (balance < withdraw) {
                        System.out.println("잔액이 부족합니다.");
                    } else {
                        balance -= withdraw;
                        System.out.println("출금이 완료되었습니다.");
                        System.out.println("잔액은 " + balance + "원입니다.");
                    }
                    break;
                }
                case 3: {
                    // 잔고를 확인합니다.
                    System.out.println("잔액은 " + balance + "원입니다.");
                    break;
                }
                case 4: {
                    // 프로그램을 종료합니다.
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
            }
        }
    }
}

