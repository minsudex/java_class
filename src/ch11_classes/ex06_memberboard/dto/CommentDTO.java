package ch11_classes.ex06_memberboard.dto;

import java.time.LocalDateTime;             // 현재 시간 정보를 사용하기 위해 LocalDateTime 클래스 불러오기
import java.time.format.DateTimeFormatter;  // 시간 형식을 지정하기 위해 DateTimeFormatter 클래스 불러오기


public class CommentDTO {               // 댓글 정보를 담는 클래스입니다.

    private Long id;                    // 댓글 고유번호
    private Long boardId;                // 댓글이 작성된 게시글의 번호
    private String commentWriter;        // 댓글 작성자
    private String commentContents;      // 댓글 내용
    private String createdAt;            // 댓글 작성 시간

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public String getCommentWriter() {
        return commentWriter;
    }

    public void setCommentWriter(String commentWriter) {
        this.commentWriter = commentWriter;
    }

    public String getCommentContents() {
        return commentContents;
    }

    public void setCommentContents(String commentContents) {
        this.commentContents = commentContents;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CommentDTO() {
        // 빈 생성자, 필드 초기화는 하지 않음
    }

    private static Long idValue = 1L;      // 댓글 고유번호 생성을 위한 변수

    public CommentDTO(Long boardId, String commentWriter, String commentContents) { // 매개변수가 있는 생성자 // 댓글 작성 시 호출되어 댓글 정보를 초기화함
        this.id = idValue++;     // 고유번호 생성 및 증가
        this.boardId = boardId;
        this.commentWriter = commentWriter;
        this.commentContents = commentContents;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")); // 현재 시간 생성 및 문자열 형식 지정
    }

    @Override
    public String toString() {   // 댓글 정보를 문자열로 반환하는 메소드
        return "CommentDTO{" +
                "id=" + id +
                ", commentWriter='" + commentWriter + '\'' +
                ", commentContents='" + commentContents + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}