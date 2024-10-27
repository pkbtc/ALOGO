public class Leetcode2458 {
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
         static int max;
    public static void main(String[] args) {
        
    }
    public int[] treeQueries(TreeNode root, int[] queries) {
        int[] right=new int[100001];
        int[] left=new int[100001];
        max=0;
        leftFirst(root,left,0);
        max=0;
        rightFirst(root,right,0);
        for (int i = 0; i < queries.length; i++) {
            queries[i]=Math.max(left[queries[i]],right[queries[i]]);

        }
        return queries;
    }

    private void leftFirst(TreeNode root, int[] left,int d){
            if(root==null){
                return;
            }
            left[root.val]=max;
            max=Math.max(max, d);
            leftFirst(root.left,left,d+1);
            leftFirst(root.right,left,d+1);
    }

    private void rightFirst(TreeNode root, int[] right,int d){
            if(root==null){
                return;
            }
            right[root.val]=max;
            max=Math.max(max, d);
            rightFirst(root.right,right,d+1);
            rightFirst(root.left,right,d+1);
    }
}
