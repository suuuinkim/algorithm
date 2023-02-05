package practice2.section01;

import practice.section10.Exercise01;

import java.util.*;
public class Exercise09 {
    public int solution(String str){
        String answer = "";

        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) answer += x;
        }


        return Integer.parseInt(answer);
    }
    public static void main(String[] args){
        Exercise09 ex = new Exercise09();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(ex.solution(str));
    }
}
