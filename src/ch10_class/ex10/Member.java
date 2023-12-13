package ch10_class.ex10;
// * 회원 정보 클래스
// * 회원 정보
// *    - 이메일(memberEmail)
// *    - 비밀번호(memberPassword)
// *    - 이름(memberName)
// *    - 전화번호(memberMobile)
public class Member {
    private String MemberEmail;
    private String MemberPassword;
    private String MemberName;
    private String MemberMobile;


// *  getter/setter

    public String getMemberEmail() {
        return MemberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        MemberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return MemberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        MemberPassword = memberPassword;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public String getMemberMobile() {
        return MemberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        MemberMobile = memberMobile;
    }


// *  생성자 2가지

    public  Member() {
        MemberEmail = "";
        MemberPassword = "";
        MemberName = "";
        MemberMobile = "";
    }

    public Member(String MemberEmail, String MemberPassword, String MemberName, String MemberMobile) {
        this.MemberEmail = MemberEmail;
        this.MemberPassword = MemberPassword;
        this.MemberName = MemberName;
        this.MemberMobile = MemberMobile;
    }
// *  로그인 처리 메서드
// *    name: memberLogin
// *    parameter: memberEmail, memberPassword
// *    return type: boolean
// *    실행내용: 이메일, 비밀번호가 일치하면 true,
// *              일치하지 않으면 false 리턴
// */

    public boolean memberLogin(String memberEmail, String memberPassword) {
        boolean result = false;
        if (MemberEmail.equals(this.MemberEmail) && this.MemberPassword.equals(memberPassword)) {
//            return true;
            result = true;
        } else {
//            return false;
        }
        return result;
    }

}
//Alt + insert 생성자 단축키
