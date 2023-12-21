package ch07_while;

public class Ex04_WhileEx {
    public static void main(String[] args) {
        /**
         * random() 메서드를 이용해서 1~6이 나오는 주사위를 설정하고
         * 주사위가 계속 던져지면서 6이 나오면 종료되는 코드 작성
         */
//        System.out.println((int)(Math.random() * 6) + 1);
//        int number = 0;
//        while (number != 6) {
//            number = (int) (Math.random() * 6) + 1;
//            System.out.println(number);
//    }
//}
//}
        boolean run = true;
        // 무한루프를 위해 run 변수를 true로 초기화합니다.
        while (run) {
            // 1~6 사이의 난수를 발생시킵니다.
            int num = (int)(Math.random() * 6) + 1;
            // 난수를 출력합니다.
            System.out.println("num = " + num);
            // 난수가 6이면 무한루프를 종료합니다.
            if (num == 6) {
                run = false;
            }
        }
    }
}




