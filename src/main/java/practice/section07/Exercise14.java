package practice.section07;

import java.util.*;
public class Exercise14 {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;
    public void BFS(int v){
        Queue<Integer> q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        q.offer(v);
        while(!q.isEmpty()){
            int cv = q.poll();
            for(int nv : graph.get(cv)){ // 인접리스트
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    q.offer(nv);
                    dis[nv] = dis[cv]+1;
                }
            }
        }
    }
    public static void main(String[] args){
        Exercise14 ex = new Exercise14();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i =0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        dis = new int[n+1];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
        }
        ex.BFS(1);

        for(int i= 2; i<=n; i++){
            System.out.println(i + " : " + dis[i]);
        }
    }
}
