public class CreateBST {

    class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node root=null;

    public static void main(String[] args) {
        CreateBST bst = new CreateBST();
        bst.createBST(50);
        bst.createBST(30);
        bst.createBST(20);
        bst.createBST(40);
        bst.createBST(70);
        bst.createBST(60);
        bst.createBST(80);
        bst.createBST(55);
        bst.createBST(65);
        System.out.println(bst.toString(root));
        System.out.println(bst.toString(bst.floor(35)));
    }

    private Node createBST(int data) {
        Node newNode = new Node(data);
        if(root==null){
            root=newNode;
            return root;
        }
        Node curr=root;
        Node prev=null;
        while(curr!=null){
            if(curr.data>data){
                prev=curr;
                curr=curr.left;
            }else if(curr.data<data){
                prev=curr;
                curr=curr.right;
            }
        }
        if(data>prev.data){
            prev.right=newNode;
        }else{
            prev.left=newNode;
        }
        return root;
    }

    Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // 0 or 1 child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // 2 children
            Node succ = min(root.right);
            root.data = succ.data;
            root.right = delete(root.right, succ.data);
        }
        return root;
    }

    Node min(Node node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    private Node floor(int data) {
        if (root == null) return null;
        if(root.data==data) return root;
        Node curr = root;
        Node Ans = null;
        while(curr!=null){
            if(curr.data==data){
                return curr;
            }
            if(curr.data>data){
                curr=curr.left;
            }else if(curr.data<data){
                Ans=curr;
                curr=curr.right;
            }
        }
        if(Ans==null){
            System.out.println("no valid node");
            return null;
        }
         return Ans;
    }
    public String toString(Node root) {
        return root.left + " | " + root.data+ "  | " + root.right;
    }
}
