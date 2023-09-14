package 반복문7강;

import java.util.Scanner;

public class for문_소수구하기 {
    public static void main(String[] args) {
        /*
        정수를 하나 입력받고 해당 숫자까지의 모든 소수를 가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합시다.

        ex)
        입력 받은 수 -> 30
        소수 : 2 3 5 7 11 13 17 19 23 29
        소수의 개수 : 10개
         */

       Scanner sc =  new Scanner(System.in);
        System.out.println("정수 : ");
        int num = sc.nextInt();

        int count = 0; //소수의 개수를 세 줄 변수.

        System.out.println("소수 : ");
        for (int i = 1; i <= num ; i++) {
            int cnt  = 0;
            for (int j = 1; j <i; j++) {
                if (i % j == 0){
                    cnt++;
                }
            }
            if(cnt ==2){
                System.out.println(i + " ");
                count++;
            }
        }
        System.out.println("\n소수의 개수 : " + count + "개");
        sc.close();
    }
}
