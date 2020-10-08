import java.util.Scanner;

public class allIndex {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the sie=ze of array: ");
        int n= scn.nextInt();
        System.out.print("Enter all the values: ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++) arr[i]= scn.nextInt();
        System.out.print("Enter the value you want to search all index: ");
        int val= scn.nextInt();
        int[] d= index(arr,0 , val,0);
        display(d);
    }

    public static int[] index(int[] a, int si, int val, int count) {
        if(si==a.length) {
            int[] base = new int[count];
            return base;
        }
        int[] in=null;
        if(a[si]==val) in= index(a,si+1, val, count+1);
        else in= index(a,si+1, val, count);
        if(a[si]==val) in[count]=si;
        return in;
    }
    public static void display(int[] a) {
        for(int i=0;i<a.length;i++) System.out.print(a[i]+ " ");
    }
}
