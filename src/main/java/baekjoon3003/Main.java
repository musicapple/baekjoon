package baekjoon3003;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,2,8};
        int a;
        Scanner sc = new Scanner(System.in);

        for(int i =0; i<arr.length; i++){
            a=sc.nextInt();
            System.out.print(arr[i] - a+" ");
        }
    }
}
