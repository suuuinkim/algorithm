package practice.section08;

import java.util.*;
public class Exercise04 {
    static int[] pm;
    static int n, m;

    public void DFS(int L){
        if(L == m){
            //for(int x : pm) System.out.print(x + " ");
            //System.out.println();
        }else{
            for(int i=1; i<=n; i++){
                System.out.println(i);
                pm[L] = i;
                DFS(L+1);
            }
        }
    }
    public static void main(String[] args){
        Exercise04 ex = new Exercise04();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        ex.DFS(0);
    }
}
