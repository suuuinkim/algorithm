package practice.section02;

import java.util.*;
public class Exercise07 {

    public int solution(int n, int[] arr){
        int answer = 0, cnt=0;

        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                cnt++;
                answer += cnt;
            }else{
                cnt = 0;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Exercise07 ex = new Exercise07();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(ex.solution(n, nums));
    }
}
