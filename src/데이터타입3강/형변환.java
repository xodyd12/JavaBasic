package 데이터타입3강;

public class 형변환 {
    public static void main(String[] args) {
        byte b = 10;
        int i = b; //타입 불일치! b의 타입을 int로 자동 형 변환해서 연산을 진행!

        System.out.println(i);

        System.out.println("=====================================");
        char c = 'A';
        int j = c; //c의 타입을 int로 변환하면서 c가 가진 'A'가 문자표 번호 65로 변환됨.
        System.out.println("A의 문자 번호표 = " + j);

        System.out.println("=====================================");

        int k = 500;
        double d = k; //k의 타입을 double로 변환 하면서 소수점을 표현할 수 있게 값이 변환됨.
        System.out.println(d);

        System.out.println("=====================================");

        char f = 'B';
        int g = 2;
        int intResult = f + g; //char가 int로 자동 형 변환됨. int 변수에는 그냥 들어간다.

        char charResult = (char) (f + g); //결과가 int인데 char로 들어가려 하니 명시적 형 변환 진행
        System.out.println(intResult);
        System.out.println(charResult);

        System.out.println("=====================================");

        //값의 손실이 따로 없는 경우, 72는 int와 char 둘 다 표현 가능한 범위 이기 때문
        int z = 72;
        char h = (char) z; // z의 타입이 h보다 크다. 자동으로 진행 안됨. 명시적 형 변환 진행!
        System.out.println("72의 문자값은"+h);

        //값의 손실이 발생하는 경우. int 는 소수점을 표현 불가능
        double o = 4.98764;
        int p = (int)o; //o의 타입이 p보다 크기 때문에 명시적 형 변환 진행! 이 과정에서 소수점은 사라짐
        System.out.println(p);

        //값이 박살나는 경우
        int y = 1000;
        byte l = (byte) y; //int를 byte로 변환
        System.out.println(l); //값이 박살남. 1000은 byte가 표현할 수 있는 범위가 아님

        //명시적 형 변환이 꼭 필요한 경우가 아닌데 일부러 해 주는경우
        int n = 10;
        // n /4의 결과는 int이기 때문에 소수점 표현이 불가능
        //그래서 n의 타입을 일부러 double로 변환하여 double의 연산을 진행.
        //4를 4.0으로 표현해도 좋다. 실수의 기본 타입은 double이기 때문에 double의 연산을 진행
        double q = (double) n/4;
        System.out.println(q);
    }
}
