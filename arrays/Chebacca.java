import java.util.Scanner;

public class Chebacca {
    public static void main(String[] args) {
        // Your Code Here
        Scanner scn= new Scanner(System.in);
        long n= scn.nextLong();
        long sum=0;
        long base=1;
        while(n!=0){
            long r=n%10;
            if(r>=5){
                if(r == 9 && (n/10) == 0){
                }
                else r=9-r;
            }
            sum+=r*base;
            base*=10;
            n/=10;
        }
        System.out.print(sum);
    }
}


