package 조건문6강;

import java.util.Scanner;

public class if문 {
    public static void main(String[] args) {

        //- java 언어에는 if문과 else if문, else 문을 사용할 수 있다.
        //- if 키워드 옆에 작성된 괄호 안에 논리형 조건식을 작성, 주어진 조건이 참(ture)면 if문 안에 있는 코드 블럭 실행
        //- else if 문은 if문 뒤에 따라붙는 조건문으로, if문이 실행되지 않았을 때 else if문의 조건이 참이면 else if문 안에 있는 코드 블럭을 실행
        //- else문은 모든 조건이 거짓(false)일때 실행되는 블록으로, if문ㅇ과 else if문이 실행되지 않았을 때 실행됨

        Scanner sc =  new Scanner(System.in);
        System.out.println("나이를 입력해 주세요! :");;
        int age = sc.nextInt();

        if(age >= 20){
            System.out.println("성인 입니다!");
        }else if(age >= 17){
            System.out.println("고등학생 입니다!");
        }else if(age >= 14){
            System.out.println("중학생 입니다!");
        } else if (age >= 8) {
            System.out.println("초등학생 입니다!");
        }else {
            System.out.println("미취학아동 입니다!");
        }
        sc.close();
    }
}
