package practice.section06;

import java.util.Scanner;

public class Exercise03 {
    public int[] solution(int n, int[] arr){
        for(int i=1; i<n; i++){
            int tmp = arr[i], j;
            for(j = i-1; j>=0; j--){
                if(arr[j] > tmp) arr[j+1] =  arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }
    public static void main(String[] args){
        Exercise03 ex = new Exercise03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        for(int x : ex.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
