import java.util.Scanner;

public class faraToCel {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int f= scn.nextInt();
        int c= (int)((5.0/9.0)*(f-32));
        System.out.println(c);
    }
}
