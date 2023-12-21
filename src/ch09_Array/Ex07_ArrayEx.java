package ch09_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex07_ArrayEx {
    public static void main(String[] args) {
        /** int[] = {3,2,4,1,5}
         * 위와 같은 배열이 있을 때
         * {1, 2, 3, 4, 5} 와 같이 오름차순 정렬을
         * 하는 코드를 작성
         */
        int[] num = {3, 2, 4, 1, 5};
        //  정렬할 배열을 선언합니다.
        //  중첩 for를 이용하여 정렬하기
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                // 현재 인덱스 i의 값이 다음 인덱스 j의 값보다 크면
                if (num[i] > num[j]) {
                    // 두 값을 바꿔준다.
                    int temp = num[i];

                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        // 정렬된 배열을 출력
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}

