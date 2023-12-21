package ch07_while;

public class Ex02_WhileEx {
    public static void main(String[] args) {
        /**
         *  while 문으로 1부터 10까지의 합계 출력
         *  출력
         *  1+2+3+4+5+6+7+8+9++10=55
         */

        int i = 1, sum = 0;
        // i를 1로 초기화하고, 합계를 0으로 초기화합니다.
        while (i <= 10) {
            // i가 10보다 작거나 같을 때까지 반복합니다.
//            System.out.println("i = " + i);
            // i의 값을 출력합니다.
            System.out.print(i);
            // i를 합계에 더합니다.
            sum += i;
            // i가 10보다 작으면 "+"를 출력하고, 그렇지 않으면 "="를 출력합니다.
            if (i < 10) {
                System.out.print("+");
            } else {
                System.out.print("=");
            }
            // i를 1 증가시킵니다.
            i++;
        }
        // 합계를 출력합니다.
        System.out.println(sum);
    }
}

