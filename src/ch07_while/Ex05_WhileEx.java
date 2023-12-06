package ch07_while;

import java.util.Scanner;

public class Ex05_WhileEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = 0, count = 0;
        boolean run = true;
        System.out.println("up & down");
        int answer = (int) (Math.random() * 100) + 1;
        while (run) {
            int count2 = 0;
            System.out.println("숫자를 입력하세요");
            input = scanner.nextInt();
            count++;
            count2++;
            System.out.println("answer = " + answer);
            if (input > answer) {
                System.out.println("더 적은 수를 입력하세요");
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요");
            } else {
                System.out.println("맞았습니다");
                System.out.println("시도 횟수는 " + count + "회 입니다.");
                System.out.println("시도 횟수는 " + count2 + "회 입니다.");
            }
        }
    }
}