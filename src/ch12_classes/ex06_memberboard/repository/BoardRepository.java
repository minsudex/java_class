package ch12_classes.ex06_memberboard.repository;   //코드가 속한 패키지를 지정합니다.

import ch12_classes.ex06_memberboard.dto.BoardDTO;  //BoardDTO 클래스를 사용하기 위해 가져옵니다.

import java.util.ArrayList; //ArrayList 클래스를 사용하기 위해 가져옵니다.
import java.util.List;  //  List 인터페이스를 사용하기 위해 가져옵니다

public class BoardRepository {  //  게시판 기능을 담당하는 BoardRepository 클래스를 선언합니다.
    private static List<BoardDTO> boardDTOList = new ArrayList<>(); // 게시물 데이터를 저장할 ArrayList 객체를 생성합니다.
    public boolean write(BoardDTO boardDTO) {
        return boardDTOList.add(boardDTO);
    }   // 게시물을 작성하는 메서드입니다. 전달받은 boardDTO 객체를 boardDTOList에 추가하고 성공 여부를 반환합니다.


    public List<BoardDTO> findAll() {
        return boardDTOList;
    }
    //  모든 게시물 목록을 조회하는 메서드입니다. boardDTOList를 반환합니다.
    public BoardDTO findId(Long id) {
        BoardDTO boardDTO = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                boardDTO = boardDTOList.get(i);
            }
        }   //전달받은 id와 일치하는 게시물을 조회하는 메서드입니다. 해당 게시물을 BoardDTO 객체로 반환합니다.
        return boardDTO;
    }

    public boolean update(Long id, String boardTitle, String boardContents) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                boardDTOList.get(i).setBoardTitle(boardTitle);
                boardDTOList.get(i).setBoardContents(boardContents);
                result = true;
            }
        }   //전달받은 id에 해당하는 게시물의 제목과 내용을 수정하는 메서드입니다. 수정 성공 여부를 반환합니다.
        return result;
    }

    public boolean delete(Long id) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                boardDTOList.remove(i);
                result = true;
            }
        }   //  전달받은 id에 해당하는 게시물을 삭제하는 메서드입니다. 삭제 성공 여부를 반환합니다.
        return result;
    }

    public List<BoardDTO> search(String boardTitle) {
        List<BoardDTO> boardDTOS = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(boardTitle)) {
                boardDTOS.add(boardDTOList.get(i));
            }
        }   //전달받은 boardTitle을 포함하는 게시물 목록을 조회하는 메서드입니다. 검색된 게시물 목록을 반환합니다.
        return boardDTOS;
    }
}