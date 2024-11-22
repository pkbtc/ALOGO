import java.util.*;
public class Leetcode1072 {
    public static void main(String[] args) {
        
    }
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String,Integer> map=new HashMap<>();
        for(int[] row :matrix){
            StringBuilder values=new StringBuilder();
            StringBuilder flipped=new StringBuilder();

            for(int r:row){
                values.append(r);
                flipped.append(1-r);

            }

            String vs=values.toString();
            String fs=flipped.toString();

            map.put(vs,map.getOrDefault(vs, 0)+1);
            map.put(fs,map.getOrDefault(fs, 0)+1);


        }
        int max=0;
        for(int v:map.values()){
            max=Math.max(max,v);
        }
        return max;
    }
}