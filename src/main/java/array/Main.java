package array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 배열 크기 입력
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 2차원 배열 선언 및 초기화
        int[][] num = new int[n][m];
        int[] row = new int[n];
        int[] col = new int[m];

        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){
                num[i][j] = sc.nextInt();
                row[i] += num[i][j];
                col[j] += num[i][j];
            }
        }
        System.out.print("행의 합: ");
        for(int i=0; i<n; i++){
            System.out.println(row[i]);
        }
        System.out.print("열의 합: ");
        for(int i=0; i<n;i++){
            System.out.println(col[i]);
        }
    }
}