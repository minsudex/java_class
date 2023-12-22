package ch11_classes.ex03_member;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.목록조회 | 4.정보수정 | 5.회원탈퇴 | 6.로그아웃 | 0.종료");
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.print("선택>");
            int select = scanner.nextInt();
            if (select == 1) {
                memberService.register(); /* 회원가입 */
            } else if (select == 2) {
                memberService.login();  /* 로그인 */
            } else if (select == 3) {
                memberService.search(); /* 목록조회 */
            } else if (select == 4) {
                memberService.update(); /* 정보수정 */
            } else if (select == 5) {
                memberService.out();   /* 회원탈퇴 */
            } else if (select == 6) {
                memberService.logout(); /* 로그아웃 */
            }  else if (select == 0) {
                break; /* 종료 */
            }
        }
    }
}