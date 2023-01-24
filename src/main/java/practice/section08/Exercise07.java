package practice.section08;

import java.util.*;
public class Exercise07 {
    static int n, r;
    int[][] dy = new int[35][35];
    public int DFS(int n, int r){
        if(dy[n][r] > 0) return dy[n][r];
        if(r == 0 || n == r){
            return 1;
        }else{
            return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
        }
    }
    public static void main(String[] args){
        Exercise07 ex = new Exercise07();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();

        System.out.println(ex.DFS(n, r));
    }
}
