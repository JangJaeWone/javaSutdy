package baekjoon;

import java.util.Scanner;

public class 최소_최대값 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i =0; i<N; i++){
            arr[i]=sc.nextInt();
        }

        int tmp1 = Integer.MIN_VALUE;
        int tmp2 = Integer.MAX_VALUE;;

        for (int i:arr){
            if (tmp1<i){
                tmp1 = i;
            }
            if (tmp2>i){
                tmp2 = i;
            }
        }
        System.out.println(tmp2+" "+tmp1);
    }
}
