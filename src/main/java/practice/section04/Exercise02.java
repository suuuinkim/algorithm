package practice.section04;

import java.util.*;
public class Exercise02 {
    public String solution(String a, String b){
        String answer = "Yes";
        // a = a.toUpperCase();
        // b = b.toUpperCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : a.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(char x : b.toCharArray()){
            if(!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x)-1);
        }


        return answer;
    }
    public static void main(String[] args){
        Exercise02 ex = new Exercise02();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(ex.solution(a, b));
    }
}
