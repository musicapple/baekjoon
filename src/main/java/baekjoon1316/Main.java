package baekjoon1316;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] flag = new boolean[26];


        for(int i =0; i<n; i++){
            String str = sc.next();
            char[] c = str.toCharArray();

            for(int j=0; j<str.length(); j++){
                if(flag[c[j]-'a'] == false){

                }
            }
        }

    }
}
