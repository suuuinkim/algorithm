package practice.section09;

import java.util.*;
// 모든 지원자들을 비교
// 그리디 문제 (최선의 선택을 하는 것)

// 좌표 정렬
class Body implements Comparable<Body>{
    public int h, w;
    Body(int h, int w){
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o){
        return o.h - this.h; // 내림차순
    }
}
public class Exercise01 {
    public int solution(ArrayList<Body> arr, int n){
        int answer = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for(Body ob : arr){ // 몸무게 최대값만 비교 (키로 내림차순 정렬을 했기 때문)
            if(ob.w>max){
                max = ob.w;
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Exercise01 ex = new Exercise01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Body(h, w));
        }

        System.out.println(ex.solution(arr, n));
    }
}
