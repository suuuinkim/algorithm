package practice.section10;

import java.util.*;
public class Exercise02 {
    static int[] dy;
    public int solution(int n){
        dy[1] = 1;
        dy[2] = 2;

        for(int i=3; i<=n; i++){
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n+1];
    }
    public static void main(String[] args){
        Exercise02 ex = new Exercise02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n+2];
        System.out.println(ex.solution(n));
    }
}
