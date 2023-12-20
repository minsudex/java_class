package ch10_class.ex11;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {    /*  메인 메소드는 프로그램의 시작점입니다.
                                                매개변수로 전달되는 args는 프로그램 실행 시 명령줄에서 전달된 인수를 담고 있습니다.   */
        /*
        메뉴
        1. 글작성(매개변수 있는 생성자 이용
                글작성 정보는 스캐너로 받음, 글번호도 같이 입력함
        2. 글조회
            끝번호를 입력받고 Board 클래스의 findById로 글번호를 넘긴다.
         * 3. 종료
         */
        Scanner scanner = new Scanner(System.in);   /*  Scanner 클래스를 사용하여 키보드 입력을 받습니다. */
        boolean run = true; /*  run 변수를 사용하여 프로그램이 실행 중인지 여부를 제어합니다.    */
        int selectNo = 0;   /*  selectNo 변수를 사용하여 사용자가 선택한 메뉴 번호를 저장합니다.    */
        Board board = null; /*  board 변수를 사용하여 게시글 정보를 저장합니다.   */

        while (run) {   /*  run 변수를 사용하여 프로그램이 실행 중인지 여부를 제어합니다.    */
            System.out.println("-------------------------"); /*  구분선 출력 */
            System.out.println("1.글작성 | 2.글조회 | 3.종료"); /*  메뉴 출력   */
            System.out.println("-------------------------"); /*  구분선 출력 */
            System.out.print("선택> ");                        /*     사용자 입력 받기  */
            selectNo = scanner.nextInt();                   /*   사용자 입력을 selectNo 변수에 저장    */
            if (selectNo == 1) {                            /*  사용자가 1번 메뉴를 선택한 경우  */
                System.out.print("글번호: ");              /*  글번호 입력 받기   */
                Long id = scanner.nextLong();             /*  글번호를 id 변수에 저장    */
                System.out.print("제목: ");               /*  제목 입력 받기    */
                String boardTitle = scanner.next();     /*  제목을 boardTitle 변수에 저장   */
                System.out.print("작성자: ");              /*  작성자 입력 받기   */
                String boardWriter = scanner.next();    /* 작성자를 boardWriter 변수에 저장 */
                System.out.print("내용: ");               /*  내용 입력 받기    */
                String boardContents = scanner.next();  /*  내용을 boardContents 변수에 저장    */
                board = new Board(id, boardTitle, boardWriter, boardContents);  /*  Board 클래스의 생성자를 사용하여 게시글 정보를 저장합니다. */
            } else if (selectNo == 2) {     /*  사용자가 2번 메뉴를 선택한 경우  */
                System.out.print("조회할 글번호: ");  /*  조회할 글번호 입력 받기   */
                Long id = scanner.nextLong();   /*  조회할 글번호를 id 변수에 저장  */
                board.findById(id); /*  Board 클래스의 findById() 메서드를 사용하여 게시글 정보를 조회합니다.  */
            } else if (selectNo == 3) { /*  사용자가 3번 메뉴를 선택한 경우  */
                run = false;    /*  run 변수를 false로 설정하여 반복문을 종료합니다. */
            }
        }
    }
}