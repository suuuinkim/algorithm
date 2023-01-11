package practice.section03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise01 {

    public ArrayList<Integer> solution(int n, int[] a, int k, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();

        int p1=0, p2=0;

        while(p1<n && p2<k){
            if(a[p1] < b[p2]) answer.add(a[p1++]); // a[p1]이 add -> p1++ 됨
            else answer.add(b[p2++]);
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<k) answer.add(b[p2++]);

        return answer;
    }
    public static void main(String[] args){
        Exercise01 ex = new Exercise01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int[] b = new int[k];

        for(int i=0; i<k; i++){
            b[i] = sc.nextInt();
        }

        for(int x : ex.solution(n, a, k, b)){
            System.out.print(x + " ");
        }
    }
}
