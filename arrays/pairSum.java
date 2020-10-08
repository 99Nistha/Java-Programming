import java.util.Scanner;

public class pairSum {
    public static void main(String args[]) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]= scn.nextInt();
        }
        int t= scn.nextInt();
        sort(a);
        int start=0;
        int end= n-1;
        while(start<end){
            if((a[start]+a[end])>t) end--;
            else if((a[start]+a[end])<t) start++;
            else{
                System.out.println((start+1)+" and "+ (end+1));
                start++;
                end--;
            }
        }
    }
    public static void sort(int[] arr){
        int n= arr.length;
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
}
