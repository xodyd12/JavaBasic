package 반복문7강;

public class for_ {
    public static void main(String[] args) {
        /*
        for문은 초기값, 조건식, 증감식, 실행될 코드로 구성되어 있습니다.
        한마디로 while문에서 공부한 begin,end,step을 괄호 안에 한번에 지정합니다.
        for문의 간단한 예시를 보겠습니다.
         */
        int total = 0;

        for (int i = 1; i <= 10; i++) {
            total += i; // while 에서 설명한 total = total + i 입니다.
        }
        System.out.println(total);
    }
}
/*
위 코드는 1부터 10까지의 누적합을 구하는 로직 입니다. while문과 생긴 것을 비교해보면
for문이 작성하기 좀 더 편하고, 작성된 코드를 볼 때에도 반복의 범위를 좀 더 파악하기 쉽습니다.
그래서 시작과 끝 범위가 확실한 경우 for문을 사용하고 횟수보다는 조건에 따라 반복을 진행 할때는 while을 더 많이 사용 합니다.
 */