package practice2.section07;

/**
 * 부분집합 구하기
 */
public class Exercise06 {
    static int n;
    static int[] ch; // 사용하는지 안하는지를 담을 체크배열
    public void DFS(int L){
        if(L == n+1){
            String tmp = "";
            for(int i=1; i<=n; i++){
                if(ch[i] == 1) tmp += (i + " ");
            }
            if(tmp.length() > 0) System.out.println(tmp);
        }else{
            ch[L] = 1;
            DFS(L+1); // 왼쪽
            ch[L] = 0;
            DFS(L+1); // 오른쪽
        }
    }
    public static void main(String[] args){
        Exercise06 ex = new Exercise06();
        n =3;
        ch = new int[n+1];
        ex.DFS(1);
    }
}
