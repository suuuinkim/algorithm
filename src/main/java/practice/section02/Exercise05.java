package practice.section02;

import java.util.*;
public class Exercise05 {

    public int solution(int n){
        // 에라토스테네스 체 : 소수가 되는 수의 배수를 지우면 남은 건 소수가 된다
        // 2부터 자기 자신을 제외한 배수가 되는 것을 지운다.

        int answer = 0;
        int[] ch = new int[n+1];

        for(int i=2; i<=n; i++){
            if(ch[i] == 0) answer ++;

            for(int j=i; j<n; j=j+i){
                ch[j] =1;
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
