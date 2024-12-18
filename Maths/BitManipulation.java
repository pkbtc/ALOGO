public class BitManipulation {
    public static void main(String[] args) {
        
        // oddAndEven(99);
        // isBitSet(15,3);
        // printBits(32);
        // setBit(32, 0);
        // printBits(33);
        // printBits(32);
        // int res=toggleBit(32, 0);
        // printBits(res);
        // printBits(15);
        // int res=unsetBit(15, 0);
        // printBits(res);
        // printBits(32);
        // int res1=unsetBit(32, 0);
        // printBits(res1);
        powerOfTwo(7);
    }
    static void oddAndEven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("even");

        }
        else {
            System.out.println("odd");
        }
    }
    static void printBits(int n){
        for(int i=7;i>=0;i--){
            System.out.print((n>>i)&1);
        }
        System.out.println();
    }
    static void isBitSet(int n,int bit){
        if((n&(1<<bit))!=0){
            System.out.println("set");
        }
        else {
            System.out.println("not set");
        }
    }
    static void setBit(int n,int bit){
        int bitMask=1<<bit;
        n=n|bitMask;
        System.out.println(n);
    }
    static int toggleBit(int n,int bit){
        int bitMask=1<<bit;
        n=n^bitMask;
        return n;
    }
    static int unsetBit(int n,int bit){
        int bitMask=1<<bit;
        if((n&bitMask)!=0){
            n=n^bitMask;
        }
        
        return n;
    }
    static void powerOfTwo(int n){
        if((n&n-1)==0){
            System.out.println("power of 2");
        }
        else {
            System.out.println("not power of 2");
        }
    }
    
}
