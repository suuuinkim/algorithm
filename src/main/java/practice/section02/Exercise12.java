package practice.section02;

import java.util.*;
public class Exercise12 {

    public int solution(int n, int m, int[][] nums){

        int answer = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int cnt =0;
                for(int k=0; k<m; k++){
                    int pi=0, pj =0;
                    for(int s=0; s<n; s++){
                        System.out.println(i + " " + j + " " + k + " " + s);
                        if(nums[k][s] == i) pi=s;
                        if(nums[k][s] == j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt ==m){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Exercise12 ex = new Exercise12();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] nums = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        System.out.print(ex.solution(n, m, nums));
    }
}
