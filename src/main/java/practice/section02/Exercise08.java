package practice.section02;

import java.util.*;
public class Exercise08 {

    public int[] solution(int n, int[] nums){
        int[] answer = new int[n];

        for(int i=0; i<n; i++){
            int cnt = 1;
            for(int j=0; j<n; j++){
                if(nums[j] > nums[i]){
                    cnt++;
                }
                answer[i] = cnt;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Exercise08 ex = new Exercise08();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        for(int x : ex.solution(n, nums)){
            System.out.print(x + " ");
        }
    }
}
