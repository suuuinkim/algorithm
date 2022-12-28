package practice;
import java.util.*;
public class Exercise02 {

    public String solution(String str){

        String answer ="";
        for(char c : str.toCharArray()){
            /*
            if(Character.isLowerCase(c)){
                answer += Character.toUpperCase(c);
            }else{
                answer += Character.toLowerCase(c);
            }
            */

//            아스키 코드를 사용한 풀이
            if(c>=65 && c<=90){ // 대문자면
                answer += (char)(c+32);
            }else{
                answer += (char)(c-32);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Exercise02 ex = new Exercise02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(ex.solution(str));
    }
}
