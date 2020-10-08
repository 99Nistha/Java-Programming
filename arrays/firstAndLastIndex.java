import java.sql.SQLOutput;
import java.util.Scanner;

public class firstAndLastIndex {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the sie=ze of array: ");
        int n= scn.nextInt();
        System.out.print("Enter all the values: ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++) arr[i]= scn.nextInt();
        System.out.print("Enter the value you want to search: ");
        int val= scn.nextInt();
        System.out.println("first index having value "+ val+" is: "+ firstIndex(arr,0,val));
        System.out.println("last index having value "+ val+" is: "+ lastIndex(arr,0,val));
    }
    public static int firstIndex(int[]a, int index, int val){
        if(index==a.length) return -1;
        if(a[index]==val) return index;
        else return firstIndex(a,index+1,val);
    }
    public static int lastIndex(int[] a, int s, int val){
        if(s==a.length) return -1;
        int index= lastIndex(a,s+1,val);
        if(index==-1){
            if(a[s]==val) return s;
            else return -1;
        }else return index;
    }
}
