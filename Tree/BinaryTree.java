import java.util.Scanner;

public class BinaryTree{
    public static class Node{
        int val;
        Node left;
        Node right;
        
        public Node(int val){
            this.val = val;
        }
    }
    private Node root;
    public void populate(Scanner sc){
            System.out.println("Enter the root node: ");
            int value=sc.nextInt();
            root=new Node(value);
            populate(sc,root);
    }
    private void populate(Scanner sc,Node node){
        System.out.println("want to enter the value of left "+node.val);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("Enter the value of left "+node.val);
            int value=sc.nextInt();
            node.left=new Node(value);
            populate(sc,node.left);
        }
        System.out.println("want to enter the value of right "+node.val);
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("Enter the value of right "+node.val);
            int value=sc.nextInt();
            node.right=new Node(value);
            populate(sc,node.right);
        }

    }
    public void display(){
        display(root,"");
    }
    private void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.val);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinaryTree bt=new BinaryTree();
        bt.populate(sc);
        bt.display();
    }
}