package baekjoon2941;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length();

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length()-1) {
                if (str.charAt(i) == 'c') {
                    if (str.charAt(i + 1) == '=' ||str.charAt(i+1) ==  '-') {
                        len--;
                        i++;
                        continue;
                    }
                }
            }
            if(i<str.length()-2){
                if(str.charAt(i) == 'd'){
                    if(str.charAt(i+1) == 'z'){
                        if(str.charAt(i+2) == '='){
                            len=len-2;
                            i+=2;
                            continue;
                        }
                    }
                }
            }if(i<str.length()-1){
                if(str.charAt(i) == 'd'){
                    if(str.charAt(i+1) == '-'){
                        len--;
                        i++;
                        continue;
                    }
                }
            }
            if(i<str.length()-1){
                if(str.charAt(i) == 'l'||str.charAt(i) == 'n'){
                    if(str.charAt(i+1) == 'j'){
                        len--;
                        i++;
                        continue;
                    }
                }
            }
            if(i<str.length()-1){
                if(str.charAt(i) == 's'||str.charAt(i) == 'z'){
                    if(str.charAt(i+1) == '='){
                        len--;
                        i++;
                    }
                }
            }
        }
        System.out.println(len);
    }
}
