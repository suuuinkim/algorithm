package practice.section05;

import java.util.*;
public class Exercise01 {
    public String solution(String s){
        String answer = "YES";

        // Stack 사용하기 LIFO
        // Que ----------- FIFO
        //     -----------

        // 1. character 용 stack 만들기
        // stack 넣는 거는 push
        // stack 꺼내는 거는 pop
        // stack 빈 것인지 여부 isEmpty

        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(x == '(') stack.push(x);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if(!stack.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args){
        Exercise01 ex = new Exercise01();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(ex.solution(s));
    }
}
