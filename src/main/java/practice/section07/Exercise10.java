package practice.section07;

import java.util.*;
public class Exercise10 {
    Node root;
    public int BFS(Node root){
        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        int L =0;
        while(!q.isEmpty()){
            int len = q.size(); // Level의 길이
            for(int i=0; i<len; i++){
                Node cur = q.poll();
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null) q.offer(cur.lt);
                if(cur.rt != null) q.offer(cur.rt);
            } // 한 level
            L++;

        }

        return 0;
    }
    public static void main(String[] args){
        Exercise10 tree = new Exercise10();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));


    }
}
