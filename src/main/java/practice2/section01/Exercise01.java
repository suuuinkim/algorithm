package practice2.section01;

import java.util.*;
public class Exercise01 {
    public int solution(String str, char c){
        int answer = 0;

        str = str.toLowerCase();
        for(char x : str.toCharArray()){
            if(x == c) answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        Exercise01 ex = new Exercise01();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char c = sc.next().charAt(0);

        System.out.println(ex.solution(str, c));
    }
}
