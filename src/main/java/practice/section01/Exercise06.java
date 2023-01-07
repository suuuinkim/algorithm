package practice.section01;

import java.util.*;
public class Exercise06 {

    public String solution(String str){
        String answer = "";
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));

            if(str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Exercise06 ex = new Exercise06();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(ex.solution(str));
    }
}
