package practice2.section07;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 이진트리 순회(넓이우선탐색 : 레벨탐색)
 * 최단거리에 사용
 */

class Node2{
    int data;
    Node lt, rt;
    public Node2(int val) {
        data=val;
        lt=rt=null;
    }
}
public class Exercise07 {
    Node root;
    public void BFS(Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while(!q.isEmpty()){
            int len = q.size();
            System.out.print(L + " : ");
            for(int i=0; i<len; i++){
                Node cur = q.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null) q.offer(cur.lt);
                if(cur.rt != null) q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }


    public static void main(String[] args){
        Exercise07 tree = new Exercise07();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.BFS(tree.root);
    }
}
