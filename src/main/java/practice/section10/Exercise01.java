package practice.section10;

import java.util.*;

// 다이나믹
// 작은 단위부터 차근차근 bottomUP
public class Exercise01 {
    static int[] dy;
    public int solution(int n){
        // 작은건 먼저 초기화 해놓기
        dy[1] = 1;
        dy[2] = 2;
        // i번째 계단까지 갈 수 있는 방법의 수
        // 피보나치
        for(int i=3; i<=n; i++){
            dy[i] = dy[i-1] + dy[i-2];
        }

        return dy[n];
    }
    public static void main(String[] args){

        Exercise01 ex = new Exercise01();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dy = new int[n + 1];
        System.out.println(ex.solution(n));

    }
}
