import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        int[][]a= takeInput();
        display(a);
    }
    public static int[][] takeInput(){
        System.out.print("Enter the number of rows: ");
        Scanner scn= new Scanner(System.in);
        int row= scn.nextInt();
        int[][] arr= new int[row][];
        for(int i=0;i<row;i++){
            System.out.print("number of elements you want to enter in row "+i+" :");
            int col= scn.nextInt();
            arr[i]= new int[col];
            for(int j=0;j<col;j++){
                System.out.print("Enter value at row "+i+" and col "+j+" :");
                arr[i][j]= scn.nextInt();
            }
        }
        return arr;
    }
    public static void display(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
