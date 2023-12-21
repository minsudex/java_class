package ch09_Array;

import java.util.Scanner;

public class Ex03_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 3인 정수형 배열을 선언하고
         * 실행 했을 때 스캐너로 정수값을 입력받아 배열에 저장
         * 배열에 저장된 값의 총합, 평균 계산
         */
        Scanner scanner = new Scanner(System.in);
        // 사용자 입력을 받기 위한 Scanner 객체를 생성합니다.
        int[] array = new int[3];
        // 3개의 정수를 저장할 배열을 생성합니다.
        int sum = 0;
        // 배열의 합을 저장할 변수를 선언합니다.

        for (int i = 0; i < array.length; i++) {
            // 배열의 길이만큼 반복합니다.
            System.out.print(i + "번 인덱스 값을 입력하시오: ");
            // 사용자에게 i번 인덱스의 값을 입력하라고 지시합니다.
            array[i] = scanner.nextInt();
            // 사용자 입력을 받아 배열의 i번 인덱스에 저장합니다.
            sum += array[i];
            // 배열의 i번 인덱스의 값을 sum에 더합니다.
        }
        // 반복문이 종료되면 sum은 배열의 모든 요소의 합이 됩니다.
        System.out.println("총합: "+sum+", 평균: "+ sum / array.length);
        // 배열의 총합과 평균을 출력합니다.
    }
}

