package 탈출문8강;

public class break_ {
    public static void main(String[] args) {
        /*
        break문은 반복문의나 switch문을 빠져 나올 때 사용 합니다.
        반복문에서 break문을 사용하면 해당 키워드가 들어있는 반복문 블록을 빠져 나옵니다.
        switch문에서 break를 사용하면 해당 case문을 탈출 하는거 기억하시죠 ?
        밑에 예제를 봅시다!
         */


        for (int i = 0; i <10; i++) {
            if (i  == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("\n반복문 종료!");
    }
}
/*
위 코드는 i가 5일때 break문을 만나서 반복문을 빠져 나오기 때문에 4까지 출력 됩니다.
 */