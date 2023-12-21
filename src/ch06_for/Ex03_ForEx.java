package ch06_for;

public class Ex03_ForEx {
    /**
     * 1부터 10까지의 합계를 출력
     *  1+2+3+4+5+6+7+8+9+10=
     */
    public static void main(String[] args) {
        //        int sum = 0;
        //        sum = 1;
        //        sum = sum + 2;
        //        sum = sum + 3;
        //        sum = sum + 4;

        // `sum` 변수를 선언하고 0으로 초기화한다.
        int sum = 0;
        // `i` 변수를 선언하고 1로 초기화한다.
        for (int i = 1; i <= 10; i++) {
//            sum = 10;
//            sum = sum + i;
            // `sum` 변수에 `i` 변수의 값을 더한다.
            sum += i;
            System.out.println("i = " + i);
            // `sum` 변수의 값을 출력한다.
            System.out.println("sum = " + sum);
        }
        // `for` 문 종료 후 `sum` 변수의 값을 출력한다.
        System.out.println("for문 종료 후 sum = " + sum);
    }

}