import java.util.Scanner;

public class recusionPattern {
    public static void main(String[] args) {
        Scanner scn=  new Scanner(System.in);
        int n=scn.nextInt();
        pattern(n,1,1);
    }
    public static void pattern(int n, int row, int col){
        if(row>n) return;
        if(col>row){
            System.out.println();
            pattern(n,row+1,1);
            return;
        }
        System.out.print("*");
        pattern(n, row, col+1);
    }
}
