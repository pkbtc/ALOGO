import java.util.Arrays;

public class basics {
    public static void main(String[] args) {
        
     primeNumberInARange(40);
    }
    static void reverse(int n){
        int res=0;
        while(n>0){
            int rem=n%10;
            res=res*10+rem;
            n=n/10;
        }
        System.out.println(res);
    }
    static void power(int number,int power){
        int res=1;
        for (int i = 1; i <= power; i++) {
            res=res*number;
        }
        System.out.println(res);
    }
    static void fastExpo(int number,int power){
        double res=1;
        while(power>0){
            if(power%2!=0){
                res=res*number;

            }
            power/=2;
            number=number*number;
        }
        System.out.println(res);
    }
    static void countDigit(int n){
        if(n==0){
            System.out.println('1');
            return;
        }
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
    static void countDigitByLog(int n){
        System.out.println((int)Math.log10(n)+1);
    }
    static void armstrong(int n){
        int sum=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            sum+=rem*rem*rem;
            n=n/10;

        }
        if(sum==temp){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    static void palindrome(int number){
        int res=0;
        int temp=number;
        while(number>0){
            int rem=number%10;
            res=res*10+rem;
            number/=10;

        }
        if(res==temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    static void printAllDivisor(int n){
        int counter=1;
        while(counter<=(int)Math.sqrt(n)){
            if(n%counter==0){
                System.out.println(counter+"is a divisor"+n);
                int othernumber=n/counter;
                if(othernumber!=counter){
                    System.out.println(othernumber+"is a divisor"+n);
                }
            }
            counter++;
        }
    }
    static void prime(int n){
        int counter=2;
        while(counter<=(int)Math.sqrt(n)){
            if(n%counter==0){
                System.out.println("Not Prime");
                return;
            }
            counter++;
        }
        System.out.println("Prime");
    }
    static void primeNumberInARange(int n){
        boolean arr[] =new boolean[n+1];
        Arrays.fill(arr, true);
        int counter=2;

        while(counter<=n){
            if(arr[counter]==true){
                for(int factor=counter+counter;factor<=n;factor+=counter){
                    arr[factor]=false;
                }
            }
            counter++;
        }
        for(int i=2;i<=n;i++){
            System.out.println(i+" "+arr[i]);
        }
    }
    
}
