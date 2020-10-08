import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayOps {
    static Scanner scn= new Scanner(System.in);
    public static void main(String[] args) {
        int[] array= takeArray();
        display(array);
        System.out.print("Maximum value in our array is= "+ MaxVal(array));
    }

    public static int[] takeArray() {
        System.out.print("Size ?= ");
        int n= scn.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the value at "+i+"th index= ");
            arr[i]= scn.nextInt();
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void display(int[] arr) {
        System.out.println("Displaying the array= ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static int MaxVal(int[] arr){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
}
