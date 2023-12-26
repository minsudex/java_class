package ch12_classes.ex06_memberboard.dto;      //  package ch11_classes.ex06_memberboard.dto;: 이 클래스가 속한 패키지입니다.

import java.time.LocalDateTime;                 //  import java.time.LocalDateTime;: 날짜와 시간을 다루기 위한 클래스를 불러옵니다.
import java.time.format.DateTimeFormatter;      //  import java.time.format.DateTimeFormatter;: 날짜와 시간의 형식을 지정하기 위한 클래스를 불러옵니다.

public class BoardDTO {                         //  public class BoardDTO {: 게시판 정보를 담는 데이터 전송 객체(DTO) 클래스를 정의합니다.

    private Long id;                            //  private Long id;: 게시글의 고유한 식별 번호를 저장합니다.
    private String boardTitle;                  //  private String boardTitle;: 게시글 제목을 저장합니다.
    private String boardWriter;                 //  private String boardWriter;: 게시글 작성자를 저장합니다.
    private String boardContents;               //  private String boardContents;: 게시글 내용을 저장합니다.
    private int boardHits = 0;                  //  private int boardHits = 0;: 게시글 조회수를 저장하며, 기본값은 0입니다.
    private String createdAt;                   //  private String createdAt;: 게시글 작성 시각을 저장합니다.

    public Long getId() {                       //  게시글의 고유한 식별 번호를 반환합니다.
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }   //  게시글의 고유한 식별 번호를 설정합니다.

    public String getBoardTitle() {
        return boardTitle;
    }   //  게시글 제목을 반환합니다.

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }   //  게시글 제목을 설정합니다.

    public String getBoardWriter() {
        return boardWriter;
    }   //  게시글 작성자를 반환합니다.

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }   //  게시글 작성자를 설정합니다.

    public String getBoardContents() {
        return boardContents;
    }   //  게시글 내용을 반환합니다.

    public void setBoardContents(String boardContents) {
        this.boardContents = boardContents;
    }   //  게시글 내용을 설정합니다.

    public int getBoardHits() {
        return boardHits;
    }   //  게시글 조회수를 반환합니다.

    public void setBoardHits(int boardHits) {
        this.boardHits = boardHits;
    }   //  게시글 조회수를 설정합니다.

    public String getCreatedAt() {
        return createdAt;
    }   //  게시글 작성 시각을 반환합니다.

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }   //  게시글 작성 시각을 설정합니다.



    public BoardDTO() {                             //  public BoardDTO() {: 빈 객체를 생성하는 기본 생성자입니다.

    }

    private static Long idValue = 1L;           //  게시글 고유 식별 번호를 생성하기 위한 static 변수입니다.

    public BoardDTO(String boardTitle, String boardWriter, String boardContents) {  //  게시글 제목, 작성자, 내용을 전달받아 객체를 생성하는 생성자입니다.
        this.id = idValue++;                                                        //  게시글 고유 식별 번호를 1씩 증가시켜 설정합니다.
        this.boardTitle = boardTitle;                                               //  게시글 제목을 설정합니다.
        this.boardWriter = boardWriter;                                             //  게시글 작성자를 설정합니다.
        this.boardContents = boardContents;                                         //  게시글 내용을 설정합니다.
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));    //  현재 날짜와 시간을 "yyyy-MM-dd HH:mm:ss" 형식으로 설정합니다.
    }

    @Override                                                       //  이 메서드를 재정의함을 나타냅니다.
    public String toString() {                                      //  객체의 정보를 문자열로 반환합니다.
        return "BoardDTO{" +                                        //  객체의 정보를 문자열로 반환합니다.
                "id=" + id +                                        //  게시글 고유 식별 번호를 반환합니다.
                ", boardTitle='" + boardTitle + '\'' +              //  게시글 제목을 반환합니다.
                ", boardWriter='" + boardWriter + '\'' +            // 작성자 정보를 추가합니다.
                ", boardContents='" + boardContents + '\'' +        // 게시글 내용을 추가합니다.
                ", boardHits=" + boardHits +                        // 조회수를 추가합니다.
                ", createdAt='" + createdAt + '\'' +                // 작성일자를 추가합니다.
                '}';                                                // 문자열을 닫습니다.
    }
}
