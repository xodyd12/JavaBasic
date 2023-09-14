package 조건문6강;

import java.util.Scanner;

public class 중첩if문 {
    public static void main(String[] args) {
        //만약 첫번째 조건이 참일 경우 한번 더 조건을 지정하여 분기를 나누고 싶다면 if문 안에 다른 if문을 사용할 수 있음. 이를 중첩 if문이라고 함

        Scanner sc = new Scanner(System.in);

        System.out.println("키를 입력해주세요! :");
        int height = sc.nextInt();

        if(height >= 140){
            System.out.println("나이를 입력하세요 !:");
            int age = sc.nextInt();
            if(age >= 8){
                System.out.println("놀이기구에 탑승 합니다.");
                System.out.println(height);
            } else if (age>= 6) {
                System.out.println("보호자 동반 시 탑승이 가능 합니다.");
            }else{
                System.out.println("나이가 6세 미만 입니다.");
                System.out.println("놀이기구 탑승이 불가능 합니다.");
            }
        }else {
            System.out.println("키가 140cm 미만 입니다.");
            System.out.println("놀이기구 탑승이 불가능 합니다.");
        }

        sc.close();
    }
}
