package practice.section10;

import java.util.*;
public class Exercise06 {
    static int[] dy;
    static int n, m;
    public static void main(String[] args){
        Exercise06 ex = new Exercise06();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        dy = new int[m+1];
        for(int i=0; i<n; i++){
            int ps = sc.nextInt();
            int pt = sc.nextInt();

            for(int j= m; j>=pt; j--){
                dy[j] = Math.max(dy[j], dy[j-pt] + ps);
            }
        }

        System.out.println(dy[m]);
    }
}
