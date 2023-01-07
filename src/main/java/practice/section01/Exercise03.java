package practice.section01;

import java.util.*;
public class Exercise03 {

    public String Solution(String str){
        String answer = "";
        /*
        int m = Integer.MIN_VALUE; // 정수의 최소값
        String[] s = str.split(" ");
        for(String x : s){
            // System.out.println(x);
            int len = x.length();

            if(len > m){
                m = len;
                answer = x;
            }
        }*/

        int m = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' ')) != -1){ // 띄어쓰기 발견하지 못하면 -1 반환
            String tmp = str.substring(0, pos); // pos 전까지 자르기

            int len = tmp.length();
            if(len>m){
                m=len;
                answer = tmp;
            }

            str = str.substring(pos+1);
        }

        if(str.length() > m) answer = str;
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Exercise03 ex = new Exercise03();
        String str = sc.nextLine();
        System.out.println(ex.Solution(str));
    }


}
