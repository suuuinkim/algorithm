package practice.section02;

import java.util.*;
public class Exercise01 {

    public ArrayList<Integer> solution(int n, int[] nums){
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(nums[0]);

        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                answer.add(nums[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Exercise01 ex = new Exercise01();
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
