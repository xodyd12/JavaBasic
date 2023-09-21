package 배열기초9강;

import java.util.Arrays;

public class 배열기초문제풀기 {
    public static void main(String[] args) {

        // A 학생의 점수의 합계과 평균을 구하시오.

        int[] stuA = {90, 100, 86, 50};

        int sum = 0;
        double avg = 0;

        for (int i = 0; i < stuA.length; i++) {
            sum += stuA[i];
            avg = (double) sum / stuA.length;
        }
        System.out.println("A학생의 총 합계 점수 : " + sum);
        System.out.println("A학생의 총 평균 점수 : " + avg);
    }

    }

