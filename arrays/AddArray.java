import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n1= scn.nextInt();
        int[] a1= new int[n1];
        for(int i=0;i<n1;i++) a1[i]= scn.nextInt();
        int n2= scn.nextInt();
        int[] a2= new int[n2];
        for(int i=0;i<n2;i++) a2[i]= scn.nextInt();
        int n=(n1>n2)? n1:n2;
        int c=n;
        int sum=0;
        int carry=0;
        int base=1;
        int x=0;
        int a=0,b=0;
        while(n-->0){
            if(n1-1>=0)a= a1[n1-1];
            else a=0;
            if(n2-1>=0) b= a2[n2-1];
            else b=0;
            x=a+b+carry;
            if(x>9){
                x%=10;
                carry=1;
            }else carry=0;
            sum+=x*base;
            base*=10;
            n1--;
            n2--;
        }
        if(carry==1){
            sum+=base;
            c++;
        }
        base=1;
        while(c--!=1){
            base*=10;
        }
        while(base!=0){
            System.out.print(sum/base+", ");
            sum%=base;
            base/=10;
        }
        System.out.print("END");
    }
}
