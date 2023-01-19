package practice.section06;

import java.util.*;
public class Exercise08 {
    public int solution(int n, int m, int[] arr){
        int answer =0;
        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            if(arr[i] == m) answer = i+1;
        }
        return answer;
    }
    public static void main(String[] args){
        Exercise08 ex = new Exercise08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(ex.solution(n, m, arr));
    }
}
