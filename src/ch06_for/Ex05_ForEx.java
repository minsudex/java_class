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
        // `Scanner` 클래스를 사용하여 사용자 입력을 받기 위한 객체를 생성한다.
        Scanner scanner = new Scanner(System.in);
        // 시작값을 입력받는다.
        System.out.println("시작값: ");
        int start = scanner.nextInt();
        // 끝값을 입력받는다.
        System.out.println("꿑값: ");
        int end = scanner.nextInt();
        // 시작값부터 끝값까지의 합을 저장할 변수를 선언하고 0으로 초기화한다.
        int sum = 0;
        // 시작값부터 끝값까지 반복한다.
        for (int i = start; i < end; i++) {
            // `sum` 변수에 `i` 변수의 값을 더한다.
            sum += i;
            // `i` 변수의 값이 끝값보다 작으면 `+` 기호를 출력한다.
            // `i` 변수의 값이 끝값이면 `=` 기호를 출력한다.
            if (i < end) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=");
            }
        }
        // `sum` 변수의 값을 출력한다.
        System.out.println(sum);
        // 시작값부터 끝값까지의 합계를 출력한다.
        System.out.println(start + "부터" + end + "까지의 합은" + sum + "입니다.");
    }
}
