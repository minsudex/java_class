package ch11_classes.ex06_memberboard.repository;   //  코드가 속한 패키지를 지정합니다.

import ch11_classes.ex06_memberboard.dto.MemberDTO; //  MemberDTO 클래스를 사용하기 위해 불러옵니다.

import java.util.ArrayList; //  ArrayList 클래스를 사용하기 위해 불러옵니다.
import java.util.List;      //  List 인터페이스를 사용하기 위해 불러옵니다.

public class MemberRepository {     //  회원 관리 기능을 담당하는 MemberRepository 클래스를 선언합니다.
    private static List<MemberDTO> memeberDTOList = new ArrayList<>();  //  회원 데이터를 저장할 ArrayList 객체를 생성합니다.

    public MemberDTO emailCheck(String memberEmail) {
        for (MemberDTO memeberDTO: memeberDTOList) {
            if(memberEmail.equals(memeberDTO.getMemberEmail())) {
                return memeberDTO;
            }
        }
        return null;
    }

    public boolean save(MemberDTO memberDTO) {
        return memeberDTOList.add(memberDTO);
    }
    //  회원 정보를 저장하는 메서드입니다. 전달받은 memberDTO 객체를 memeberDTOList에 추가하고 성공 여부를 반환합니다.
    public List<MemberDTO> findAll() {
        return memeberDTOList;
    }
    //  모든 회원 목록을 조회하는 메서드입니다. memeberDTOList를 반환합니다.
    public MemberDTO update(String memberEmail, String memberName, String memberMobile) {
        for (int i = 0; i < memeberDTOList.size(); i++) {
            if(memberEmail.equals(memeberDTOList.get(i).getMemberEmail())) {
                memeberDTOList.get(i).setMemberName(memberName);
                memeberDTOList.get(i).setMemberMobile(memberMobile);
                return memeberDTOList.get(i);
            }
        }
        return null;
    }

    public boolean delete(String loginEmail, String loginPassword) {
        boolean result = false;
        for (int i = 0; i < memeberDTOList.size(); i++) {
            if(loginEmail.equals(memeberDTOList.get(i).getMemberEmail()) && loginPassword.equals(memeberDTOList.get(i).getMemberPassword())) {
                memeberDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }
}