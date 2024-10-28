package baekjoon2231;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result=0; // 최종 결과
        for(int i = 0; i<N; i++){   // 1부터 N까지 대입하며 생성자 찾음

            int number = i;
            int sum = 0;    // 각 자리수 합
            while(number != 0){
                sum += (number%10);
                number = number / 10;
            }

            if(sum + i == N) {
                result = i; // 생성자 발견. result에 i 대입
                break;
            }
        }
        System.out.println(result);
    }
}
