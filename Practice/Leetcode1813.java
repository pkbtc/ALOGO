public class Leetcode1813 {
    public static void main(String[] args) {

    }
    public boolean areSentencesSimilar(String s1, String s2) {
        if(s1.length()>s2.length()){
            return areSentencesSimilar(s2,s1);
        }
        String[] smallerWords=s1.split(" ");
        String[] largerWords=s2.split(" ");
        int start=0;
        int end1=smallerWords.length-1;
        int end2=largerWords.length-1;
        //prefix check
        while(start<=end1 && smallerWords[start].equals(largerWords[start])){
            start++;
        }
        //suffx check
        while(start<=end1 && smallerWords[end1].equals(largerWords[end2])){
            end1--;
            end2--;
        }
        return (start>end1);
        

    }
}
