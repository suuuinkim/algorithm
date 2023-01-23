package practice.section08;

import practice.section07.Exercise12;

import java.util.*;
public class Exercise01 {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;
    public void DFS(int L, int sum, int[] arr){
        if(flag) return;
        if(sum>total/2) return;
        if(L == n){
            if((total-sum) == sum){
                answer = "YES";
                flag = true;
            }
        }else{
            DFS(L+1, sum+arr[L], arr); // 왼쪽
            DFS(L+1, sum, arr); // 오른쪽

        }
    }
    public static void main(String[] args){
        Exercise01 ex = new Exercise01();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            total+= arr[i];
        }
        ex.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
