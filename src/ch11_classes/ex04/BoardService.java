package ch11_classes.ex04;

import ch11_classes.ex03.MemberDTO;
import ch11_classes.ex03.MemberRepository;

import java.util.List;
import java.util.Scanner;

public class BoardService {


    BoardRepository boardRepository = new BoardRepository();

    Scanner scanner = new Scanner(System.in);

    /*  등록하기 */
    public void save() {
        System.out.println("제목;  ");
        String GoardTitle = scanner.next();
        System.out.println("작성자:  ");
        String BoardWriter = scanner.next();
        System.out.println("내용:  ");
        String BoardContents = scanner.next();
        System.out.println("비밀번호:   ");
        String BoardPassword = scanner.next();
        BoardDTO boardDTO = new BoardDTO(GoardTitle, BoardWriter, BoardContents, BoardPassword);
        boolean result = boardRepository.save(boardDTO);
        if (result) {
            System.out.println("등록성공");
        } else {
            System.out.println("등록실패");
        }
    }public void findByAll() {
        System.out.println("전체 글 목록 출력");
        List<BoardDTO> boardDTOList = boardRepository.findByAll();
        for (BoardDTO boardDTO: boardDTOList) {
            System.out.println(boardDTO);
        }
    }public void findById() {
        System.out.print("조회할 글번호: ");
        Long findId = scanner.nextLong();
        BoardDTO result = boardRepository.findById(findId);
        if (result != null) {
            System.out.println("조회한 글번호의 글이 있습니다.");
//            boardRepository.count(findId);
            System.out.println(result);
        } else {
            System.out.println("조회 결과 글번호에 대한 글이 없습니다.");
        }
        }
    /* 수정하기 */
public void update() {
    System.out.print("수정할 글번호: ");
    Long updateId = scanner.nextLong();
    BoardDTO result = boardRepository.findById(updateId);
    if (result != null) {
        System.out.print("비밀번호: ");
        String boardPass = scanner.next();
        boolean passResult = boardRepository.findByPass(updateId, boardPass);
        if(passResult) {
            System.out.print("수정할 제목: ");
            String boardTitle = scanner.next();
            System.out.print("수정할 내용: ");
            String boardContents = scanner.next();
            result = boardRepository.update(updateId, boardPass, boardTitle, boardContents);
            if(result != null) {
                System.out.println("수정에 성공하셨습니다.");
                System.out.println(result);
            } else {
                System.out.println("수정에 실패하셨습니다.");
            }
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
        }
    } else {
        System.out.println("수정할 글 번호를 찾지 못했습니다.");
    }
}
    /* 삭제하기 */
    public void delete() {
        System.out.print("삭제할 글번호: ");
        Long deleteId = scanner.nextLong();
        BoardDTO result = boardRepository.findById(deleteId);
        if (result != null) {
            System.out.print("비밀번호: ");
            String boardPass = scanner.next();
            boolean passResult = boardRepository.findByPass(deleteId, boardPass);
            if(passResult) {
                boolean deleteResult = boardRepository.delete(deleteId, boardPass);
                if(deleteResult) {
                    System.out.println("삭제에 성공하셨습니다.");
                } else {
                    System.out.println("삭제에 실패하셨습니다.");
                }
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("삭제할 글 번호를 찾지 못했습니다.");
        }
    }
    /* 검색하기 */
    public void search() {
        System.out.print("검색할 제목: ");
        String boardTitle = scanner.next();
        List<BoardDTO> result = boardRepository.search(boardTitle);
        if(result != null) {
            System.out.println("검색에 성공하셨습니다.");
            for(BoardDTO boardDTO: result) {
                System.out.println(boardDTO);
            }
        } else {
            System.out.println("검색에 실패하셨습니다.");
        }
    }
}