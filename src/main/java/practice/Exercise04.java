package practice;

import java.util.*;
public class Exercise04 {

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();

//        for(String x : str){
//            String tmp = new StringBuilder(x).reverse().toString(); // 뒤집고 다시 String으로 바꾸기
//            // String 은 불변객체
//            answer.add(tmp);
//        }

        for(String x : str){
            char[] s = x.toCharArray();
            int lt = 0, rt=x.length()-1;
            while(lt<rt){
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
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }

        for(String x : ex.solution(n, str)){
            System.out.println(x);
        }

    }
}
