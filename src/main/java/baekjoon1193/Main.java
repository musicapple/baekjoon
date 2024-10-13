package baekjoon1193;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int line_num = 1;   // x의 대각선 순서 1로 초기화
        int total_num = 0;  // x번째 분수가 속한 대각선 이전까지 칸의 총 개수 0으로 초기화
        while (true) {
            if (x <= line_num + total_num) { // x의 대각선 순서를 구한 뒤 대각선이 짝수 인 경우, 홀수인 경우 나누기
                if (line_num % 2 == 1) {
                    System.out.println(-x + (total_num + line_num + 1) + "/" + (x - total_num));
                    break;
                } else {
                    System.out.println(x - total_num + "/" + (-x + total_num + line_num + 1));
                    break;
                }
            } else {   //  x의 대각선 순서 구하기.
                total_num += line_num;   // x번째 분수가 속한 대각선 이전까지 칸의 총 개수
                line_num++;  // x의 대각선 순서
            }
        }
    }
}