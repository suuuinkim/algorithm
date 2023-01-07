package practice.section01;

import java.util.*;
public class Exercise08 {

    public String solution(String str){
        String answer = "No";

        // 정규식 표현 A부터 Z까지 알파벳이 아닌것 ^, replaceAll만 정규식 표현 사용할 수 있음!!!
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)){
            return "YES";
        }


        return answer;
    }
    public static void main(String[] args){
        Exercise08 ex = new Exercise08();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(ex.solution(str));
    }
}
