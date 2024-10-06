package baekjoon11005;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        int b;
        String result = "";		// 나머지를 이어붙여주기 위함

        while(N!=0){
            b = N%B;    // 나머지
            if(b>=10){
                char c = (char)(b+55);	// 나머지가 10~35일 때
                result += c;
            }else{
                result += b;	// 나머지가 0~9일 때
            }
            N = N/B;    // 몫
        }
        for(int i = result.length()-1; i>=0; i--){
            System.out.print(result.charAt(i));
        }
    }
}