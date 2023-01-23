package practice.section08;

import java.util.*;
public class Exercise02 {
    static int answer = Integer.MIN_VALUE, n, w;

    public void DFS(int L, int sum, int[] arr){
        if(sum > w) return;
        if(L == n){
            answer = Math.max(answer, sum);
        }else{
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);

        }
    }
    public static void main(String[] args){
        Exercise02 ex = new Exercise02();
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ex.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
