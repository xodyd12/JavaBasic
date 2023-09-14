package 조건문6강;

import java.util.Scanner;

public class switch와case문 {
    public static void main(String[] args) {
        //조건문을 꾸미는 키워드는 if, else if,else만 있는것이 아닙니다.
        //switch문은 기준이 되는 변수나 식의 결과에 따라서 여러 개의 case문 중 하나를 선택하여 실행하는 제어문 입니다.
        //switch문을 살펴 봅시다.

        Scanner sc = new Scanner(System.in);

        System.out.println("성별을 입력해 주세요(M/F) :");
        System.out.println("> ");
        String gender = sc.next();

        /*
        -switch 키워드 뒤에 나오는 괄호는 boolean형 조건식이 아닌
        변수나, 변수의 연산식을 적어야 하며, 타입은 정수, 문자열만 가능함.
         */

        switch (gender){
            case "m": case "M": // swtich문 내부의 case문 뒤에는 중괄호가 아니라 콜론( : )을 붙힌다.
                System.out.println("남자 입니다.");
                break; //해당 case만 실행하고 switch문을 종료하라!
            case "w": case "W": // swtich문 내부의 case문 뒤에는 중괄호가 아니라 콜론( : )을 붙힌다.
                System.out.println("여자 입니다.");
                break; //해당 case만 실행하고 switch문을 종료하라!
            default: //일치 하지 않는 case문이 없으면 default문이 실행 되고, default문은 안써도 무방함
                System.out.println("잘못된 입력 입니다.");
        }

        sc.close();
    }
}
