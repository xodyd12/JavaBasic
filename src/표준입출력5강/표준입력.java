package 표준입출력5강;

import java.util.Scanner; // Scanner 클래스의 정보를 import 해야 사용 가능
public class 표준입력 {

    /*새로운 스캐너 객체를 생성하고, 괄호 안에는 자바의 표준 입력 명령을 전달
     * 그리고 나서 sc 라는 변수에 스캐너 객체를 담는다. 그렇다면 sc타입은 스캐너를
     * 담고 있으니 타입이 Scanner겠구나~ 정도로 해석 하면 충분하다
     * 변수명은 in, input, sc , scan 뭐든 좋다. 이 네개를 주로 사용한다.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Scanner의 함수들을 이용하여 데이터를 입력받을 수 있습니다.
        * -next(): 공백이 없는 문자열을 입력 받습니다.
        * -nextLine(): 공백을 포함한 문자를 입력 받습니다.
        * -next + 기본타입이름(): 해당 타입에 맞는 데이터를 입력 받습니다.
        * ex)
        * nexttInt() : 정수 데이터를 입력 받는다.
        * nextDouble() : 실수 데이터를 입력 받는다.
        * nextBoolean() : 논리형 데이터를 입력 받는다.
        * nextLong() : 정수(Long) 데이터를 입력 받습니다.
        *
        * *char 데이터를 받는 메서드는 따로 없습니다. 한 글자여도 문자열로 만드세요
        * */

        System.out.print("이름 : "); //무엇을 입력할 지 간단한 출력문을 작성
        String name = sc.next(); //입력받은 문자열을 next()가 받아서 name에 할당 해준다.

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt(); //입력받은 정수를 nextInt()가 받아서 age에 할당해 준다.

        //제 이름은 한태용 이고 나이는 24 입니다.를 입력 후 출력
        System.out.println("제 이름은" + name +"이고, 나이는"+age+"세 입니다.");
        System.out.printf("제 이름은 %s이고, 나이는%d입니다.",name, age);

        /*next()와 nextLine()의 차이점!
        * next 는 공백을 기준으로 공백 전 까지의 문장만을 읽어옴.
        * nextLine()은 한줄, 그러니까 한 줄에 입력된 여러 문장을 공백까지 포함해서 읽습니다.*/

        sc.close();
    }
}
