package practice.section05;

import java.util.*;
public class Exercise05 {
    public int solution(String s){
        int answer = 0;
        Stack<Character> stack = new Stack<>();


        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == '(') stack.push(s.charAt(i));
            else{ // 닫는 괄호
                stack.pop();
                if(s.charAt(i-1) == '(') answer += stack.size();// 레이저
                else answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Exercise05 ex = new Exercise05();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(ex.solution(s));
    }
}
