import java.util.Scanner;

public class sumZero {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int t= scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[] a= new int[n];
            for(int i=0;i<n;i++) a[i]=scn.nextInt();
            if(zero(a,0,0,0)) System.out.println("Yes");
            else System.out.println("No");
        }
    }

    public static boolean zero(int[]a,int si, int sum, int count) {
        if(si==a.length){
            if(sum==0 && count>0) return true;
            else return false;
        }
        return zero(a,si+1,sum+a[si],count+1)|| zero(a,si+1,sum,count);
    }
}