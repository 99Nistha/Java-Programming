import java.util.Scanner;

public class triplet {
    public static void main(String args[]) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]= scn.nextInt();
        }
        int sum=scn.nextInt();
        sort(a);
        triple(a, sum);
    }
    public static void sort(int[]a){
        int min=0;
        int n=a.length;
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(a[min]>a[j]) min=j;
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
    public static void triple(int[]a, int sum){
        int start=0, end=0, target=0;
        int n=a.length;
        for(int i=0;i<n-1;i++){
            target=sum-a[i];
            start=i+1;
            end=n-1;
            while(start<end){
                if((a[start]+a[end])>target) end--;
                else if((a[start]+a[end])<target) start++;
                else{
                    System.out.println(a[i]+", "+a[start]+" and "+a[end]);
                    start++;
                    end--;
                }
            }
        }
    }
}
