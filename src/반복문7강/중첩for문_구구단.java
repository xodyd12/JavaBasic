package 반복문7강;

public class 중첩for문_구구단 {
    public static void main(String[] args) {

        /*
        for문을 사용해서 2단부터 9단까지 만들어 봅시다.
         */
        for (int i = 2; i <9 ; i++) {
            System.out.println("구구단 "+ i +"단");
            System.out.println("=================");
            for (int j = 1; j < 9; j++) {
                System.out.printf("%d x %d = %d\n",i,j,i*j);
            }
            System.out.printf("========================");
        }

    }
}
