package practice.section07;

import java.util.*;
public class Exercise12 {
    static int n, m, answer =0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v){
        if(v == n) answer++;
        else{
            for(int i=1; i<=n; i++){
                if(graph[v][i] ==1 && ch[i] == 0){
                    ch[i] = 1; // 호출
                    DFS(i);
                    ch[i] = 0; // 취소
                }
            }
        }
    }
    public static void main(String[] args){
        Exercise12 ex = new Exercise12();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 노드의 개수
        m = sc.nextInt(); // 간선의 개수
        graph= new int[n+1][m+1]; // 정점번호를 의미함
        ch = new int[n+1];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        ex.DFS(1);
        System.out.println(answer);
    }
}
