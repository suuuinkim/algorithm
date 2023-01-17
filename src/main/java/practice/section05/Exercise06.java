package practice.section05;

import java.util.*;
public class Exercise06 {
    public int solution(int n, int m){
        // Queue
        // offer() : 넣기
        // poll() : 꺼내기
        // size() : 크기
        // contain() : 포함 여부
        int answer = 0;

        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=n; i++) q.offer(i);

        while(!q.isEmpty()){
            for(int i=1; i<m; i++) q.offer(q.poll());
            q.poll();
            if(q.size() == 1) answer = q.poll();
        }



        return answer;
    }
    public static void main(String[] args){
        Exercise06 ex = new Exercise06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(ex.solution(n, m));
    }
}
