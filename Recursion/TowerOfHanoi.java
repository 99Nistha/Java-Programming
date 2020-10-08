import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        towerOfHanoi(n,"T1", "T2", "T3");
        System.out.println((int)Math.pow(2,n)-1);

    }
    public static void towerOfHanoi(int n,String src, String des, String help){
        if(n==1){
            System.out.println("Move 1th disc from "+src+" to "+des);
            return;
        }
        towerOfHanoi(n-1, src,help, des);
        System.out.println("Move "+n+"th disc from "+src+" to "+des);
        towerOfHanoi(n-1,help,des,src);
    }
}
