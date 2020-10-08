import java.util.Scanner;

public class QuickSory {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++) arr[i]= scn.nextInt();
        quick(arr,0,n-1);
        for(int i=0;i<n;i++) System.out.print(arr[i]+", ");
    }

    public static void quick(int[]arr, int low, int high) {
        if(low<high){
            int pi= partition(arr, low, high);
            quick(arr, low, pi-1);
            quick(arr, pi+1, high);
        }
    }

    public static int partition(int[]arr, int low, int high) {
        int pivot= arr[high];
        int i=(low-1);
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
}

