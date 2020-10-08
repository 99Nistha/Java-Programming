import java.util.Scanner;

public class logPow {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int t= scn.nextInt();
        while(t-->0){
            long n= scn.nextLong();
            int k= scn.nextInt();
            int ans=0;
            float x=(float)(1.0/k);
            ans= (int) Math.pow(n,x);
            System.out.println(ans);
        }
    }
}
