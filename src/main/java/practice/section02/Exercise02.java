package practice.section02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise02 {

    public int solution(int n, int[] nums){
        int answer = 1, max = nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Exercise02 ex = new Exercise02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.print(ex.solution(n, nums));

    }
}
