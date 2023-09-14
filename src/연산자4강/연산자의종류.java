package 연산자4강;

public class 연산자의종류 {
    public static void main(String[] args) {
        //증감 연산자
        //변수의 값을 1씩 중가, 혹은 감소 시킬 때 사용하는 연산자.
        //변수의 앞이나 뒤에 ++혹은 --를 붙혀서 표헌함.
        //주로 단독적으로 많이 사용 되지만, 다른 연산자랑 함께 쓰였을 때는 연산 순서에 차이가 있음
        int num1 = 7, num2 = 7;
        int result1 = --num1 + 4; //앞에 붙으면 전위 연산, 선 중감 후 연산
        int result2 = num2-- + 4; //뒤에 붙으면 후위 연산 , 선 연산 후 증감

        System.out.println(result1); //10 num1을 먼저 감소시키고 +4를 진행
        System.out.println(result2); //11 +4를 먼저 진행하고 num2를 감소시킴

        System.out.println("=================================================");
        //논리 반전 연산자
        //논리상수나 논리 타입 변수 앞에 !를 붙이면 된다
        //단순히 논리값을 반전시킬 때 사용한다
        //나중에 조건문 등을 사용할 때 논리를 반대로 뒤집어서 조건식을 작성하고 싶은 경우 많이 사용
        boolean flag = false;
        System.out.println(!flag); //true
        System.out.println("=================================================");
        //이항 연산자 (피 연산자가 둘인 연산자)
        int a = 5;
        int b = 5;

        b =+ 3; // b = +3; -->이건 대입 연산이 아님!!!! 순서 잘 지키기
        System.out.println(b);

        a += 3; // a = a + 3 -->기존의 a에 3을 더한 값을 새롭게 대입하겠다.
        System.out.println(a);

        a -= 4; // a = a - 4
        System.out.println(a);

        a *= 6; // a = a * 36
        System.out.println(a);

        a /= 5; //a = a / 5
        System.out.println(a);

        a %= 3; // a를 3으로 나눈 후 나머지를 구한 후 저장
        System.out.println(a);

        System.out.println("=================================================");
        //비교 연산자
        int x  = 10, y = 20;
        System.out.println(x != y); //true (10은 20과 같지 않다 해서 true)

        System.out.println("=================================================");
        //논리 연산자
        //종류는 (&,&&,|,||)
        int  c = 10 , d = 20;

        System.out.println(x > 10 && (y / 0 == 10)); //false
        System.out.println(x > 10 || y < 30); //true

        System.out.println("=================================================");
        //삼항 연산자
        //피 연산자를 세게 가지는 연산자
        //논리형 조건식 ? 반환값1 : 반환값2
        //조건식을 비교하여 true일 경우 좌항이, false 일 경우 우항의 값이 표출됨
        int z  = 10, o = 20;

        String result = ( z > o ? "z는 o보다 큽니다.": "z는 o보다 작습니다.");
        System.out.println(result);

    }


}
