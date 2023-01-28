package practice.section10;

import java.util.*;
public class Exercise03 {
    static int[] dy;
    public int solution(int[] arr){
        int answer = 0;
        dy = new int[arr.length];
        dy[0] = 1; // 직관적인 값은 초기화

        for(int i=1; i<arr.length; i++){
            int max = 0;
            for(int j=i-1; j>=0; j--){
                if(arr[j] < arr[i] && dy[j]>max) max = dy[j];
                Math.max(answer, max);
            }
            dy[i] = max + 1;
        }

        return answer;
    }
    public static void main(String[] args){
        Exercise03 ex = new Exercise03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(ex.solution(arr));
    }
}
