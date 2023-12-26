package ch12_classes.ex06_memberboard.dto;  // 회원 정보를 담는 클래스입니다.


import java.time.LocalDateTime;             // 현재 시간 정보를 사용하기 위해 LocalDateTime 클래스 불러오기
import java.time.format.DateTimeFormatter;  // 시간 형식을 지정하기 위해 DateTimeFormatter 클래스 불러오기

public class MemberDTO {
    private Long id;                 // 회원 고유번호
    private String memberEmail;     // 회원 이메일
    private String memberPassword;   // 회원 비밀번호
    private String memberName;      // 회원 이름
    private String memberMobile;    // 회원 휴대전화 번호
    private String createdAt;        // 회원 가입 시간

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public MemberDTO() {
        // 빈 생성자, 필드 초기화는 하지 않음
    }

    private static Long idValue = 1L;   // 회원 고유번호 생성을 위한 변수

    public MemberDTO(String memberEmail, String memberPassword, String memberName, String memberMobile) {
        // 매개변수가 있는 생성자
        // 회원 가입 시 호출되어 회원 정보를 초기화함
        this.id = idValue++; // 고유번호 생성 및 증가
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
        this.memberMobile = memberMobile;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));// 현재 시간 생성 및 문자열 형식 지정
    }

    @Override
    public String toString() {
        // 회원 정보를 문자열로 반환하는 메소드
        return "MemeberDTO{" +
                "id=" + id +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}