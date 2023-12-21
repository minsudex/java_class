package ch06_for;

public class Ex02_ForEx {
    public static void main(String[] args) {
        // 1~10까지 순서대로 출력
        // i는 1부터 시작하여 1씩 증가하며, 10보다 작을 동안 반복문 내의 문장들을 수행한다.
        // 반복문 내의 문장들은 i가 1부터 10까지 출력하는 문장이다.
        for (int i = 1; i < 11; i++) {
            System.out.println("i = " + i);
        }
        // 2 4 6 8 10 출력
        // i는 2부터 시작하여 2씩 증가하며, 10보다 작거나 같을 동안 반복문 내의 문장들을 수행한다.
        // 반복문 내의 문장들은 i가 2씩 증가하면서 출력하는 문장이다.
        for (int i = 2; i <= 10; i *= 2) {
            System.out.println("i= " + i);
        }
        // 5 4 3 2 1 출력
        // i는 5부터 시작하여 1씩 감소하며, 1보다 크거나 같을 동안 반복문 내의 문장들을 수행한다.
        // 반복문 내의 문장들은 i가 1씩 감소하면서 출력하는 문장이다.
        for (int i = 5; i >= 1; i--) {
            System.out.println("i= " + i);
        }
    }
}

