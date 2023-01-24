package practice.section08;

import java.util.*;
public class Exercise09 {
    static int n, m;
    static int[] dy;
    static int[] combi;
    public void DFS(int L, int s){
        if(L == m) {
            for(int x : combi) System.out.print(x + " ");
            System.out.println();
        }else{
            for(int i=s; i<=n; i++){
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
    public static void main(String[] args){
        Exercise09 ex = new Exercise09();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];

        ex.DFS(0, 1);
    }
}
