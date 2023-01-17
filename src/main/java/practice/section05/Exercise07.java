package practice.section05;

import java.util.*;
public class Exercise07 {
    public String solution(String s, String str){
        String answer = "YES";

        // s : need, str : plan
        Queue<Character> q = new LinkedList<>();

        for(char x : s.toCharArray()) q.offer(x);
        for(char x : str.toCharArray()){
            if(q.contains(x)) { // 필수과목
                if(x != q.poll()) return "NO";
            }
        }
        
        if(!q.isEmpty()) return "NO"; // 필수과목을 이수하지 않은 경우
        return answer;
    }
    public static void main(String[] args){
        Exercise07 ex = new Exercise07();
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String str = sc.nextLine();

        System.out.println(ex.solution(s, str));
    }
}
