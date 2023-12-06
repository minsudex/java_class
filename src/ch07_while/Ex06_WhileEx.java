package ch07_while;

import java.util.Enumeration;
import java.util.Scanner;

public class Ex06_WhileEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 0을 입력하새요");

        int sum = 0;
        int count= 0;
        int num;

        while  ((num = scanner.nextInt()) !=0) {
            sum += num;
            count++;
        }

        System.out.println("입력한 숫자는 " + count + "개이며 평균은 " + (double)sum / count + "입니다.");
    }
}
