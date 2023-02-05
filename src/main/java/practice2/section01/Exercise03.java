package practice2.section01;

import java.util.*;
public class Exercise03 {
    public String solution(String str){
        String answer = "";

        String[] s = str.split(" ");

        int m = Integer.MIN_VALUE;
        for(String x : s){
            int len = x.length();

            if(len > m){
                m = len;
                answer = x;
            }

        }

        return answer;
    }
    public static void main(String[] args){
        Exercise03 ex = new Exercise03();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(ex.solution(str));
    }
}
