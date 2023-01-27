package practice.section09;

import java.util.*;

class Time implements Comparable<Time>{ // 정렬하기 위해 사용
    public int s, e;
    Time(int s, int e){
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o){
        if(this.e == o.e) return this.s - o.s; // 끝나는 시간이 같으면 시작시간 기준으로 정렬
        else return this.e - o.e; // 끝나는 시간 기준으로 정렬
    }
}
public class Exercise02 {
    public int solution(ArrayList<Time> arr, int n){
        int answer = 0;
        Collections.sort(arr); // 오름차순 정렬
        int et = 0; // 끝나는 시간
        for(Time ob : arr){
            if(ob.s >= et){
                answer ++;
                et = ob.e;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Exercise02 ex = new Exercise02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Time> arr =new ArrayList<>();

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Time(x, y));
        }
        System.out.println(ex.solution(arr, n));
    }
}
