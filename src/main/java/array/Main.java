package array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 배열 크기 입력
        int x =0;
        int y =0;

        // 2차원 배열 선언 및 초기화
        int[][] A = new int[9][9];
        A[0][0] = sc.nextInt();
        int max = A[0][0];

        for (int i = 0; i < 9; i++) {

            for (int j =(i==0)?1:0; j < 9; j++) {
                A[i][j] = sc.nextInt();
                if(max < A[i][j]){
                    max = A[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println(max);
        System.out.print((x+1)+" "+(y+1));
    }
}