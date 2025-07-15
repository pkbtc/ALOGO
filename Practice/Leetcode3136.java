public class Leetcode3136 {
    public static void main(String[] args) {
        System.out.println(isValid("234Adas"));
    }
    public static boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        boolean hasVowel=false;
        boolean hasConsonant=false;
        for(char c:word.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
            if(isVowel(c)){
                hasVowel=true;
            }
            else if(isConsonant(c)){
                hasConsonant=true;
            }
        }
        return hasVowel&&hasConsonant;
    }
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
    public static boolean isConsonant(char c){
        return Character.isLetter(c)&&!isVowel(c);
    }
}