package practice.section02;

import java.util.*;
public class Exercise06 {

    public boolean isPrime(int num){
        if(num == 1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;

        }
        return true;
    }
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<n; i++){
            // 뒤집기
            /*
            int t = n % 10 // 
            answer = answer*10 + t;
            n = n/10
            */

            int tmp = arr[i];
            int res = 0;
            while(tmp > 0){
                int t = tmp % 10;
                res = res*10 + t;
                tmp = tmp/10;
            }

            if(isPrime(res)) answer.add(res);

        }
        return answer;
    }
    public static void main(String[] args){
        Exercise06 ex = new Exercise06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int x : ex.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
