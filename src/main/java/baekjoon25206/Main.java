package baekjoon25206;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double scoreSum = 0.0;  //  학점 합
        double sum = 0; // 전공 과목별 합
        double gradeScore = 0.0;    // 등급을 점수로
        double multiScore;

        for(int i =0; i<20; i++) {
            String subject = sc.next(); // 과목명
            double score = sc.nextDouble(); // 과목 평점
            String grade = sc.next();   // 등급
            if (!grade.equals("P")) {
                switch (grade) {
                    case "A+":
                        gradeScore = 4.5;
                        break;
                    case "A0":
                        gradeScore = 4.0;
                        break;
                    case "B+":
                        gradeScore = 3.5;
                        break;
                    case "B0":
                        gradeScore = 3.0;
                        break;
                    case "C+":
                        gradeScore = 2.5;
                        break;
                    case "C0":
                        gradeScore = 2.0;
                        break;
                    case "D+":
                        gradeScore = 1.5;
                        break;
                    case "D0":
                        gradeScore = 1.0;
                        break;
                    case "F":
                        gradeScore = 0.0;
                        break;
                    default:
                        break;
                }
                multiScore = score * gradeScore;
                scoreSum += score;
                sum += multiScore;
            }
        }
        System.out.println(sum / scoreSum);
    }
}
