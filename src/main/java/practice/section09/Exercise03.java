package practice.section09;

import java.util.*;
class Attend implements Comparable<Attend>{
    public int time;
    public char state;

    Attend(int time, char state){
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Attend o){
        if(this.time== o.time) return this.state - o.state;
        else return this.time - o.time;
    }
}
public class Exercise03 {

    public int solution(ArrayList<Attend> arr){
        int answer = Integer.MIN_VALUE;

        Collections.sort(arr); // 오름차순 정렬
        int cnt = 0;
        for(Attend ob : arr){
            if(ob.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }

        return answer;
    }
    public static void main(String[] args){
        Exercise03 ex = new Exercise03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Attend> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            int st = sc.nextInt();
            int et = sc.nextInt();
            arr.add(new Attend(st, 's'));
            arr.add(new Attend(et, 'e'));
        }
        System.out.println(ex.solution(arr));
    }
}
