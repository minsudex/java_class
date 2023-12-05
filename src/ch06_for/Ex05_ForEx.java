package ch06_for;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Ex05_ForEx {
    public static void main(String[] args) {
        /**
         * 두 개의 정수를 입력받아서 시작값부터 꿑값까지의 합계 출력
         * 입력 예
         *   시작값: 110
         *    끝값: 555
         *    출력 예
         *    110 부터 555 까지의 합은 000 입니다.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("시작값: ");
        int start = scanner.nextInt();
        System.out.println("꿑값: ");
        int end = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += i;
            if (i < 10) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=");
            }
        }
        System.out.println(sum);
        System.out.println(start + "부터" + end + "까지의 합은" + sum +  "입니다.");
    }
}
