class Leetcode3307{
    public static void main(String[] args) {
        int[] operations = {1,2,3,4,5};
        System.out.println(kthCharacter(10, operations));
    }
    public char kthCharacter(long k, int[] operations) {
        int countOps=0;
        long val=k;
        while(val>1){
            int jumps = (int) Math.ceil(Math.log(val) / Math.log(2));
            val -= (long) Math.pow(2, jumps - 1);
            countOps += operations[jumps - 1];
        }
        return (char) ('a' + (countOps % 26));
    }
}