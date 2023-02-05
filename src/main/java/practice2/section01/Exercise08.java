package practice2.section01;

import java.util.*;
public class Exercise08 {
    public String solution(String str){
        String answer = "No";

        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        //System.out.println(tmp);

        if(str.equals(tmp)) answer = "YES";

        return answer;
    }
    public static void main(String[] args){
        Exercise08 ex = new Exercise08();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(ex.solution(str));
    }
}
