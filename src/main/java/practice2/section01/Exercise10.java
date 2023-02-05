package practice2.section01;

import java.util.*;
public class Exercise10 {
    public int[] solution(String s, char t){
       int[] answer = new int[s.length()];
       // 왼쪽 오른쪽 한번씩 돌면서 t와의 거리 체크
       int p = 1000;
       for(int i=0; i<s.length();i++){
           if(s.charAt(i) != t)p++;
           else p =0;
           answer[i] = p;

           //System.out.println(answer[i]);
       }

       p=1000;
       for(int i=s.length()-1; i>=0; i--){
           if(s.charAt(i) != t) p++;
           else p=0;

           answer[i] = Math.min(answer[i], p);
       }


       return answer;
    }
    public static void main(String[] args){
        Exercise10 ex = new Exercise10();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);

        for(int x : ex.solution(s, t)){
            System.out.print(x + " ");
        }

    }
}
