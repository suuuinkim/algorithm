package practice.section02;

import java.util.*;
public class Exercise09 {

    public int solution(int n, int[][] nums){
        int answer = Integer.MIN_VALUE; // 최소값으로 선언

        int sum1; // 행의 합
        int sum2; // 열의 합
        for(int i=0; i<n; i++){
            sum1 = sum2 = 0; // 반복문 돌고나면 값 초기화 해줘야됨
            for(int j=0; j<n; j++){
                sum1 += nums[i][j];
                sum2 += nums[j][i];
            }

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2); // 행과 열 중에 최대값이 들어가게됨
        }

        sum1=sum2=0;

        // 각 대각선의 최대합 구하기
        for(int i=0; i<n; i++){
            sum1 += nums[i][i];
            sum2 += nums[i][n-i-1];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);


        return answer;
    }
    public static void main(String[] args){
        Exercise09 ex = new Exercise09();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] nums = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        System.out.print(ex.solution(n, nums));
    }
}
