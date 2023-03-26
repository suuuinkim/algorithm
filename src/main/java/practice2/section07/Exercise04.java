package practice2.section07;

/**
 * 피보나치 수열
 * (재귀가 더 느림 -> 스택프레임을 사용하기 때문에)
 */
public class Exercise04 {
    /**
     * 방법 1 (n이 커질수록 속도가 느림)
     */
//    public int DFS(int n){
//        if(n == 1) return 1;
//        else if(n == 2) return 1;
//        else return DFS(n-2) + DFS(n-1);
//    }
//
//    public static void main(String[] args){
//        Exercise04 ex = new Exercise04();
//        int n = 10;
//        for(int i=1; i<=n; i++){
//            System.out.print(ex.DFS(i) + " ");
//        }
//    }

    /**
     * 방법 2 메모이제이션(기록)
     */
    static int[] fibo;
    public int DFS(int n){
        if(fibo[n] > 0) return fibo[n]; // 메모리제이션을 활용한 것!
        if(n==1) return fibo[n] = 1;
        else if(n==2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-1) + DFS(n-2);
    }
    public static void main(String[] args){
        Exercise04 ex = new Exercise04();
        int n = 45;
        fibo= new int[n+1];
        ex.DFS(n);
        for(int i=1; i<=n; i++) System.out.print(fibo[i] + " ");
    }
}
