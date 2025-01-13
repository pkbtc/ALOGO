import java.util.*;
public class Leetcode3223 {
    public static void main(String[] args) {
        System.out.println(new Leetcode3223().minimumLength("abaacbcbb"));
    }
    public int minimumLength(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }

        int ans = 0;
        for (int x : cnt) {
            if (x > 0) {
                ans += x % 2 == 1 ? 1 : 2;
            }
        }
        
        return ans;
    }
}
