package ch02;

public class Ex05_IncreaseDecreaseOperator {

    public static void main(String[] args) {
        // 증감연산자
        int num1 = 10, num2 = 0, num3 = 0;
        System.out.println("num1: " + num1 + "num2: " + num2 + "num3: " + num3);
        num2 = ++num1;
        System.out.println("num1: " + num1 + "num2: " + num2 + "num3: " + num3);
        num2 = ++num1;
        num3 = num1++;
        System.out.println("num1: " + num1 + "num2: " + num2 + "num3: " + num3);

        int result1 = num1++ + ++num2;
        System.out.println("num1: " + num1 + "num2: " + num2 + "num3: " + num3);
        System.out.println(result1);


        // 증감연산자
        // ++, --
        int a = 10;
        System.out.println(a++); // 10 // 값을 출력하고 더함. ==> 후치증가
        System.out.println(++a); // 12 // 값을 더하고 출력. ==> 전치증가

    }

}
