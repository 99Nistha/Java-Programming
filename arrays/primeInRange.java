import java.util.*;
public class primeInRange {
    public static void main(String args[]) {
        Scanner scn= new Scanner(System.in);
        int t= scn.nextInt();
        while(t-->0){
            int a=scn.nextInt(), b=scn.nextInt();
            int[] primes= new int[b+1];
            primes[0]=0;
            primes[1]=0;
            for(int i=2;i<=b;i++){
                if(i%2==0 || i<a) primes[i]=0;
                else primes[i]=1;
            }
            if(a<=2) primes[2]=1;
            for(int i=3;i<=b;i+=2){
                int j=2;
                while(i*j<=b){
                    primes[i*j]=0;
                    j++;
                }
            }
            int count=0;
            for(int i=2;i<=b;i++){
                if(primes[i]==1) count++;
            }
            System.out.println(count);
        }
    }
}