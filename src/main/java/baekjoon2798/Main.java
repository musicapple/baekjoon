package baekjoon2798;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n]; // 각 카드에 써져있는 숫자
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result = search(arr,n,m);
        System.out.println(result);
    }

    static int search(int[] arr, int n, int m){
        int result = 0;
        int sum = 0;

        for(int i = 0; i<n-2; i++) {    // i는 0번째 자리부터 n-2번째 자리까지 순회

            for(int j = i+1; j<n-1; j++) {  //  j는 i+1자리부터 n-1번째 자리까지 순회

                for(int k= j+1; k<n; k++){  // k는 j+1자리부터 n번째 자리까지 순회
                    sum = arr[i] + arr[j] + arr[k];

                    if(sum == m){
                        return sum;
                    }
                    if(sum < m){  // 현재합이 m보다 작은 경우
                        if(result < sum) {  // 이전의 합이 현재합보다 작은 경우에만 코드 실행
                            result = sum;
                        }
                    }
                }
            }
        }
        return result;
    }
}
