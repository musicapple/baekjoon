package baekjoon2745;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String B = sc.nextLine();
        int N = sc.nextInt();
        int num=0;
        int idx = 0;
        int result=0;

        for(int i = B.length()-1; i>=0; i--){   // B 문자열의 맨 오른쪽부터 검사
            char c = B.charAt(i);   // B 문자열의 맨 오른쪽부터 문자타입으로 변환 ex) apple -> e
            if(c>=0 && c<=9){       // c가 '0'~'9'의 문자인 경우
                num = c-'0';
            }else {                 // c가 'A'~'Z'인 경우
                num = c - 55;
                result += num*Math.pow(N,idx++);
            }
        }
        System.out.println(result);
    }
}
