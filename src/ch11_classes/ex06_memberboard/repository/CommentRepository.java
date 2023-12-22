package ch11_classes.ex06_memberboard.repository;   //코드가 속한 패키지를 지정합니다.

import ch11_classes.ex06_memberboard.dto.CommentDTO;    //CommentDTO 클래스를 사용하기 위해 불러옵니다.

import java.util.ArrayList;     //  ArrayList 클래스를 사용하기 위해 불러옵니다.
import java.util.List;          //  List 인터페이스를 사용하기 위해 불러옵니다.

public class CommentRepository {    //  댓글 기능을 담당하는 CommentRepository 클래스를 선언합니다.
    private static List<CommentDTO> commentDTOList = new ArrayList<>(); //  댓글 데이터를 저장할 ArrayList 객체를 생성합니다.

    /**
     * 댓글조회 메서드
     * name: findId
     * parameter: id
     * return: List<CommentDTO>
     * 실행내용
     *      BoardService로 부터 전달받은 id를 리스트에 있는 id와 비교하고
     *      id에 대한 DTO객체를 리스트에 저장하고 결과를 리턴
     */

    public List<CommentDTO> findId(Long id) {
        List<CommentDTO> commentDTOS = new ArrayList<>();
        for (int i = 0; i < commentDTOList.size(); i++) {
            if (id.equals(commentDTOList.get(i).getBoardId())) {
                commentDTOS.add(commentDTOList.get(i));
            }
        }   //  게시물 ID에 해당하는 댓글 목록을 조회하는 메서드입니다. 전달받은 id와 일치하는 boardId를 가진 댓글들을 찾아서 반환합니다.
        return commentDTOS;
    }

    public boolean save(CommentDTO commentDTO) {
        return commentDTOList.add(commentDTO);
    }
}   //  댓글을 저장하는 메서드입니다. 전달받은 commentDTO 객체를 commentDTOList에 추가하고 성공 여부를 반환합니다.