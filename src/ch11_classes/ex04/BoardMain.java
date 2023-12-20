package ch11_classes.ex04;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        BoardService boardService = new BoardService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 | 7.테스트데이터  0.종료");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.print("선택> ");
            int select = scanner.nextInt();
            if(select == 1) {   /* 글작성 */
                boardService.save();
            } else if (select == 2) {   /* 글 목록 조회   */
                boardService.findAll();
            } else if (select == 3) {   /*  글 조회    */
                boardService.findById();
            } else if (select == 4) {   /*  글 수정    */
                boardService.update();
            } else if (select == 5) {   /*  글 삭제    */
                boardService.delete();
            } else if (select == 6) {   /*  검색  */
                boardService.search();
            } else if (select == 7) {   /*  테스트 데이터 생성  */
                boardService.testData();
            } else if (select == 0) {   /*  종료 */
                break;
            }
        }
    }
}