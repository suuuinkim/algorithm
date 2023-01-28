package practice.section10;

import java.util.*;
class Brick implements Comparable<Brick>{
    public int s, h, w;
    Brick(int s, int h, int w){
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick o){
        return o.s - this.s; // 내림차순 정렬
    }
}
public class Exercise04 {

    static int[] dy;
    static int n;
    public int solution(ArrayList<Brick> arr){
        Collections.sort(arr);
        dy = new int[n];
        dy[0] = arr.get(0).h; // 탑의 높이 저장
        int answer = dy[0];

        for(int i=1; i<n; i++){
            int max = 0;
            for(int j=i-1; j>=0; j--){
                if(arr.get(j).w > arr.get(i).w && dy[j] > max){
                    max = dy[j];
                }
                dy[i] = max + arr.get(i).h;
                answer = Math.max(answer, dy[i]);
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Exercise04 ex = new Exercise04();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        ArrayList<Brick> arr = new ArrayList<Brick>();
        for(int i=0; i<n; i++){
            int s = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Brick(s, h, w));
        }

        System.out.println(ex.solution(arr));
    }
}
