package practice.section06;

import java.util.*;
public class Exercise09 {
    public int count(int[] arr, int capacity){// DVD 몇 장인지 구하기
        int cnt = 1, sum=0;
        for(int x : arr){
            if(sum + x > capacity){
                cnt++;
                sum = x;
            }
            else sum += x;
        }
        return cnt;
    }
    public int solution(int n, int m, int[] arr){
        int answer =0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt){
            int mid = (lt + rt) / 2; // DVD 한 장의 용량
            if(count(arr, mid) <= m) {
                answer = mid;
                rt = mid -1;
            }
            else lt = mid + 1;
        }
        return answer;
    }
    public static void main(String[] args){
        Exercise09 ex = new Exercise09();
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
