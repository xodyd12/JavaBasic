package 반복문7강;

import java.util.Scanner;

public class for문_구구단 {
    public static void main(String[] args) {

        int a = 1;
        System.out.println("***  구구단 1단  ***");
        System.out.println("======================");
        for (int i = 1; i <=9 ; i++) {
            System.out.printf("%d x %d= %d\n",a,i,a*i);
        }
    }
}

/*
구구단 1단 만들기 입니다.
 */