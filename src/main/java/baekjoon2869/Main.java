package baekjoon2869;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   // 낮에 이동하는 거리
        int b = sc.nextInt();   // 밤에 떨어지는 거리
        int v = sc.nextInt();   // 최종 목표 거리

        int distance= a-b;  // 하루동안 이동거리
        int day = (v-b)/ distance; // 최종 목표까지 걸리는 일 수, 단, 나머지가 있을 경우 하루 추가

        if((v-b)%distance!=0){
            day++;
        }
        System.out.println(day);
    }
}
