package 데이터타입;

public class 문자형 {
    public static void main(String[] args) {
        //단일 문자를 표현할 수 있는 데이터 타입
        //홑따옴표(' ')안에 문자를  한 개만 넣어서 표현함.
        //2byte의 크기 -> 전세계의 문자를 다룰수 있도록 설계된 표준 문자 전산 처리 방식
        //총 65536자를 표현 가능


        char c1 = 'A'; //단일문자 A를 저장하려고 했지만 실제 컴퓨터는 A를 저장하지 못함.
        char c2 = 65; //그래서 이렇게 유니코드 문자표의 번호를 저장함

        System.out.println(c1); //A
        System.out.println(c2); //B


        System.out.println("=======================================");

        //단일 문자 들이 쭉 나열 되어 있는 형태를 문자열 이라고 함.
        //자바 에서는 String 이라는 타입을 이용 해서 표헌함.
        //쌍 따옴표(" ")를 통해 여러 문자 들을 한 번에 묶을 수 있음.

        // *String 은 기본 데이터 타입이 아님 ! 클래스 타입임 ! *

        String s1 = "my dream";
        String s2 = "is Programmer";
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1 + s2); //my dream is Programmer

        //문자열과 다른 데이터 타입 간의 연산
        //결과는 무조건 문자열의 덧셈 연산과 같음
        System.out.println("=======================================");

        System.out.println(100 + 100); // 200
        System.out.println("100"+"100"); //100100
        System.out.println("100"+100); //100100
        System.out.println(3.14+"hi"); //3.14hi

        System.out.println("=======================================");
        int month = 10;
        int day = 13;

        //내 생일은 10월 13일 입니다.
        System.out.println("내 생일은"+month+"월"+day+"일 입니다.");

    }



}
