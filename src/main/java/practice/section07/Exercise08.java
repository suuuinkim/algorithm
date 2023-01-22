package practice.section07;

import java.util.*;
public class Exercise08 {
    int answer =0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> q = new LinkedList<>();
    public int DFS(int s, int e){
        ch = new int[10001];
        ch[s] = 1;
        q.offer(s);
        int L = 0;
        while(!q.isEmpty()){
            int len = q.size();
            for (int i=0; i<len; i++){
                int x = q.poll();
                for(int j=0; j<3; j++){
                    int nx = x + dis[j];
                    if(nx == e) return L+1;
                    if(nx >= 1 && nx<=10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            L++;
        }
        return answer;
    }
    public static void main(String[] args){
        Exercise08 ex = new Exercise08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(ex.DFS(n, m));

    }
}
