package practice2.section01;

import java.util.*;
public class Exercise05 {
    public String solution(String str){
        String answer = "";

        char[] s = str.toCharArray();

        int lt =0, rt = str.length()-1;

        while(lt < rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt]))rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }
    public static void main(String[] args){
        Exercise05 ex = new Exercise05();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(ex.solution(str));
    }
}
