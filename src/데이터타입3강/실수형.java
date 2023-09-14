package 데이터타입3강;

public class 실수형 {
    public static void main(String[] args) {

        //float는 4byte의 실수형.
        // 소수점 이하 7자리 까지 표현 가능

        //double은 8byte의 실수형
        //소수점 이하 15자리 까지 표현 가능

        //자바의 실수형 기본 데이터 타입은 double로 인식

        float f = 1.234567F; //실수 리터럴이 double 이기 때문에 F를 붙여 float로 인식
        double d = 1.234567;

        System.out.println(f);
        System.out.println(d);
    }
}
