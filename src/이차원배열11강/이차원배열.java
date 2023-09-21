package 이차원배열11강;

import java.util.Arrays;

public class 이차원배열 {
    public static void main(String[] args) {
        /*
        2차원배열 이란?
        쉽게 말하면 배열 안에 배열들이 들어있는 형태 입니다.
        2차원 배열을 생성할 때에는 배열의 크기와 두번째 배열의 크기를 지정합니다
         */
        int[][] arr2d = new int[3][4];

       //위 코드는 3행 4열의 int형 2차원 배열 입니다.
        /*
            {
	            {0, 0, 0, 0},
	            {0, 0, 0, 0},
	            {0, 0, 0, 0}
            }
            이런식입니다.
         */
        //값을 넣어보면
        arr2d[1][2] =50; //1행2열에 50 넣기
        arr2d[2][1] =70; //2행2열에 70 넣기


        System.out.println(Arrays.deepToString(arr2d));

    }
}
