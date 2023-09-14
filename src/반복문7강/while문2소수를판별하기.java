package 반복문7강;

import java.util.Scanner;

public class while문2소수를판별하기 {
    public static void main(String[] args) {
        /*
        정수 1개를 입력 받아서 해당 정수가 (prime number)인지 판별하시면 됩니다.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요!");
        int num = sc.nextInt();

        int i = 1; //소수의 판별을 위해 입력받은 정수 num을 지속적으로 나누어 볼 변수
        int count = 0; // 나누어 떨어진 횟수를 기억할 변수

        while (i <= num){
            if(num % i == 0){
                count++;
            }
            i ++;
        }
        if(count == 2){
            System.out.println(num+"은(는) 소수 입니다.");
        }else{
            System.out.println(num+"은(는)소수가 아닙니다.");
        }

        //다른 방법

        int j = 2; //1은 모든 수의 약수 이기 때문에 배제 합니다.

        //1을 제외시킨다면, 소수는 이제 약수가 자기 자신밖에 없으므로
        //조건싟을 false로 만들기 위해서 j는 num까지 커져야만 합니다.
        while(num % j != 0){
            j ++;
        }
        System.out.println(num == j ? "소수입니다." : "소수가 아닙니다.");

    }
}
