package ch11_classes.ex04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex_Date {
    public static void main(String[] args) {
        // 날짜정보 다루기
        // 현재시간 확인
        LocalDateTime now = LocalDateTime.now();  // 현재 날짜와 시간 가져오기
        System.out.println("now = " + now);       // 현재 날짜와 시간 출력
        // 날짜 데이터를 원하는 형식으로 다루기
        String year = now.format(DateTimeFormatter.ofPattern("yyyy"));  // 원하는 형식의 날짜 문자열 만들기
        System.out.println("year = " + year);    // 년도만 추출
        String month = now.format(DateTimeFormatter.ofPattern("MM"));
        System.out.println("month = " + month);     // 월만 추출
        String day = now.format(DateTimeFormatter.ofPattern("dd"));
        System.out.println("day = " + day);     // 일만 추출
        String hour = now.format(DateTimeFormatter.ofPattern("HH"));    // 원하는 형식의 시간 문자열 만들기
        System.out.println("hour = " + hour);   // 시만 추출
        String minute = now.format(DateTimeFormatter.ofPattern("mm"));
        System.out.println("minute = " + minute);   // 분만 추출
        String second = now.format(DateTimeFormatter.ofPattern("ss"));
        System.out.println("second = " + second);   // 초만 추출
        String createAt = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));   // 게시물 생성 시간 형식 지정
        System.out.println("createAt = " + createAt);
        System.out.println("second = " + second);
        createAt = now.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH시mm분ss초"));
        System.out.println("createAt = " + createAt);






    }
}
