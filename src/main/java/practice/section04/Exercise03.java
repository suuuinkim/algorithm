package practice.section04;

import java.util.*;
public class Exercise03 {
    public ArrayList<Integer> solution(int n, int m, int[] nums){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<m-1; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int lt = 0;
        for(int rt = m-1; rt<n; rt++){
            map.put(nums[rt], map.getOrDefault(nums[rt], 0) + 1);
            answer.add(map.size());
            map.put(nums[lt], map.get(nums[lt])-1);
            if(map.get(nums[lt]) == 0) map.remove(nums[lt]);
            lt++;
        }

        return answer;

    }
    public static void main(String[] args){
        Exercise03 ex = new Exercise03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        for(int x : ex.solution(n, m, nums)) System.out.print(x+" ");
    }
}
