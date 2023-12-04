package ch05_switch_case;

import java.util.Scanner;

public class Ex02_Switch_case {
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




