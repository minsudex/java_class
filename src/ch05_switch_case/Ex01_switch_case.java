package ch05_switch_case;

public class Ex01_switch_case {
    public static void main(String[] args) {
        int num = 0;                                //  정수 값을 0으로 초기화합니다.
        switch (num) {                              //  입력받은 정수 값을 switch-case문의 조건으로 사용합니다.
            case 0: // num == 0                     //  입력받은 정수 값이 0이면 "num은 0입니다."를 출력합니다.
                System.out.println("num은 0입니다.");   //
                break;
            case 1: // num == 1                     //  입력받은 정수 값이 1이면 "num은 1입니다."를 출력합니다.
                System.out.println("num은 1입니다.");
                break;
            case 2: // num == 2                     //  입력받은 정수 값이 2이면 "num은 2입니다."를 출력합니다.
                System.out.println("num은 2입니다.");
                break;
            default:
                System.out.println("1,2,3이 아닙니다.");     //  위의 case 조건에 해당하지 않는 경우 "1,2,3이 아닙니다."를 출력합니다.
                break;
        }
        System.out.println("Switch Case 종료");

        String city = "인천";     //   *    문자열 값을 "인천"으로 초기화합니다.
        switch (city) {         //   *    입력받은 문자열 값을 switch-case문의 조건으로 사용합니다.
            case "서울":
                System.out.println("서울 입니다.");      //   *    입력받은 문자열 값이 "서울"이면 "서울 입니다."를 출력합니다.
                break;
            case "인천":
                System.out.println("인천 입니다.");      //   *    입력받은 문자열 값이 "인천"이면 "인천 입니다."를 출력합니다.
                break;
            case "제주":
                System.out.println("제주 입니다.");      //   *    입력받은 문자열 값이 "제주"이면 "제주 입니다."를 출력합니다.
                break;
            default:                                    //   *    위의 case 조건에 해당하지 않는 경우 "한국이 아니에요"를 출력합니다.
                System.out.println("한국이 아니에요");
                break;
        }
    }
}
