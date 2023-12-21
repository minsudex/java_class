package ch06_for;

public class Ex01_ForBasic {
    public static void main(String[] args) {
        // 0 ~ 3 출력
        // i는 0부터 시작하여 1씩 증가하며, 조건이 만족하는 동안 반복문 내의 문장들을 수행한다.
        // 조건이 만족하지 않으면 반복문이 종료된다.
        for (int i = 0; i < 4; i++) {
            System.out.println("i = " + i);
        }
        // 0 ~ 4 출력
        // i는 0부터 시작하여 1씩 증가하며, 조건이 만족하는 동안 반복문 내의 문장들을 수행한다.
        // 조건이 만족하면 반복문이 종료된다.
        for (int i = 0; i <= 4; i++) {
            System.out.println("i = " + i);
        }

        // 반복변수 초기값이 조건을 만족하지 않는다면
        // i는 10부터 시작하여 1씩 증가하며, 조건이 만족하는 동안 반복문 내의 문장들을 수행한다.
        // 조건이 만족하지 않으므로 반복문이 실행되지 않는다.
        for (int i = 10; i <= 4; i++) {
            System.out.println("보이나요?");
            System.out.println("i = " + i);
        }
        // i는 for문 내에서 선언된 지역변수이기 때문에 for문을 벗어나면 사용불가
        // 다음과 같이 i를 출력하면 오류가 발생한다.
        // System.out.println(i);

        // 반복문 종료 후에도 반복변수를 사용하려면
        // i를 for문 밖에서 선언하고 초기화해야 한다.
        int j = 0;
        for (j = 0; j < 3; j++) {
            System.out.println("j = " + j);
        }
        System.out.println("반복문 종료 후 j = " + j);


    }
}