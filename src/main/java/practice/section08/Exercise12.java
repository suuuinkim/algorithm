package practice.section08;

import java.util.*;

class Node{
    public int x,y;
    Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Exercise12 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n, m;
    static int[][] board, dis;
    static Queue<Node> q = new LinkedList<>();
    public void BFS(){

        // q.offer(new Node(x, y));

        while(!q.isEmpty()){
            Node tmp = q.poll();
            for(int i=0; i<4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if(nx >= 0 && nx <n && ny>=0 && ny<m && board[nx][ny] == 0){
                    board[nx][ny] = 1;
                    q.offer(new Node(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
    public static void main(String[] args){
        Exercise12 ex = new Exercise12();
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                board[i][j] = sc.nextInt();
                if(board[i][j] == 1) q.offer(new Node(i, j)); // 출발점이 여러개면 BFS 돌기 전에 미리 넣어놓기
            }
        }
        ex.BFS();

        boolean flag = true; // 익지 않은 토마토의 여부
        int answer = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j] == 0) flag = false;
            }
        }

        if(flag){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        }
        else System.out.println(-1);

    }
}
