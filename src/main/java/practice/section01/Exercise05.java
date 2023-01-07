package practice.section01;

import java.util.*;
public class Exercise05 {

    public String solution(String str){
        String answer;
        char[] c = str.toCharArray();

        int lt=0, rt = str.length()-1;

        //특수문자인지 아닌지 확인하는 조건

        while(lt<rt){

            if(!Character.isAlphabetic(c[lt])){
                lt++;
            }else if(!Character.isAlphabetic(c[rt])){
                rt--;
            }else{
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(c);
        return answer;
    }
    public static void main(String[] args){
        Exercise05 ex = new Exercise05();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(ex.solution(str));
    }
}
