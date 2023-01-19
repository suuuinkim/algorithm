package practice.section06;

import java.util.*;
public class Exercise05 {
    public char solution(int n, int[] arr){
        char answer = 'U';

        // HashMap 사용 방법
        /*HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0)+1);

            if(map.get(x) > 1) answer = 'D';
        }*/

        // 정렬 사용 방법
        Arrays.sort(arr);

        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]) return 'D';
        }

        return answer;
    }
    public static void main(String[] args){
        Exercise05 ex = new Exercise05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        System.out.println(ex.solution(n, arr));
    }
}
