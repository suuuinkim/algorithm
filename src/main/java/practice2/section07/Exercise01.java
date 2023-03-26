package practice2.section07;

/**
 * 재귀함수
 */
public class Exercise01 {
    public void DFS(int n){
        // 스택프레임
        if(n == 0) return;
        else{
            System.out.print(n + " "); // 3 2 1
            DFS(n-1);
            System.out.print(n + " "); // 1 2 3
        }
    }
    public static void main(String[] args){
        Exercise01 ex = new Exercise01();
        ex.DFS(3);

    }
}
