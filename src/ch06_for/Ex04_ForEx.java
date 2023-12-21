package ch06_for;

public class Ex04_ForEx {
    public static void main(String[] args) {
        /*
         * 1부터 10까지의 합계를 아해와 같이 출력
         * 출력예
         * 1+2+3+4+5+6+7+8+9+10=55
         */
        // `sum` 변수를 선언하고 0으로 초기화한다.
        int sum = 0;
        // `i` 변수를 선언하고 1로 초기화한다.
        for (int i = 1; i < 10; i++) {
            // `sum` 변수에 `i` 변수의 값을 더한다.
            sum += i;
            // `i` 변수의 값이 9보다 작으면 `+` 기호를 출력한다.
            // `i` 변수의 값이 9이면 `=` 기호를 출력한다.
            if (i < 10) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=");
            }
        }
        // `sum` 변수의 값을 출력한다.
        System.out.println(sum);
    }
}