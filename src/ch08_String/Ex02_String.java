package ch08_String;

import java.util.Scanner;

public class Ex02_String {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요");
        // 사용자에게 메시지를 입력하라고 지시합니다.
        System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");
        // 프로그램 종료 조건을 알려줍니다.
        Scanner scan = new Scanner(System.in);
        // 사용자 입력을 받기 위한 Scanner 객체를 생성합니다.
        String inputString = "";
        // 사용자 입력을 저장할 String 변수를 선언합니다.
        boolean run = true;
        // 프로그램 실행 여부를 저장할 boolean 변수를 선언합니다.
        String answer = "종료";
        // 프로그램을 종료하는 키워드를 저장할 String 변수를 선언합니다.
        // 프로그램을 종료하는 키워드인 종료 가 절대로 바뀌지 않을 경우
        final String ANSWER = "종료";
        // final 키워드를 붙인 변수는 변수값을 바꿀 수 없음.
//		ANSWER = "다른값저장";
        do {
            // do-while 문은 최소한 한 번은 실행됩니다.
            System.out.print(">");
            // 사용자 입력을 받기 위한 프롬프트를 출력합니다.
            inputString = scan.nextLine();
            // 사용자 입력을 받습니다.
            System.out.println(inputString);
            // 사용자 입력을 출력합니다.
            if(inputString.equals(ANSWER)) {
                // 사용자가 종료 키워드를 입력한 경우
                run = false;
                // 프로그램 실행을 종료합니다.
            }
        } while(run);
        // 프로그램 실행 여부가 true인 동안 do-while 문을 반복합니다.
    }
}