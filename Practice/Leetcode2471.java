import java.util.Queue;
import java.util.*;
public class Leetcode2471 {
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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int count=0;
        while(!queue.isEmpty()){
            int level[]=new int[queue.size()];
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                level[i]=node.val;
                if(node.left!=null){
                    queue.offer(node.left);
                    
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            count+=countSwaps(level);
        }
        return count;
    }
    public int countSwaps(int level[]){
        int count=0;
        int sotedArr[]=level.clone();
        Arrays.sort(sotedArr);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<level.length;i++){
            map.put(level[i],i);
        }
        for(int i=0;i<level.length;i++){
            if(level[i]!=sotedArr[i]){
                int index=map.get(sotedArr[i]);
                map.put(level[index],i);
                map.put(level[i],index);
                level[index]=level[i];
                level[i]=sotedArr[i];
                count++;
            }
        }
        return count;

    }
}
