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
            Scanner scanner = new Scanner(System.in);
            System.out.print("단어를 입력하시오: ");
            switch (scanner.next()) {
                case "desk":
                    System.out.println("책상");
                    break;
                case "chair":
                    System.out.println("의자");
                    break;
                case "monitor":
                    System.out.println("모니터");
                    break;
                case "mouse":
                    System.out.println("마우스");
                    break;
                default:
                    System.out.println("사전에 없는 단어입니다.");
            }

        }
    }




