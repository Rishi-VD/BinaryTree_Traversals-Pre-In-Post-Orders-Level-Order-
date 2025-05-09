package BinaryTree;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BT {
    public BT(){}
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.val = value;
        }
    }
    private TreeNode root;
    public void insert(Scanner sc){
        System.out.println("Enter the root node: ");
        int value = sc.nextInt();
        root = new TreeNode(value);
        insert(root,sc);
    }
    public void insert(TreeNode root,Scanner sc){
        System.out.println("Do you want to insert left side of(true/false): "+root.val);
        boolean l = sc.nextBoolean();
        if(l){
            System.out.println("Enter the value: ");
            int value = sc.nextInt();
            root.left = new TreeNode(value);
            insert(root.left,sc);
        }
        System.out.println("Do you want to insert right side of(true/false): "+root.val);
        boolean r = sc.nextBoolean();
        if(r){
            System.out.println("Enter the value: ");
            int value = sc.nextInt();
            root.right = new TreeNode(value);
            insert(root.right,sc);
        }
    }
    public void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<----Depth-first Search Traversal Techniques (Pre-order,In-order,Post-Order Traversals)--->");
        System.out.println("Do you want to give Pre-Order traversal path(true/false): ");
        boolean pre = sc.nextBoolean();
        if(pre){
            preOrder(root);
        }
        System.out.println();
        System.out.println("Do you want to give In-Order traversal path(true/false): ");
        boolean in = sc.nextBoolean();
        if(in){
            inOrder(root);
        }
        System.out.println();
        System.out.println("Do you want to give Post-Order traversal path(true/false): ");
        boolean pos = sc.nextBoolean();
        if(pos){
            postOrder(root);
        }
        System.out.println();
        System.out.println("<--------------Breadth First Search (Level-order Traversal)------------->");
        System.out.println("Do you want to give Level-Order traversal path(true/false): ");
        boolean lwl = sc.nextBoolean();
        if(lwl){
            leverOrder(root);
        }

    }
//    <-------------Depth-first Search Traversal Techniques (Pre-order,In-order,Post-Order Traversals)---------->
    public void preOrder(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(TreeNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }
    public void postOrder(TreeNode node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");
    }
//   <-------------------------------------------------------------------------------------------------------------->
//   <--------------------------------Breadth First Search (Level-order Traversal)---------------------------------->
    Queue<TreeNode> queue = new LinkedList<>();
    public void leverOrder(TreeNode node){
        if(node == null){
            return;
        }
        queue.add(node);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.val+" ");
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
    }
}