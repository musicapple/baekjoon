package baekjoon2869;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        int tall=0;
        int day = 0;
        while(true){
            day++;
            tall += a;
            if(tall >= v){
                break;
            }else{
                tall -= b;
            }
        }
        System.out.println(day);
    }
}
