import java.util.Scanner;

public class BuubleSort {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= scn.nextInt();
        int[] a= new int[n];
        System.out.print("Enter the values in the array: ");
        for(int i=0;i<n;i++){
            a[i]= scn.nextInt();
        }

        bubble(a);
        System.out.print("Sorted arrayis : ");
        display(a);
    }
    public static void bubble(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
