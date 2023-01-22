package practice.section07;

import java.util.*;
public class Exercise04 {
    static int[] fibo;
    public int DFS(int n){
        // if(n == 1) return 1;
        // else if(n==2) return 1;
        // else return DFS(n-2) + DFS(n-1);

        // 재귀는 stack frame을 사용하기 때문에 속도가 느리다.
        // 피보나치 경우는 for문과 배열을 사용하는 것이 속도가 더 빠르다.

        if(fibo[n] > 0) return fibo[n]; // 메모이제이션
        if(n == 1) return fibo[n] = 1;
        else if(n==2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-2) + DFS(n-1);
    }
    public static void main(String[] args){
        Exercise04 ex = new Exercise04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i=1; i<=n; i++) System.out.print(ex.DFS(i) + " ");
        fibo = new int[n+1];
        ex.DFS(n);
        for(int i=1; i<=n; i++) System.out.print(fibo + " ");
    }
}
