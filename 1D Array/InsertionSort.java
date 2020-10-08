import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= scn.nextInt();
        int[] a= new int[n];
        System.out.print("Enter the values in the array: ");
        for(int i=0;i<n;i++){
            a[i]= scn.nextInt();
        }

        insertion(a);
        System.out.print("Sorted array is : ");
        display(a);
    }
    public static void insertion(int[] arr){
        int n=arr.length;
        int val=0;
        for(int i=0;i<n-1;i++){
            val=arr[i+1];
            int j;
            for(j=i;j>=0;j--){
                if(val<arr[j])arr[j+1]=arr[j];
                else break;
            }
            arr[j+1]=val;
        }
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
