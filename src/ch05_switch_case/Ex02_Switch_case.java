package ch05_switch_case;

import java.util.Scanner;

public class Ex02_Switch_case {
    /*
     * switch case를 이용한 간단한 사전
     * 이 사전에는 딱 4개의 단어만 들어 있음.
     * desk(책상), chair(의자), monitor(모니터), mouse(마우스)
     *
     * 프로그램을 실행하면 영어 단어를 입력 받고 위의 네 단어중 하나를 입력 했을 때 해당 의미를 출력해줌.
     * 사전에 없는 단어를 입력하면 사전에 없는 단어 입니다 라고 출력.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //  키보드 입력을 읽어오기 위해 Scanner 객체를 생성합니다.  *    `System.in`은 표준 입력 스트림으로, 키보드 입력을 의미합니다.
        System.out.print("단어를 입력하세요: ");
        String word = scanner.next();                   //  키보드로 입력된 단어를 word 변수에 저장합니다
        switch (word) {                                 //  입력받은 단어를 switch-case문의 조건으로 사용합니다.
            case "desk":                                //  입력받은 단어가 "desk"이면 "책상"을 출력합니다.
                System.out.println("책상입니다.");
                break;
            case "chair":                               //   입력받은 단어가 "chair"이면 "의자"를 출력합니다.
                System.out.println("의자입니다.");
                break;
            case "monitor":                             //  입력받은 단어가 "monitor"이면 "모니터"를 출력합니다.
                System.out.println("모니터입니다.");
                break;
            case "mouse":                               //  입력받은 단어가 "mouse"이면 "마우스"를 출력합니다.
                System.out.println("마우스입니다.");
                break;
            default:                                    //  위의 case 조건에 해당하지 않는 경우 "사전에 없는 단어입니다."를 출력합니다.
                System.out.println("사전에 없는 단어입니다.");
                break;
        }
    }
}