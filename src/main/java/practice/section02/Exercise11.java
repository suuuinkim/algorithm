package practice.section02;

import java.util.*;
public class Exercise11 {
    public int solution(int n, int[][] nums){
        int answer = 0, max = Integer.MIN_VALUE;

        for(int i=1; i<=n; i++){ // 학생 번호
            int cnt = 0;
            for(int j=1; j<=n; j++){ // 학생 번호
                for(int k=1; k<=5; k++){ // 학년
                    // System.out.println(i + " " + j + " " + k);
                    if(nums[i][k] == nums[j][k]){
                        cnt++;
                        break;
                    }
                }
            }

            if(cnt>max){
                max=cnt;
                answer = i;
            }
        }
        return answer;

    }
    public static void main(String[] args){
        Exercise11 ex = new Exercise11();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n+1][6];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        System.out.println(ex.solution(n, nums));


    }
}
