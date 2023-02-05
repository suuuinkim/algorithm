package practice2.section01;

import java.util.*;
public class Exercise04 {
    public ArrayList<String> solution(int n, String[] arr){
        ArrayList<String> answer = new ArrayList<>();

        /*for(String x : arr){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }*/


        for(String x : arr){
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;

            while(lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }


        return answer;
    }
    public static void main(String[] args){
        Exercise04 ex = new Exercise04();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];

        for(int i=0; i<n; i++) arr[i] = sc.next();

        for(String x : ex.solution(n, arr)){
            System.out.println(x);
        }
    }
}
