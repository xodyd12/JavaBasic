package 배열기초9강;

import java.util.Arrays;
import java.util.Scanner;

public class 배열수정및삭제 {
    public static void main(String[] args) {

        /*
        배열의 수정은 아주 간단하다
        해당 인덱스에 접근하여 값을 밀어 넣으면 끝
         */

        String[] foods = {"치킨","피자","족발","햄버거"};
        foods[0] = "짜장면";
        foods[2] = "김밥";

        System.out.println(Arrays.toString(foods));


        //인덱스 찾기

        Scanner sc = new Scanner(System.in);
        System.out.println("탐색할 음식을 입력해 주세요!");
        String name = sc.next();

        for (int i = 0; i < foods.length; i++) {
            if (name.equals(foods[i])){
                System.out.println("음식을 찾았습니다!");
                System.out.println("인덱스 " +i+"번입니다.");
                break;
            }
            if(name!=foods[i]){
                System.out.println("음식을 찾지 못했습니다! 다시 확인 해주세요!");
                break;
            }
        }
        //배열을 삭제
        /*
        1. 일단 삭제될 데이터가 몇 번 인덱스 인지 구한다.
        2. 삭제하고자 하는 인덱스를 기준으로 잡고, 뒤에 있는 값을 앞으로 한칸씩 땡긴다.
        3. 기존의 배열보다 크기가 하나 작은 배열을 선언한다.
        4.반복문을 이용하여 값을 그대로 새로운 배열로 내려준다.
        5.새로운 배열의 주소값을 기존의 배열로 넘긴다.
         */

        //7 이라는 값을 삭제 할 것 입니다.
         int[]arr = {1, 3, 5, 7, 9, 11, 13};
        int[]temp = new int[arr.length -1]; //{0,0,0,0,0,0}

//        arr[3] = arr[4];
//        arr[4] = arr[5];
//        arr[5] = arr[6];
        /*
        3번 인덱스에는 4번 인덱스가 오고
        4번 인덱스에는 5번 인덱스가 오고
        5번 인덱스에는 6번 인덱스가 온다.
        위를 for문으로 한다면
         */
        for (int i = 3; i <arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        for(int j = 0; j<temp.length; j++){
            temp[j] = arr[j];
        }
        arr = temp;
        temp = null;

        System.out.println(Arrays.toString(arr));
    }
}
