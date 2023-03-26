package practice2.section07;

/**
 * 재귀 함수를 이용한 이진추 출력
 */
public class Exercise02 {
    public void DFS(int n){

//        String binary = Integer.toBinaryString(n);
//        String octal = Integer.toOctalString(n);
//        String hex = Integer.toHexString(n);

        if(n == 0) return;
        else{
            DFS(n/2);
            System.out.print(n%2 + " ");
        }

    }
    public static void main(String[] args){
        Exercise02 ex = new Exercise02();
        ex.DFS(11);
    }
}
