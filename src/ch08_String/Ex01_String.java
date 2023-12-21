package ch08_String;

public class Ex01_String {
    public static void main(String[] args) {
        String str1= "안녕";
        String str2= "안녕";
        String str3= new String( "안녕");
        // str1, str2 같은지
        System.out.println(str1 == str2);
        // str1과 str2는 같은 문자열을 참조하고 있는지 비교합니다.
        // str1과 str2는 모두 "안녕"이라는 문자열을 참조하고 있으므로 true가 출력됩니다.
        System.out.println(str1 == str3);
        // str1과 str3는 같은 문자열을 참조하고 있는지 비교합니다.
        // str1은 "안녕"이라는 문자열을 참조하고 있지만, str3은 새로운 String 객체를 생성하여 참조하고 있습니다.
        // 따라서 str1과 str3은 같은 문자열을 참조하고 있지 않으므로 false가 출력됩니다.
        System.out.println(str1.equals(str3));
        // str1과 str3은 같은 문자열을 가지고 있는지 비교합니다.
        // str1과 str3은 모두 "안녕"이라는 문자열을 가지고 있으므로 true가 출력됩니다.
    }
}
