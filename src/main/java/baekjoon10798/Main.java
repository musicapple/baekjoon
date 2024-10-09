package baekjoon10798;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String arr[][] = new String[5][15];
        String result = "";

        for(int i=0; i<5; i++){
            String input = sc.next();
            for(int j=0; j<input.length(); j++){
                arr[i][j] = String.valueOf(input.charAt(j));
            }
        }

        for(int j=0; j<15; j++){

            for(int i=0; i<5; i++){
                if(arr[i][j]!=null) {
                    result += arr[i][j];
                }
            }
        }
        System.out.println(result);
    }
}
