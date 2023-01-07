package practice.section01;

import java.util.*;
public class Exercise11 {
    public String solution(String str){
        String answer = "";
        str = str + " ";
        int n = 1;
        for(int i =0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                n++;
            }else{
                answer += str.charAt(i);
                if(n > 1) answer += String.valueOf(n);
                n = 1;
            }

        }

        return answer;
    }
    public static void main(String[] args){
        Exercise11 ex = new Exercise11();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ex.solution(str));
    }
}
