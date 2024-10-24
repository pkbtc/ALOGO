import java.util.*;
public class Leetcode2641 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
    }
    public static void main(String[] args) {
            
    }
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        ArrayList<Integer> list=new ArrayList<>();
        
        while(!q.isEmpty()){
            int n=q.size();
            int sum=0;
            for (int i = 0; i < n; i++) {
                TreeNode node=q.poll();
                sum+=node.val;
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            list.add(sum);
        }
        q.offer(root);
        root.val=0;
        int level=0;
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                int sum=0;
                if(node.left!=null){
                    sum+=node.left.val;
                }
                if(node.right!=null){
                    sum+=node.right.val;
                }
                if(node.left!=null){
                    node.left.val=list.get(level+1)-sum;
                    q.offer(node.left);
                }
                if(node.right!=null){
                    node.right.val=list.get(level+1)-sum;
                    q.offer(node.right);
                }
            }
            level++;
        }
        return root;
    }
}
