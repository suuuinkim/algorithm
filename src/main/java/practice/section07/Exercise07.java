package practice.section07;

import java.util.LinkedList;
import java.util.Queue;

class Node2{
    int data;
    Node lt, rt;
    public Node2(int val){
        data = val;
        lt = rt = null;
    }
}
public class Exercise07 {

    Node root;
    public void DFS(Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while(!q.isEmpty()){
            int len = q.size();
            System.out.print(L + " : ");
            for(int i=0; i<len; i++){
                Node cur = q.poll();
                System.out.println(cur.data + "  ");
            }
        }




    }

    public static void main(String[] args){
        Exercise07 tree = new Exercise07();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }

}
