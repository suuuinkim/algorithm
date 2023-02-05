package practice2.section01;

import java.util.*;
public class Exercise12 {
    public String solution(int n, String s){
        String answer = "";
        Collection.isAlphabetic();
        for(int i=0; i<n; i++){
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '1');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            s = s.substring(7);
        }
        return answer;
    }
    public static void main(String[] args){
        Exercise12 ex = new Exercise12();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        System.out.println(ex.solution(n, s));
    }
}
