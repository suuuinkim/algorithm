package practice.section06;

import java.util.*;
public class Exercise02 {
    public int[] solution(int n, int[] arr){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                // System.out.println(i + " " + j);

                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Exercise02 ex = new Exercise02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        for(int x : ex.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
