package practice.section07;

import java.util.*;
public class Exercise02 {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }
    public static void main(String[] args){
        Exercise02 ex = new Exercise02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ex.DFS(n);

    }
}
