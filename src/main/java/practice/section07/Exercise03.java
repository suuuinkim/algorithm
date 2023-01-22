package practice.section07;

import java.util.*;
public class Exercise03 {
    public int DFS(int n){
        if(n==0) return 1;
        else return n*DFS(n-1);
    }
    public static void main(String[] args){
        Exercise03 ex = new Exercise03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ex.DFS(n));
    }
}
