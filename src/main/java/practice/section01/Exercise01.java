package practice.section01;

import java.util.Scanner;

public class Exercise01 {

    public int solution(String str, char c){
        int answer =0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        /* 방법 1
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c) answer++;
        }
         */

        // 방법 2
        // toCharArray : 한글자 한글자 문자 배열 객체를 만들어냄
        for(char x : str.toCharArray()){
            if(x == c) answer++;
        }
        return answer;
    }

   public static void main(String[] args){

       Exercise01 ex = new Exercise01();

       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       char c = sc.next().charAt(0);

       System.out.println(ex.solution(str, c));


   }
}
