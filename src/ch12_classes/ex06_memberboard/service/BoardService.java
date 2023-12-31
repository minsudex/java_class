package ch12_classes.ex06_memberboard.service;

import ch12_classes.ex06_memberboard.common.commonVariables;
import ch12_classes.ex06_memberboard.dto.BoardDTO;
import ch12_classes.ex06_memberboard.dto.CommentDTO;
import ch12_classes.ex06_memberboard.repository.BoardRepository;
import ch12_classes.ex06_memberboard.repository.CommentRepository;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    CommentRepository commentRepository = new CommentRepository();
    Scanner scanner = new Scanner(System.in);
    public void write() {
        System.out.print("제목: ");
        String broadTitle = scanner.next();
        System.out.print("내용: ");
        String broadContents = scanner.next();
        BoardDTO boardDTO = new BoardDTO(broadTitle, commonVariables.loginEmail, broadContents);
        boolean result = boardRepository.write(boardDTO);
        if (result) {
            System.out.println("글작성 완료");
        } else {
            System.out.println("글작성 실패");
        }
    }

    public void findAll() {
        List<BoardDTO> boardDTOList = boardRepository.findAll();
        listPrint(boardDTOList);
    }

    public void find() {
        System.out.print("조회할 id: ");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findId(id);
        if (boardDTO != null) {
            int hits = boardDTO.getBoardHits();
            hits = hits + 1;
            boardDTO.setBoardHits(hits);
            System.out.println(boardDTO);
            System.out.println("===== 댓글 ======");
            List<CommentDTO> commentDTOS = commentRepository.findId(id);
            if (commentDTOS.size() > 0) {
                for (CommentDTO commentDTO : commentDTOS) {
                    System.out.println(commentDTO);
                }
            } else {
                System.out.println("작성된 댓글이 없습니다.");
            }
            System.out.println("댓글을 작성하시려면 1번을 입력해주세요.");
            System.out.println("메인메뉴로 돌아가려면 2번을 입력해주세요.");
            System.out.print("입력> ");
            int select = scanner.nextInt();
            if (select == 1) {
                System.out.print("댓글 내용: ");
                String commentContents = scanner.next();
                CommentDTO commentDTO = new CommentDTO(boardDTO.getId(), commonVariables.loginEmail, commentContents);
                boolean result = commentRepository.save(commentDTO);
                if (result) {
                    System.out.println("댓글작성 성공");
                } else {
                    System.out.println("댓글작성 실패");
                }
            }
        } else {
            System.out.println("조회한 id가 없습니다.");
        }
    }

    public void update() {
        System.out.print("수정할 id: ");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findId(id);
        if (boardDTO != null && commonVariables.loginEmail.equals(boardDTO.getBoardWriter())) {
            System.out.print("수정 제목: ");
            String boardTitle = scanner.next();
            System.out.print("수정 내용: ");
            String boardContents = scanner.next();
            boolean result = boardRepository.update(id, boardTitle, boardContents);
            if (result) {
                System.out.println("수정 성공");
            } else {
                System.out.println("수정 실패");
            }
        } else {
            System.out.println("작성자만 수정 가능합니다.");
        }
    }

    public void delete() {
        System.out.print("삭제할 id: ");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findId(id);
        if (boardDTO != null && commonVariables.loginEmail.equals(boardDTO.getBoardWriter())) {
            boolean result = boardRepository.delete(id);
            if (result) {
                System.out.println("삭제 성공");
            } else {
                System.out.println("삭제 실패");
            }
        } else {
            System.out.println("작성자만 삭제 가능합니다.");
        }
    }

    public void search() {
        System.out.print("검색할 제목: ");
        String boardTitle = scanner.next();
        List<BoardDTO> boardDTOList = boardRepository.search(boardTitle);
        if (boardDTOList.size() > 0) {
            listPrint((boardDTOList));
        } else {
            System.out.println("검색한 제목이 없습니다.");
        }
    }
    private void listPrint(List<BoardDTO> boardDTOList) {
        System.out.println("id\t" + "title\t" + "writer\t" + "hits\t" + "date\t");
        for (BoardDTO boardDTO: boardDTOList) {
            System.out.println(boardDTO.getId() + "\t" + boardDTO.getBoardTitle() +
                    "\t" + boardDTO.getBoardWriter() + "\t" + boardDTO.getBoardHits() + "\t"
                    + boardDTO.getCreatedAt() + "\t");
        }
    }
}