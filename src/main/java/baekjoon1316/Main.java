package baekjoon1316;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 그룹단어인지 체크할 단어 n개를 입력 받음
        int group = n;

        for(int i = 0; i<n; i++){
            String str = sc.next();
            char[] c = str.toCharArray();   // 단어가 중복되는 체크해야하니까 String을 char타입으로 쪼갬
            boolean[] flag = new boolean[26];   // 26개의 알파벳이 중복/미중복인지 결과를 담음

            for(int j=0; j<str.length(); j++){  // 단어의 길이만큼 순회
                if(flag[c[j] - 'a'] == false){  // 단어의 각 알파벳이 중복/미중복인지 확인
                    flag[c[j]-'a'] = true;
                }else if(j>0 && c[j]!=c[j-1]){
                        group--;
                        break;
                    // 그룹단어임 종료. 다음 단어 그룹 단어 체크
                }
            }
        }
        System.out.println(group);
    }
}
