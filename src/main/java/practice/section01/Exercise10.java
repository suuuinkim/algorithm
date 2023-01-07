package practice.section01;

import java.util.*;
public class Exercise10 {
    public int[] solution(String str, char c){
        int[] answer = new int[str.length()];

        //  왼쪽 기준으로 거리 구하기, 오른쪽 기준으로 거리 구하기
        int p = 1000; // 제일 첫번째 문자열은 1000 으로 세팅
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == c){
                p=0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        p = 1000;

        for(int i= str.length()-1; i>=0; i--){
            if(str.charAt(i) == c) p = 0;
            else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;

    }
    public static void main(String[] args){
        Exercise10 ex = new Exercise10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        for(int x : ex.solution(str, c)){
            System.out.print(x + " ");
        }

    }
}
