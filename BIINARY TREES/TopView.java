import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class TopView{
     static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        int hd;
        Node node;
        
        Info(Node node , int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

    }

    
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);

        System.out.println(topView(root));
    }

    
    
    public static ArrayList<Integer> topView(Node root) {
        // code here
        Queue<Info> q  = new LinkedList<>();
        HashMap<Integer , Node> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
            
        int min = 0 , max = 0;
        q.add(new Info(root,0));
        
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr.node == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left , curr.hd-1));
                    min = Math.min(min , curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right , curr.hd+1));
                    max = Math.max(max , curr.hd+1);
                }
            }
        }
        
        for(int i=min ; i<= max ; i++){
            ans.add(map.get(i).data);
        }
        return ans;
    }
}