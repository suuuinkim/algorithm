package practice.section03;

import java.util.*;

// 교집합 구하기 문제
public class Exercise02 {

    public ArrayList<Integer> solution(int n, int[] a, int m, int[] b){

        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1=0, p2=0;
        while(p1<n && p2<m){
            if(a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            }else if(a[p1] < b[p2])p1++; // 작은 쪽을 증가시키기
            else p2++;
        }
        return answer;

    }
    public static void main(String[] args){
        Exercise02 ex = new Exercise02();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }

        for(int x : ex.solution(n, a, m, b)){
            System.out.print(x + " ");
        };
    }
}
