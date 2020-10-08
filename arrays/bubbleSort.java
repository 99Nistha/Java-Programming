import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the sie=ze of array: ");
        int n= scn.nextInt();
        System.out.print("Enter all the values: ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++) arr[i]= scn.nextInt();
        bubble(arr, 0, arr.length-1);
        System.out.print("Sorted array is: ");
        display(arr);
    }

    public static void bubble(int[]a, int l, int r) {
        if(r==0) return;
        if(l==r) {
            bubble(a, 0, r - 1);
            return;
        }
        if(a[l]>a[l+1]){
            int temp=a[l+1];
            a[l+1]=a[l];
            a[l]= temp;
        }
        bubble(a,l+1,r);
    }

    public static void display(int[] a) {
        for(int i=0;i<a.length;i++) System.out.print(a[i]+ " ");
    }
}
