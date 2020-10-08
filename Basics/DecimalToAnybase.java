import java.util.Scanner;

public class DecimalToAnybase {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int base= scn.nextInt();
        System.out.println(dta(n, base));
    }

    public static int dta(int n, int base) {
        int pow=1;
        int sum=0;
        while(n!=0){
            sum+=(n%base)*pow;
            pow*=10;
            n/=base;
        }
        return sum;
    }
}
