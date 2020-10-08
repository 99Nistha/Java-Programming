import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= scn.nextInt();
        int[] a= new int[n];
        System.out.print("Enter the values in the array: ");
        for(int i=0;i<n;i++){
            a[i]= scn.nextInt();
        }
        System.out.print("Enter the value you want to search: ");
        int val= scn.nextInt();
        int res=linear(a, val);
        if(res!=-1)System.out.print(val+" is present at index "+res);
        else System.out.print("this is not present");
    }
    public static int linear(int[]a, int val){
        int i=0;
        while(i!=a.length){
            if(a[i]==val) break;
            i++;
        }
        if(i!=a.length) return i;
        else return -1;
    }
}
