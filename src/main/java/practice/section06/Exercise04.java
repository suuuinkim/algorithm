package practice.section06;

import java.util.*;
public class Exercise04 {
    public int[] solution(int n, int m, int[] arr){
        int[] cache = new int[n];
        for(int x : arr){
            int pos = -1; // idx 번호
            for(int i=0; i<n; i++) if(x == cache[i]) pos = i; // hit 상황
            if(pos == -1){
                for(int i=n-1; i>=1; i--){
                    cache[i] = cache[i-1];
                }
            }
            else{
                for(int i=pos; i>=1; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;

        }
        return cache;

    }
    public static void main(String[] args){
        Exercise04 ex = new Exercise04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0; i<m; i++) arr[i] = sc.nextInt();

        for(int x : ex.solution(n, m, arr)){
            System.out.print(x + " ");
        }
    }
}
