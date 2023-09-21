package 이차원배열11강;

public class 이차원배열문제 {
    public static void main(String[] args) {
        /*
        1. 각 학생의 평균을 소수점 첫재 자리 까지 출력
        2, 각 과목의 평균을 구하기
        3. 반 평균 출력(모든 학생들의 평균)
         */
        int [][] score = {
                {79, 80, 99},
                {95, 85, 89},
                {90, 65, 56},
                {69, 78, 77}
        };

        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};

        double[] stuAvg = new double[score.length];
        for (int i = 0; i <score.length ; i++) {
            int sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                sum+=score[i][j];

            }

        }



    }
}
