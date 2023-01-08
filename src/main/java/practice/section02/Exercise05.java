package practice.section02;

import java.util.*;
public class Exercise05 {

    public int solution(int n){
        // �����佺�׳׽� ü : �Ҽ��� �Ǵ� ���� ����� ����� ���� �� �Ҽ��� �ȴ�
        // 2���� �ڱ� �ڽ��� ������ ����� �Ǵ� ���� �����.

        int answer = 0;
        int[] ch = new int[n+1];

        for(int i=2; i<=n; i++){
            if(ch[i] == 0) answer ++;

            for(int j=i; j<n; j=j+i){
                ch[j] =1;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Exercise05 ex = new Exercise05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(ex.solution(n));
    }
}
