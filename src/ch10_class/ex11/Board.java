package ch10_class.ex11;

/**
 게시글 클래스

 필드
 글번호(id) - Long 타입
 제목(boardTitle)
 작성자(boardWriter)
 내용(boardContents)
 조회수(boardHits)

 필드에 대한 getter/setter

 생성자 2가지

 toString method

 글조회 method
 name: findById
 parameter: id
 return: x
 실행내용
 main으로부터 글번호를 전달받고 글번호가 일치하면 해당 게시글의 내용을
 print로 출력해준다.
 단 출력하기 전에 조회수 값을 1 증가 시켜야 한다.
 */
public class Board {    /*  게시글 제목, 작성자, 내용 등의 정보를 저장하는 속성들 (id, boardTitle, boardWriter, boardContents)    */
    private Long id;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private int boardHits = 0;  /*  게시글 조회수를 기록하는 속성 (boardHits)    */

    public Long getId() {  /* 게시글 정보를 가져오는 getter 메소드들  */

        return id;
    }

    public void setId(Long id) {    /*  게시글 정보를 설정하는 setter 메소드들    */
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

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardContents='" + boardContents + '\'' +
                ", boardHits=" + boardHits +
                '}';
    }

    public Board() {    /*  기본 생성자와 인자를 받는 생성자  */

    }

    // hits는 기본값을 0으로 하면 되기때문에 생성자에서 제외
    public Board(Long id, String boardTitle, String boardWriter, String boardContents) {
        this.id = id;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContents = boardContents;
    }

    public void findById(Long id) {     /*  게시글 조회수를 증가시키고 정보를 출력하는 findById 메소드    */
        if (id.equals(this.id)) {
            // 조회수 증가
            boardHits = boardHits + 1;
            System.out.println("제목: " + boardTitle);
            System.out.println("작성자: " + boardWriter);
            System.out.println("조회수: " + boardHits);
            System.out.println("내용: " + boardContents);
        } else {
            System.out.println("없는 글번호 입니다.");
        }
    }
}