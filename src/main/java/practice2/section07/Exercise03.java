package practice2.section07;

/**
 * 팩토리얼
 */
public class Exercise03 {
    public int DFS(int n){
        if(n == 1) return 1;
        else return n*DFS(n-1);
    }
    public static void main(String[] args){
        Exercise03 ex = new Exercise03();
        System.out.println(ex.DFS(5));

    }
}
