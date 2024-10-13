package baekjoon2292;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num = 1;
        int total_num=0;
        while(true){
            if(x==1){
                System.out.println(1);
                break;
            }else {
                if (total_num + 1 >= x) {
                    System.out.println(num);
                    break;
                } else {
                    total_num = total_num + (6 * num);
                    num++;
                }
            }
        }

    }
}
