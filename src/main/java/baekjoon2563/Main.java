package baekjoon2563;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] paper = new int[100][100];

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;

        for(int i=0; i<num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int x = a; x<a+10; x++){

                for(int y = b; y<b+10; y++){
                    if(paper[x][y]==0){
                    paper[x][y] = 1;
                    result += paper[x][y];
                    }
                }
            }
        }
        System.out.println(result);
    }
}
