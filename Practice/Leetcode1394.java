import java.util.*;
public class Leetcode1394 {
    public static void main(String[] args) {
        System.out.println(findLucky(new int[]{2,2,3,4}));
    }
    public static int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
    
    for (int num : arr) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    
    int largestLucky = -1;
    
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getKey().equals(entry.getValue())) {
            largestLucky = Math.max(largestLucky, entry.getKey());
        }
    }
    
    return largestLucky;

    }
}
