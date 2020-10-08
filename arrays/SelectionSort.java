import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= scn.nextInt();
        int[] a= new int[n];
        System.out.print("Enter the values in the array: ");
        for(int i=0;i<n;i++){
            a[i]= scn.nextInt();
        }

        selection(a);
        System.out.print("Sorted array is : ");
        display(a);
    }
    public static void selection(int[] arr){
        int n=arr.length;
        int min=0;
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]) min=j;
            }
            int temp=arr[min];
            arr[min]= arr[i];
            arr[i]= temp;
        }
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
