package ch09_Array;

import java.util.Scanner;

public class Ex04_ArrayEx {
    public static void main(String[] args) {
        int num[] = {5, 2, 1, 3, 4, 7, 6, 9, 10, 8};
       // 1~10 사이의 숫자가 들어있는 배열을 선언합니다.
                /**
                 * 위와 같은 배열이 있을 때 1~10 사이의 숫자 중에서 하나를
                 * 입력했을 때 그 숫자가 몇 번 인덱스에 있는지 출력
                 */
        Scanner scanner = new Scanner(System.in);
        //  사용자 입력을 받기 위한 Scanner 객체를 생성합니다.
        System.out.print("숫자: ");
        //  사용자에게 숫자를 입력하라고 지시합니다.
        int check = scanner.nextInt();
        //  사용자 입력을 받아 check 변수에 저장합니다.

        for (int i=0; i< num.length; i++) {
            //  배열의 길이만큼 반복합니다.
            if(check == num[i]) {
                //  check 변수의 값이 배열의 i번 인덱스의 값과 같은지 확인합니다.
                System.out.println(check+"는 "+i+" 번 인덱스에 있습니다.");
                //  check 변수의 값이 배열의 i번 인덱스에 있는 경우 해당 인덱스를 출력합니다.
            }
        }       //  반복문이 종료됩니다.
//        while (true) {
//            System.out.print("숫자: ");
//            int check = scanner.nextInt();
//            if (check < 0 || check > 10) {
//                System.out.println("숫자를 다시 입력하시오.");
//            } else {
//                for (int i = 0; i < num.length; i++) {
//                    if (check == num[i]) {
//                        System.out.println(check + "는 " + i + " 번 인덱스에 있습니다.");
//                    }
//                }
//                break;
//            }
//        }
    }
}

