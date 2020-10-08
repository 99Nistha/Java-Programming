import java.sql.SQLOutput;
import java.util.Scanner;

public class UpperAndLower {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= scn.nextInt();
        int[] a= new int[n];
        System.out.print("Enter the values in the array: ");
        for(int i=0;i<n;i++){
            a[i]= scn.nextInt();
        }
        System.out.print("Enter the value of which you would like to find upper and lower bound: ");
        int val= scn.nextInt();
        if(Lower(a,val)!=-1) {
            System.out.println("Lower Bound of " + val + " is= " + Lower(a, val));
            System.out.println("Upper Bound of " + val + " is= " + Upper(a, val));
        }else System.out.print("value doesn't exist");
    }
    public static int Upper(int[]a, int val){
        int n= a.length;
        int s=0;
        int e=n-1;
        int mid;
        int res=-1;
        while(s<=e){
            mid=(s+e)/2;
            if(a[mid]>val) e=mid-1;
            else if(a[mid]<val) s= mid+1;
            else{
                res=mid;
                s=mid+1;
            }
        }
        return res;
    }
    public static int Lower(int[]a, int val){
        int n= a.length;
        int s=0;
        int e=n-1;
        int mid;
        int res=-1;
        while(s<=e){
            mid=(s+e)/2;
            if(a[mid]>val) e=mid-1;
            else if(a[mid]<val) s= mid+1;
            else{
                res=mid;
                e=mid-1;
            }
        }
        return res;
    }
}
