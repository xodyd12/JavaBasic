package 반복문7강;

public class while문 {
    public static void main(String[] args) {
        /*
        특정한 조건이나 획수에 따라서 코드 블록을 반복적으로 실행 시키고 싶을 때 사용하는 문법
        반복적인 형태로 진행해야 할 일이 앞으로 정말 많을 것이다.
        자바에서 주로 많이 사용하는 반복문 키워드는 두 가지이다.
        while문과 for문이다. 먼저 while문에 대해서 알아보자
         */
        int n = 1;
        while (n <= 10) {
            System.out.println("안녕하세요 반갑습니다~" + n);
            n++; //증감식: 반복문의 종료를 위해 제어변수의 값을 조정(step)
        }

        System.out.println("==================================");

        //1~10까지의 누적 합계
        int i = 1; //begin
        int total = 0;

        while (i <= 10) { // end
            total += i; // total = total + i 즉 total은 계속 0 이고 i만 계속 증가 시켜서 total과 i를 더함
            i++; //step
        }
        System.out.println("1~10까지의 누적합 : " + total);
    }
}
/*
while 문을 실행 시키기 위한 필수 3요소인 begin,end,step을 기억하자
반복문의 횟수를 제어하는 제어변수가 선언되고, while 키워드 옆 조건식은 해당 제어변수가
어떤 조건에서 반복문을 종료시킬 수 있는지에 대한 끝을 지정한다.
그리고 반복문 내에는 제어변수 값을 변하게 해 주는 증감식을 배치하여 언젠가는 반복문의 조건식을
false로 만들어 탈출 할 수 있게 한다.
이것이 가장 기본 형태의 반복문이다 . begin,end,step을 기억하자
 */
