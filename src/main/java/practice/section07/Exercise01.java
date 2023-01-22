package practice.section07;

import java.util.*;
public class Exercise01 {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args){
        Exercise01 ex = new Exercise01();

    }
}
