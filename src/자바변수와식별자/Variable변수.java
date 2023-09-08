package 자바변수와식별자;

public class Variable변수 {
    public static void main(String[] args) {
        int score;

        score = 70;

        System.out.println(score); //70

        //선언과 초기화를 동시에 하기
        int age = 60;
        age = 40;
        System.out.println(age); //40

        //대입 연산자를 기준으로 좌측이 영역, 우측이 값
        int doubleScore = score * 2; // 70 * 2
        System.out.println(doubleScore);

//        int score = 95; (x) 이미 score 라는 변수가 존재함

        String name = "홍길동";
//      String name =1004; (x)타입에 맞는 값을 할당하기
        System.out.println(name);
    }
}
