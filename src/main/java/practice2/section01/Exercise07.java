package practice2.section01;

import java.util.*;
public class Exercise07 {
    public String solution(String str){
        String answer = "YES";

        str = str.toLowerCase();

        int len = str.length();
        for(int i =0; i<str.length()/2 ; i++){
            if(str.charAt(i) != str.charAt(len-i-1)) answer = "NO";
        }

        return answer;
    }
    public static void main(String[] args){
        Exercise07 ex = new Exercise07();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(ex.solution(str));
    }
}
