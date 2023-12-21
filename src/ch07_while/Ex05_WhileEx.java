package ch07_while;

import java.util.Scanner;

public class Ex05_WhileEx {
    public static void main(String[] args) {
        /**
         * random() 메서드를 이용해서 1~100 사이의 숫자를 하나 만들고
         * 반복문 안에서 해당 숫자를 맞출 때까지 계속 숫자를 입력받도록 하고
         * 숫자를 맞추면 종료하고 몇 번만에 맞췄는지를 출력해줌
         */
        Scanner scanner = new Scanner(System.in);   //  이 코드는 scanner 변수를 선언하고, System.in을 입력 소스로 지정합니다. scanner 변수는 사용자 입력을 받기 위해 사용됩니다.
        int input = 0, count = 0;                   //  이 코드는 input 변수를 선언하고, 0으로 초기화합니다. input 변수는 사용자가 입력한 숫자를 저장하기 위해 사용됩니다. count 변수를 선언하고, 0으로 초기화합니다. count 변수는 시도 횟수를 저장하기 위해 사용됩니다.
        boolean run = true;                         //  이 코드는 run 변수를 선언하고, true로 초기화합니다. run 변수는 반복문을 종료할지 여부를 결정하는 변수입니다.
        System.out.println("up & down");            //  이 코드는 "up & down"을 출력합니다.
        int answer = (int) (Math.random() * 100) + 1;   //  이 코드는 1~100 사이의 임의의 숫자를 발생시킵니다. answer 변수는 정답을 저장하기 위해 사용됩니다.
        while (run) {                                   //  이 while문은 run 변수의 값이 false가 될 때까지 반복합니다. 따라서 run 변수의 값이 true이면 무한히 반복됩니다.
            int count2 = 0;                             //  이 코드는 count2 변수를 선언하고, 0으로 초기화합니다. count2 변수는 while문의 반복 횟수를 저장하기 위해 사용됩니다.
            System.out.println("숫자를 입력하세요");       //   이 코드는 "숫자를 입력하세요"를 출력합니다.
            input = scanner.nextInt();                  // 사용자로부터 숫자를 입력받습니다.
            count++;                                    // 시도 횟수를 1 증가시킵니다.
            count2++;                                   // while문의 반복 횟수를 1 증가시킵니다.
            System.out.println("answer = " + answer);   // 정답을 출력합니다.
            if (input > answer) {                        // 사용자가 입력한 숫자가 정답보다 크면
                System.out.println("더 적은 수를 입력하세요"); // "더 적은 수를 입력하세요"를 출력합니다
            } else if (input < answer) {                   // 사용자가 입력한 숫자가 정답보다 작으면
                System.out.println("더 큰 수를 입력하세요"); // "더 큰 수를 입력하세요"를 출력합니다.
            } else {                                     // 사용자가 입력한 숫자가 정답과 같으면
                System.out.println("맞았습니다");             // "맞았습니다"를 출력합니다.
                System.out.println("시도 횟수는 " + count + "회 입니다.");   // 시도 횟수를 출력합니다
                System.out.println("시도 횟수는 " + count2 + "회 입니다.");   // while문의 반복 횟수를 출력합니다.
            }
        }
    }
}