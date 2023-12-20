package ch11_classes.ex04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BoardDTO {
    private int count = 0;      /* count: 게시물 조회 횟수 같은 카운터용 필드 (기본값 0) */
    private Long id;            /* id : 게시물 고유 식별자 (Long 타입) */
    private String boardTitle;  /* boardTitle : 게시물 제목 (String 타입) */
    private String boardWriter; /* boardWriter : 게시물 작성자 (String 타입 */
    private String boardContents;   /*  boardContents: 게시물 내용 (String 타입) */
    private String boardPass;   /*  boardPass: 게시물 수정/삭제 시 필요한 비밀번호 (String 타입) */
    private String createdAt;   /*  createdAt: 게시물 작성 시간 (String 타입)    */


    public int getCount() {     /*  getCount(): count 값을 반환합니다  */
        return count;
    }

    public void setCount(int count) {   /*  setCount(int count): count 값을 설정합니다.    */

        this.count = count;
    }

    public Long getId() {   /*  getId(): id 값을 반환합니다.   */

        return id;
    }

    public void setId(Long id) {    /*  setId(Long id): id 값을 설정합니다.    */
        this.id = id;
    }

    public String getBoardTitle() {     /*  getBoardTitle(): boardTitle 값을 반환합니다.   */

        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {  /*  getBoardTitle(): boardTitle 값을 설정합니다.   */

        this.boardTitle = boardTitle;
    }

    public String getBoardWriter() {    /*  getBoardWriter(): boardWriter 값을 반환합니다. */

        return boardWriter;
    }

    public void setBoardWriter(String boardWriter) {/*  setBoardWriter(String boardWriter): boardWriter 값을 설정합니다. */
        this.boardWriter = boardWriter;
    }

    public String getBoardContents() {  /*  getBoardContents(): boardContents 값을 반환합니다. */

        return boardContents;
    }

    public void setBoardContents(String boardContents) { /*  setBoardContents(String boardContents): boardContents 값을 설정합니다. */
        this.boardContents = boardContents;
    }

    public String getBoardPass() {  /*  getBoardPass(): boardPass 값을 반환합니다. */
        return boardPass;
    }

    public void setBoardPass(String boardPass) {    /*  setBoardPass(String boardPass): boardPass 값을 설정합니다. */
        this.boardPass = boardPass;
    }

    public static Long getIdValue() {   /*  getIdValue(): 클래스 전체에서 공유하는 idValue 값을 반환합니다    */
        return idValue;
    }

    public static void setIdValue(Long idValue) {   /*  setIdValue(Long idValue): 클래스 전체에서 공유하는 idValue 값을 설정합니다.   */
        BoardDTO.idValue = idValue;
    }

    public String getCreatedAt() {  /*  getCreatedAt(): createdAt 값을 반환합니다. */

        return createdAt;
    }

    public void setCreatedAt(String createdAt) {    /*  setCreatedAt(String createdAt): createdAt 값을 설정합니다. */
        this.createdAt = createdAt;
    }

    public BoardDTO() { /*  BoardDTO(): 기본 생성자입니다.  */

    }

    private static Long idValue = 1L;   /* 정적변수  idValue: 각 게시물에 자동으로 부여되는 고유 식별자 값을 저장합니다. (초기값 1L) */
    public BoardDTO(String boardTitle, String boardWriter, String boardContents, String boardPass) {
        this.id = idValue++;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContents = boardContents;
        this.boardPass = boardPass;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }   /*  BoardDTO(String boardTitle, String boardWriter, String boardContents, String boardPass):
            게시물 제목, 작성자, 내용, 비밀번호를 받아 객체를 생성하는 생성자입니다.
            생성 시, 고유 식별자 (id)를 할당하고, 생성 시간 (createdAt)을 현재 시간으로 설정합니다.  */

    @Override
    public String toString() {  /*  toString(): 객체 정보를 문자열 형태로 반환합니다.   */
        return "BoardDTO{" +
                "count=" + count +
                ", id=" + id +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardContents='" + boardContents + '\'' +
                ", boardPass='" + boardPass + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}