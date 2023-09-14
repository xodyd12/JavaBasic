package 탈출문8강;

import java.util.Scanner;

public class break_연습문제 {
    public static void main(String[] args) {
        /*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		  지속적으로 문제를 출제한 후 정답을 입력받으세요.
		  사용자가 0을 입력하면 반복문을 탈출시키세요.

		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.

		 3. 문제 풀이는 주석으로 달아놓을 것
		*/

        Scanner sc = new Scanner(System.in); //정답을 입력 할 표준 입출력 Scanner를 출력
        int cCount = 0; // 정답 개수
        int iCount = 0; // 오답 개수

        System.out.println("*** 연산 퀴즈 ***");
        System.out.println("# 종료하시려면 0을 입력해 주세요 !");

        while (true) { // 0이 나올때까지 반복문을 출력 즉, 0을 입력하지 않으면 내가 무슨 값을 입력하든 전부 true임
            int random1 = (int) ((Math.random() * 100) + 1); // 랜덤 함수를 사용해서 사칙연산의 처음 값을 지정
            int random2 = (int) ((Math.random() * 100) + 1); // 랜덤 함수를 사용해서 사칙연산의 두번 째 값을 지정
            int num = (int) ((Math.random() * 3) + 1); // 랜덤 함수를 사용해서 0은 덧셈 1은 뺄셈 2는 곱셈 3은 나눗셈으로 만듦
            int correct = 0; // 연산을 한것을 correct에 저장

            if (num == 0) { // 랜덤함수 num이 0이면 덧셈을 출력
                System.out.printf("%d + %d = ???\n", random1, random2);
                correct = random1 + random2; //덧셈 연산을 correct에 저장
            } else if (num == 1) { //랜덤함수 num이 1이면 뺄셈을 출력
                System.out.printf("%d - %d = ???\n", random1, random2);
                correct = random1 - random2; //뺼셈 연산을 correct에 저장
            } else if (num == 2) { //랜덤함수 num이 2이면 곱셈을 출력
                System.out.printf("%d * %d = ???\n", random1, random2);
                correct = random1 * random2; //곱셈 연산을 correct에 저장
            } else if (num == 3) {// 랜덤함수 num이 3이면 나눗셈을 출력
                System.out.printf("%d / %d = ???\n", random1, random2);
                correct = random1 / random2; //나눗셈 연산을 correct에 저장
            }
            System.out.println(" > ");
            int answer = sc.nextInt(); //나의 문제 풀이를 입력하기

            if (answer == correct){ //만약 내가 입력한 정답과 correct가 일치하면 정답 입니다 출력
                System.out.println("정답 입니다!");
                cCount++; //정답이면 cCount 개수를 +1
            } else if (answer == 0 ) { //내가 0을 입력하면 게임을 종료
                System.out.println("종료 합니다.");
                break; // 반복문 탈출
            }else {
                System.out.println("틀렸습니다!"); // 내가 입력한 정답이 틀리면 틀렸습니다 출력
                iCount++; // 틀렸으면 iCount 개수를 +1
            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("정답 횟수 : " + cCount + "회"); // 정답 횟수 출력
        System.out.println("오답 횟수 : "+ iCount+"회"); // 오답 횟수 출력

        sc.close(); // 표준입출력 함수 닫기
    }
}