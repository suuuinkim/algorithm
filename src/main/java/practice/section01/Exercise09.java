package practice.section01;

import java.util.*;
public class Exercise09 {
    public int solution(String str){
        String answer = "";
        //char[] c = str.toCharArray();
        // 숫자만 추출

        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){ // 만약에 숫자이면 answer에 넣기!!!
                answer += c;
            }
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
