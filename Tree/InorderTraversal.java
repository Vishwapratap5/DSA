import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
   int data;
   TreeNode left;
   TreeNode right;
   TreeNode(int data) {
       this.data = data;
       left = null;
       right = null;
   }
}

class BinaryTree {
    TreeNode root;

    int maxDepth( TreeNode node)
    {
        if (node == null)
            return 0;
        else {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
            return Math.max(lDepth, rDepth) + 1;
        }
    }

    void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i =0;i< levelSize; i++) {
                TreeNode node = queue.poll();
                System.out.print(node.data+" ");
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            System.out.println();
        }
    }

    void leftView(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i =0;i< levelSize; i++) {
                TreeNode node = queue.poll();
                if(i==0){
                    System.out.print(node.data+" ");
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            System.out.println();
        }
    }
    TreeNode head;
    TreeNode prev;
    TreeNode getDLL(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode curr = getDLL(root.left);
        if(prev==null){
            prev = curr;
            head=root;
        }
        curr=root;
        root.left=prev;
        prev.right=root;
        prev=root;

        return curr;
    }
    boolean childrenSum(TreeNode root) {
        if (root == null) return true;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left == null && node.right == null) continue;

            int leftData = (node.left != null) ? node.left.data : 0;
            int rightData = (node.right != null) ? node.right.data : 0;

            if (leftData + rightData != node.data) {
                return false;
            }

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }

        return true;
    }
    int check(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = check(root.left);
        if (leftDepth == -1) return -1;
        int rightDepth = check(root.right);
        if (rightDepth == -1) return -1;

        if(Math.abs(leftDepth - rightDepth) > 1) return -1;

        return Math.max(leftDepth, rightDepth) + 1;
    }
    boolean isHightBalanced(TreeNode root) {
        return check(root)!=-1;
    }
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        tree.root = new  TreeNode(3);
        tree.root.left = new  TreeNode(1);
        tree.root.right = new  TreeNode(2);
        tree.root.right.left = new  TreeNode(1);
        tree.root.right.right = new  TreeNode(1);
        tree.root.right.right.right=new  TreeNode(10);
        System.out.println(tree.isHightBalanced(tree.root));
    }
}

