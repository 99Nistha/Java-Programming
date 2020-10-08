import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int x= scn.nextInt();
        int n= scn.nextInt();
        System.out.println(pow(x,n));
    }
    public static int pow(int x, int n){
        if(n==0) return 1;
        return x*pow(x,n-1);
    }
}
