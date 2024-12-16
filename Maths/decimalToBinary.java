public class decimalToBinary {
    public static void main(String[] args) {
        //decimalToBinary(15);
       // decimalToAnyBase(15, 2);
     // binaryToDecimal(1111);
      // binaryToAnyBase(1111, 8);
      anyBaseToDecimal(1111, 2);
    }
    static void decimalToBinary(int number) {
        int res=0;
        int power=0;
        while(number>0){
            int rem=number%2;
            res+=rem*Math.pow(10,power);
            number/=2;
            power++;
        }
        System.out.println(res);
    }
    static void decimalToAnyBase(int number,int base){
        int res=0;
        int power=0;
        while(number>0){
            int rem=number%base;
            res+=rem*Math.pow(10,power);
            number/=base;
            power++;
        }
        System.out.println(res);
    }
    static void binaryToDecimal(int number){
        int res=0;
        int power=0;
        while(number>0){
            int rem=number%10;
            res+=rem*Math.pow(2,power);
            number/=10;
            power++;

        }
        System.out.println(res);
    }
    static void anyBaseToDecimal(int number,int base){
        int res=0;
        int power=0;
        while(number>0){
            int rem=number%10;
            res+=rem*Math.pow(base,power);
            number/=10;
            power++;
        }
        System.out.println(res);
    }
}