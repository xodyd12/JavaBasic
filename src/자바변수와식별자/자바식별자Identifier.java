
package 자바변수와식별자;

public class 자바식별자Identifier {
    public static void main(String[] args) {
//        int 700 = 365;  (x)변수는 숫자로 사용 금지
//        int 7qodqpd = 365; (x)숫자로 시작 금지

        int age = 27;
        int Age = 32;  //둘은 서로 다른 변수 입니다.

        System.out.println(age);
        System.out.println(Age);

        System.out.println("============================");
//

        int number7 = 7; // ok
        int num7ber = 7; //ok

        System.out.println(number7);
        System.out.println(num7ber);
        System.out.println("===========================");

//        int my birth day = 20000906; 공백 x
        int myBirthday = 2000906; //ok

        System.out.println(myBirthday);
        System.out.println("==========================");

//        String class = "클래스"; 키워드 x
        String Class = "클래스" ;//추천x
        String className = "클래스" ;//차라리 이렇게 쓰자

        int i = 3; // 이건 괜찮지만  , 중요한 값 이라면 변수는 뜻이 있도록 저장하자 !

        System.out.println(Class);
        System.out.println(className);
        System.out.println(i);
    }
}
