package practice.section05;

import java.util.*;
public class Exercise04 {
    public int solution(String s){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){
                stack.push(x-48);
            }else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') stack.push(lt+rt);
                else if(x== '*') stack.push(lt*rt);
                else if(x== '-') stack.push(lt-rt);
                else if(x== '/') stack.push(lt/rt);

            }
        }

        answer = stack.get(0);

        return answer;
    }
    public static void main(String[] args){
        Exercise04 ex = new Exercise04();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(ex.solution(s));

    }
}
