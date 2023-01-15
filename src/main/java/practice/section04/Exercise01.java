package practice.section04;

import java.util.*;
public class Exercise01 {
    public char solution(int n, String str){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        // System.out.println(map.containsKey('F'));
        // System.out.println(map.size());
        // System.out.println(map.remove('A'));


        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            // System.out.println(key + " " + map.get(key));

            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Exercise01 ex = new Exercise01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(ex.solution(n, str));
    }
}
