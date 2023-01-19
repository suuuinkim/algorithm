package practice.section06;

import java.util.*;
public class Exercise01 {
    public int[] solution(int n, int[] arr){
        // 선택 정렬
        for(int i=0; i<n-1; i++){
            int idx =i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[idx]) idx = j;
            }

            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }
    public static void main(String[] args){
        Exercise01 ex = new Exercise01();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : ex.solution(n, arr)){
            System.out.print(x+" ");
        }


    }
}
