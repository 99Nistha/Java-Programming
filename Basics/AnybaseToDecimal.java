import java.util.Scanner;

public class AnybaseToDecimal {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int base= scn.nextInt();
        int n= scn.nextInt();
        System.out.print(atd(base, n));
    }

    public static int atd(int base, int n) {
        int pow=1;
        int sum=0;
        while(n!=0){
            sum+=(n%10)*pow;
            pow*=base;
            n/=10;
        }
        return sum;
    }
}
