package practice.section03;

import java.util.*;
public class Exercise05 {
    public int solution(int n){
        int answer = 0, sum=0, lt=1;

        for(int rt=1; rt<n; rt++){
            sum+=rt;
            if(sum == n) answer++;
            while(sum>=n){
                sum -= lt;
                lt++;
                if(sum == n) answer++;
            }

        }
        return answer;
    }
    public static void main(String[] args){
        Exercise05 ex = new Exercise05();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(ex.solution(n));
    }
}
