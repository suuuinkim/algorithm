package practice.section08;

import java.util.*;

public class Exercise14 {
    static int n, answer;
    static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};

    public void BFS(int x, int y, int[][] board){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));

        while(!q.isEmpty()){
            Point tmp = q.poll();
            for(int i=0; i<8; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx >=0 && nx<n && ny>=0 && ny<n && board[nx][ny] == 1){
                    board[nx][ny] = 0;
                    q.offer(new Point(nx, ny));

                }
            }
        }
    }

    public void solution(int[][] board){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 1){
                    answer++; // 섬 개수 세기
                    board[i][j] = 0;
                    BFS(i, j, board);
                }
            }
        }
    }
    public static void main(String[] args){
        Exercise14 ex = new Exercise14();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        ex.solution(arr);

        System.out.println(answer);


    }
}
