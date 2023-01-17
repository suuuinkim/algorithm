package practice.section05;

import java.util.*;

class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority=priority;

    }
}
public class Exercise08 {
    public int solution(int n, int m, int[] arr){
        int answer = 0;
        Queue<Person> q = new LinkedList<>();

        for(int i=0; i<n; i++){
            q.add(new Person(i, arr[i]));
        }
        while(!q.isEmpty()){
            Person tmp = q.poll();
            for(Person x : q){
                if(x.priority>tmp.priority){
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }

            if(tmp != null){
                answer++;
                if(tmp.id == m) return answer;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Exercise08 ex = new Exercise08();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(ex.solution(n, m, arr));
    }
}
