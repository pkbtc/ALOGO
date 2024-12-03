public class Leetcode2109 {
    public static void main(String[] args) {
        System.out.println(new Leetcode2109().addSpaces("LeetcodeHelpsMeLearn", new int[]{8, 13, 15}));
    }

    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (j < spaces.length && i == spaces[j]) {
                sb.append(' ');
                j++;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
