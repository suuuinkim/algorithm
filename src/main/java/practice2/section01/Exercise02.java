package practice2.section01;

import java.util.*;
public class Exercise02 {
    public String solution(String str){
        String answer = "";

        for(char x : str.toCharArray()){
            if(x >=65 && x<=90){
                answer += (char)(x+32);
            }else{
                answer += (char)(x-32);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Exercise02 ex = new Exercise02();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(ex.solution(str));
    }
}
