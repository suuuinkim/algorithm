package practice.section05;

import java.util.*;
public class Exercise02 {
    // 괄호는 stack 문제라고 생각하기
    public String solution(String s){
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for(char x : s.toCharArray()){
            if(x == ')') {
                while(stack.pop() != '(');

                //stack.push(x);
            }
            else stack.push(x);

        }

        for(int i=0; i<stack.size(); i++){
            answer += stack.get(i);
        }
        return answer;
    }
    public static void main(String[] args){
        Exercise02 ex = new Exercise02();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(ex.solution(s));
    }
}
