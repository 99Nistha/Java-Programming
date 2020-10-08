import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        long n= scn.nextLong();
        long[] a= new long[(int) n];
        for(long i=0;i<n;i++){
            a[(int) i]= scn.nextLong();
        }
        long t= scn.nextLong();
        if(binary(a,t)==-1) System.out.print(-1);
        else System.out.print(binary(a,t));
    }
    public static long binary(long[]a, long t){
        long start=0;
        long end=a.length-1;
        long mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(a[(int) mid]>t) end=mid-1;
            else if(a[(int) mid]<t) start=mid+1;
            else return mid;
        }
        return -1;
    }
}
