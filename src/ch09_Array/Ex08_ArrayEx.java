package ch09_Array;

import java.util.Scanner;

public class Ex08_ArrayEx {
    public static void main(String[] args) {
        /**
         * 스캐너로 입력 받은 숫자의 크기를 갖는 배열을 만들어 봅시다.
         * 예를 들어 5를 입력하면
         * 크기가 5인 배열이 만들어져야 함.
          */

        int[] numbers = null;
        // 정수형 배열 numbers를 선언하고 null로 초기화합니다.
        Scanner scanner = new Scanner(System.in);
        // 사용자 입력을 받기 위한 Scanner 객체를 생성합니다.
        System.out.println("배열 크기");
        // 사용자에게 배열 크기를 입력하라고 지시합니다.
        int size = scanner.nextInt();
        // 사용자 입력을 받아 size 변수에 저장합니다.
        if (size > 0) {
            // 입력받은 크기가 0보다 큰 경우
            numbers = new int[size];
            // 입력받은 크기로 배열을 생성합니다.
            System.out.println("numbers = " + numbers.length);
            // 배열의 길이를 출력합니다.
        }   else {
            // 입력받은 크기가 0 이하인 경우
            numbers = null;
            // 배열을 null로 설정합니다.
        }
        System.out.println("numbers = " + numbers.length);
        // 배열의 길이를 다시 출력합니다.

    }
}
