package practice.section08;

import java.util.*;
//class Point{
//    public int x, y;
//    Point(int x, int y){
//        this.x = x;
//        this.y = y;
//    }
//}
public class Exercise15 {
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> hs, pz;

    public void DFS(int L, int s){
        if(L == m){
            int sum = 0;
            for(Point h : hs){
                int dis = Integer.MAX_VALUE;
                for(int i : combi){
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        }else{
            for(int i=s; i<len; i++){
                combi[L] = i;
                DFS(L+1, i+1);

            }
        }
    }
    public static void main(String[] args){
        Exercise15 ex = new Exercise15();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int tmp = sc.nextInt();
                if(tmp ==1) hs.add(new Point(i, j));
                else if(tmp==2) pz.add(new Point(i, j));
            }
        }
        len = pz.size(); // 피자집의 개수
        combi = new int[m];
        ex.DFS(0, 0);
        System.out.println(answer);
    }
}
