package ch06_for;

public class Ex06_ForEx {
    public static void main(String[] args) {
        /**
         *  1부터 100까지의 숫자 중에서 3의 배수만 출력하고 합계도 구하기
         */

        int sum = 0;
        System.out.println("3의 배수 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) { sum += i;
                System.out.println(i);
            }
        }
        for (int j = 1; j <= 100; j++) {
            if(j%3 ==0) {

            }
        }
        System.out.println("1~100까지 중 3의 배수의 합 = " + sum);
    }
}
