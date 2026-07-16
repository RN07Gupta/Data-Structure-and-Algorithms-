class SearchBST{

    
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

    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left , val);
        }
        else{
            root.right = insert(root.right , val);
        }
        return root;
    }

    public static boolean search(Node root , int k){
        if(root == null ){
            return false;
        }

        if(root.data == k ){
            return true;
        }

        if(root.data > k){
            return search(root.left ,k);
        }
        return  search(root.right , k);
        

    }
    public static void main(String[] args) {
        int[] val = {8,5,3,6,1,4,10,11,14}; 
        Node root = null;

        for(int i=0 ; i<val.length ; i++){
            root = insert(root , val[i]);
        }

        System.out.println(search(root , 7));
    }
}