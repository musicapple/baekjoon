package baekjoon10988;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (c[i] != c[str.length()-1 - i]) {
                flag = false;
                break;
            } else flag = true;

            
        }
        if (flag) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
