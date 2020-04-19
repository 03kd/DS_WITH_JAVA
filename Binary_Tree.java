class Node{
    int data;
    Node left;
    Node right;

    Node(int value){
        this.data = value;
        right = null;
        left = null;

    }
}
class BinaryTree{
    public void insert(Node node, int value){
        if(value < node.data){
            if(node.left != null){
                insert(node.left, value);
            }
            else{
                System.out.println("Insert "+value+ " to left "+node.data);
                node.left = new Node(value);
            }
        }
        else{
            if(node.right != null){
                insert(node.right, value);
            }
            else{
                System.out.println("Insert "+ value +" at the right of "+ node.data);
                node.right = new Node(value);
            }
        }
    }

   public boolean search(Node node,int value){
       if(node == null) return false;

       if(node.data == value) return true;

       boolean res1 = search(node.left, value);
       if(res1) return true;

       boolean res2 =search(node.right, value);
       if(res2) return true;
       else return false;
   }

    public void traversal_Inorder(Node node){
        if(node != null){
            traversal_Inorder(node.left);
            System.out.print(" "+node.data);
            traversal_Inorder(node.right);
        }
    }

    public void traversal_Preorder(Node node){
        if(node != null){
            System.out.print(" "+ node.data);
            traversal_Preorder(node.left);
            traversal_Preorder(node.right);
        }
    }
    public void traversal_Postorder(Node node){
        if(node !=null){
            traversal_Postorder(node.left);
            traversal_Postorder(node.right);
            System.out.print(" "+ node.data);
        }
    }
}
class BinaryDriver{
    public static void main(String []args){
        //Tree t =new Tree();
        Node root = new Node(5);
        System.out.println("Binary tree example");
        System.out.println("Building with the root value "+ root.data);

        BinaryTree t = new BinaryTree();
        t.insert(root, 4);
        t.insert(root, 8);
        t.insert(root, 2);
        t.insert(root,1);
        System.out.println("In-order traversal");
        t.traversal_Inorder(root);
        System.out.println("\nPre-order traversal");
        t.traversal_Preorder(root);
        System.out.println("\nPost-order traversal");
        t.traversal_Postorder(root);
        System.out.println();
        

        if(t.search(root,6)){
            System.out.println("YES");
        }
        else{
            System.out.println("no");
        }
    }
}