package ch13_map;

import java.util.HashMap;
import java.util.Map;

public class Ex01_MapBasic {
    public static void main(String[] args) {
        // key: 정수(int), value:String
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "안녕");
        map1.put(2, "hello");
        // map1 put(3, 100);    // value 타입 불일치
        // map1,put("4', "안녕하세요"); // key 타입 불일치
        // key가 1인 데이터
        System.out.println(map1.get((1)));
        String s1 = map1.get(2);
        System.out.println("s1=" + s1);
        map1.put(100,"ㅎㅎㅎㅎ");
        // 동일한 키에 다른 데이터를 넣는다면
        map1.put((1."안녕하십니까");
        System.out.println(map1.get(1));
        // 반복문으로 접근

    }
}
