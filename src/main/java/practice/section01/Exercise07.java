package practice.section01;

import java.util.*;
public class Exercise07 {

    public String solution(String str){
        /*String answer = "";

        char[] c = str.toCharArray();
        int lt =0, rt = str.length()-1;

        while(lt<rt){

            if(c[lt] == c[rt]){
                answer = "Yes";
                lt++;
                rt--;

            }else{
                answer = "No";
                lt++;
                rt--;
            }
        }*/

        String answer = "Yse";
        /*str = str.toUpperCase(); // ��ҹ��ڸ� �������� ���� ���� �� �빮�ڷ� �ٲ��ִ��� �� �ҹ��ڷ� �ٲ��ش�
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                return "No";
            }
        }*/

        String tmp = new StringBuilder(str).reverse().toString();

        if(!str.equalsIgnoreCase(tmp)){
            return "No";
        }
        return answer;
    }
    public static void main(String[] args){
        Exercise07 ex = new Exercise07();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(ex.solution(str));
    }
}
