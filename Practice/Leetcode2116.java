public class Leetcode2116 {
    public static void main(String[] args) {
        System.out.println(new Leetcode2116().canBeValid("))()))", "010100"));
    }
    public boolean canBeValid(String s, String locked) {
        int n=s.length();
        if(n%2==1){
            return false;
        }
        
        int balance=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(' || locked.charAt(i)=='0'){
                balance++;
            }
            else if(balance>0){
                balance--;
            }
            else{
                return false;
            }
        }
        balance=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==')' || locked.charAt(i)=='0'){
                balance++;
            }
            else if(balance>0){
                balance--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
