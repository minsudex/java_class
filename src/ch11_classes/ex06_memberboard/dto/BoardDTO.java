package ch11_classes.ex06_memberboard.dto;      //  package ch11_classes.ex06_memberboard.dto;: 이 클래스가 속한 패키지입니다.

import java.time.LocalDateTime;                 //  import java.time.LocalDateTime;: 날짜와 시간을 다루기 위한 클래스를 불러옵니다.
import java.time.format.DateTimeFormatter;      //  import java.time.format.DateTimeFormatter;: 날짜와 시간의 형식을 지정하기 위한 클래스를 불러옵니다.

public class BoardDTO {                         //  public class BoardDTO {: 게시판 정보를 담는 데이터 전송 객체(DTO) 클래스를 정의합니다.

    private Long id;                            //  private Long id;: 게시글의 고유한 식별 번호를 저장합니다.
    private String boardTitle;                  //  private String boardTitle;: 게시글 제목을 저장합니다.
    private String boardWriter;                 //  private String boardWriter;: 게시글 작성자를 저장합니다.
    private String boardContents;               //  private String boardContents;: 게시글 내용을 저장합니다.
    private int boardHits = 0;                  //  private int boardHits = 0;: 게시글 조회수를 저장하며, 기본값은 0입니다.
    private String createdAt;                   //  private String createdAt;: 게시글 작성 시각을 저장합니다.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public String getBoardContents() {
        return boardContents;
    }

    public void setBoardContents(String boardContents) {
        this.boardContents = boardContents;
    }

    public int getBoardHits() {
        return boardHits;
    }

    public void setBoardHits(int boardHits) {
        this.boardHits = boardHits;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public BoardDTO() {                             //  public BoardDTO() {: 빈 객체를 생성하는 기본 생성자입니다.

    }

    private static Long idValue = 1L;           //

    public BoardDTO(String boardTitle, String boardWriter, String boardContents) {
        this.id = idValue++;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContents = boardContents;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "id=" + id +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardContents='" + boardContents + '\'' +
                ", boardHits=" + boardHits +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
