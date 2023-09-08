package 데이터타입;

public class 정수형 {
    public static void main(String[] args) {
        //자바에서 정수형 기본 데이터 타입은 int
        //그렇게 떄문에 변수에 대입되기 전 쌩 정수도 int로 인식
        //대입 되기 전 값을 리터럴 이라고 함
        byte b =127;

        short  s = 32767;

        int i = 2147483647;

        long l  = 2147483648L; //정수형 기본 타입이 int 라서 위에 L 을 붙혀서 long 으로 표현.

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

    }


}
