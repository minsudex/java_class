package ch09_Array;

import java.util.Scanner;

public class Ex05_ArrayEx {
    public static void main(String[] args) {
        /**
         * 거스름돈 계산하기
         * 필요한 거스름돈을 입력했을 때 각 동전별로 몇 개가 필요한지 계산
         * 예)
         *      170 이라고 입력하면
         *      100원 1개
         *      50원 1개
         *      10원 2개
         *
         *      700 이라고 입력하면
         *      500원 1개
         *      100원 2개
         *      50원 1개
         *      10원 5개
         *
         */
        Scanner scanner = new Scanner(System.in);
        //  사용자 입력을 받기 위한 Scanner 객체를 생성합니다.
        int[] coin = {500, 100, 50, 10};
        //  사용될 동전의 단위를 저장할 배열을 선언합니다.
        System.out.println("거스름돈; ");
        //  사용자에게 거스름돈을 입력하라고 지시합니다.
        int change = scanner.nextInt();
        //  사용자 입력을 받아 change 변수에 저장합니다.
        int count = 0;
        //  거스름돈/동전 = 몫(갯수)
        for (int i = 0; i < coin.length; i++) {
            //  coin 배열의 길이만큼 반복합니다.
            count = change / coin[i];
            //  거스름돈을 coin[i] 동전의 단위로 나눈 몫을 count 변수에 저장합니다.
            System.out.println(coin[i] + "원 동전: " + count + "개");
            //  나머지를 다음번 계산에 활용
            change = change % coin[i];
            //  거스름돈에서 coin[i] 동전의 개수만큼 뺀 값을 change 변수에 저장합니다.
        }
    }
}