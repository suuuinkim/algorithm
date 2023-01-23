package practice.section08;

import java.util.*;
public class Exercise05 {
    static int n, m, answer = Integer.MAX_VALUE;
    static Integer[] arr;
    public void DFS(int L, int sum, Integer[] arr){
        if(sum>m) return;
        if(L>=answer) return;
        if(sum == m) {
            answer = Math.min(answer, L);
        }else{
            for(int i=0; i<n; i++){
                DFS(L+1, sum+arr[i], arr);
            }
        }
    }
    public static void main(String[] args){
        Exercise05 ex = new Exercise05();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        // 큰 금액부터 계산하기 위해 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        m = sc.nextInt();

        ex.DFS(0, 0, arr);

        System.out.println(answer);
    }
}
