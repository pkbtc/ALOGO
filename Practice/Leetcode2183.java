public class Leetcode2183 {
    public static void main(String[] args) {
        
    }
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;

        }
        StringBuilder ans=new StringBuilder();
        int index=25;
        while(index>=0){
            if(freq[index]==0){
                index--;
                continue;
            }
            int count=Math.min(freq[index],repeatLimit);
            for(int i=0;i<count;i++){
                ans.append((char)(index+'a'));

            }
            freq[index]-=count;
            if(freq[index]>0){
                int prevIndex=index-1;
                while(prevIndex>=0 && freq[prevIndex]==0){
                    prevIndex--;
                }
                if(prevIndex<0){
                    break;
                }
                ans.append((char)('a'+prevIndex));
                freq[prevIndex]--; 
            }
        }
        return ans.toString();
    }
}
