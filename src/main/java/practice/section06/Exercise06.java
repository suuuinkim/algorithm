package practice.section06;

import java.lang.reflect.Array;
import java.util.*;
public class Exercise06 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = arr.clone();
        Arrays.sort(answer);
        for(int i=0; i<n; i++){
            if(arr[i] != answer[i]) list.add(i+1);
        }
        //System.out.println(list);

        return list;
    }
    public static void main(String[] args){
        Exercise06 ex = new Exercise06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int x : ex.solution(n, arr)) System.out.print(x + " ");
    }
}
