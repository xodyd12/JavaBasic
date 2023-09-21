package 배열기초9강;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        /*
        배열을 선언하는 방법은 다음과 같다
        타입[] 변수이름;
         */


    /*
    배열을 선언했다면,
    배열 객체를 생성해서 실제 값들이 저장될 공간을 현성한다.
     */
        int[] arr = new int[5]; //java style

        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]

        /*
        배열 객체도 생성 했다면 이제 값을 저장 해본다
        값을 저장 할때는 인덱스를 통해 수행한다.
        인덱스란? 배열 내부의 위치를 지정할 수 있는 값이다.
        인덱스의 번호는 0번부터 시작하여 1씩 순차적 증가한다
         */
        arr[0] = 65;
        arr[1] = 88;
        arr[2] = arr[0];
        arr[3] = (int) 3.14;
        arr[4]  = 100;

        System.out.println("arr배열의 길이! = " + arr.length); // 5

        // 배열을 생성할 때, 값을 지정하여 초기화 할 수 있다.

        int[] numbers = {1, 2, 3, 4,5};
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);

        /*
        배열의 요소를 반복적으로 처리해야 할 때, for문을 사용할 수 있다.
        인덱스를 제어변수로 이용하면 for문을 작성하기 편하다.
         */

        for (int idx = 0; idx<numbers.length; idx++){
            System.out.printf("배열의 %d번째 데이터: %d\n",idx+1, numbers[idx]);
        }


        //for-each문(향상된 for문)

        String[] week = {"월","화","수","목","금","토","일"};

//        for(int i=0; i<week.length; i++){
//            System.out.println(week[i] +"요일 좋아~");
//        }

        //for문 보다 for-ea

        for(String day : week){
            System.out.println(day + "요일 좋아~");
        }





    }
}
