import java.util.Scanner;

public class sortedArray {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the sie=ze of array: ");
        int n= scn.nextInt();
        System.out.print("Enter all the values: ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++) arr[i]= scn.nextInt();
        if(isSorted(arr, 0)) System.out.println("Sorted");
        else System.out.println("Unsorted");
    }
    public static boolean isSorted(int[] a, int v){
        if(v==a.length-1) return true;
        if(a[v]>a[v+1]) return false;
        else return isSorted(a,v+1);
    }
}
