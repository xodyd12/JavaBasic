package 표준입출력;

public class 표준출력 {
    public static void main(String[] args) {
        //자바의 표준 출력은 크게 3가지
        // 줄 개행을 포함하지 않는 print();
        //자동으로 줄 개행 기능을 포함해주는 println();
        //형식 지정 표준 출력 함수 printf();
        System.out.print("안녕하세요~!");
        ;
        System.out.println("Hello~!~");
        System.out.print("안녕히가세요~ㅜㅜ");
        System.out.println("bye  bye~~");

        //위 처럼 print()는 괄호 안에 내용을 출력 후 다음 출력 문장을 위한 커서가 그 자리에 머무름
        //그래서 다음 문장이 가로로 붙혀서 출력됨
        //println()은 괄호 안에 내용을 출력한 후 다음 출력 문장을 위한 커서가 한 줄 아래에 머무름
        //그래서 다음 문장이 밑줄에 출력됨.
        //printf()는 서식 문자를 활용하여 먼저 문자열을 완성시킨 후,
        //서식 문자에 들어갈 값을 지정해서 출력하는 방식
        //printf()는 줄 개행 기능이 없기 때문에 따로 줄 개행 명령을 내려 주어야 함
        System.out.println("===========================================");
        /*
		 # 포맷팅 서식 문자 종류
		 %d: 부호가 있는 정수 데이터 (decimal)
		 %f: 실수 데이터 (floation point)
		 %s: 문자열 (String)

		 # 탈출 문자 (escape sequence) -> printf에만 동작하는 게 아니에요.
		 - 반드시 따옴표 내에 위치해야 합니다
		 - 문자열 내에서 특정 명령을 내리고 싶을 때 사용하는 특수 기호입니다.
		 \n: 줄 개행 명령
		 \t: 가로 공백 (스페이스 4칸)
		 \\: 백슬래시 문자를 나타낼 때 사용.
     \': 홑 따옴표를 문자로 출력할 때 사용
     \": 쌍 따옴표를 문자로 출력할 때 사용
		 */

        int month = 12;
        int day = 25;
        String anni = "크리스마스";

        //12월 25일은 크리스 마스 입니다.
        System.out.println(month + "월 "+day+"일은 "+anni+" 입니다.");
        System.out.printf("%d월 %d일은 %s 입니다.\n",month,day,anni);

        System.out.println("===========================================");
        //실수를 표현 하는 서식문자 %f - > 기본 6자리까지 표현
        //%.[자리수를 지정하는 숫자]f -> 원하는 자리수까지 표현
        //%라는 문자 자체를 표현할 때는 %% 쓰시면 됩니다.
        double rate = 64.126;
        System.out.printf("합격률은 %.2f%%입니다. \n",rate);

    }
}
