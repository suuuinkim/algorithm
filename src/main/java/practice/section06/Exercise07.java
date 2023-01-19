package practice.section06;

import java.util.*;
class Point implements Comparable<Point>{
    public int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o){
        // 오름차순
        // if(this.x == o.x) return this.y - o.y;
        // else return this.x - o.x;

        // 내림차순
        if(this.x == o.x) return o.y - this.y ;
        else return o.x - this.x;
    }
}
public class Exercise07 {
    public static void main(String[] args){
        Exercise07 ex = new Exercise07();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x+ " " + o.y);
    }
}
