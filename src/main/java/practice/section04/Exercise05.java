package practice.section04;

import java.util.*;
public class Exercise05 {
    public int solution(int n, int k, int[] nums){
        int answer = -1;
        // TreeSet<Integer> tset = new TreeSet<>(); 기본 오름차순
        TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder()); // Collections.reverseOrder 사용하면 내림차순으로 정렬

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int z=j+1; z<n; z++){
                    // System.out.println(nums[i] + " " + nums[j] + " " + nums[z]);
                    tset.add(nums[i] + nums[j] + nums[z]);
                }
            }
        }

        int cnt = 0;
        // tset.remove(143); 삭제
        // System.out.println(tset.size()); 개수
        System.out.println(">" + tset.first()); // 오름차순의 경우 최솟값, 내림차순의 경우 최댓값
        System.out.println(">" + tset.last()); // 오름차순의 경우 최댓값, 내림차순의 경우 최솟값
        for(int x : tset){
            System.out.println(x);
            cnt++;
            if(cnt == k) return x;
        }
        // System.out.println(tset);
        return answer;
    }
    public static void main(String[] args){
        // set은 중복제거
        // TreeSet 은 중복도 제거하고, 정렬도 함
        Exercise05 ex = new Exercise05();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(ex.solution(n, k, nums));

    }
}
