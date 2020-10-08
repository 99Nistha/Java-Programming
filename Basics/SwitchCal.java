import java.util.Scanner;

public class SwitchCal {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        char ch= scn.next().charAt(0);
        int n1, n2;
        System.out.println();
        while(ch!='X'&& ch!='x'){
            switch(ch) {
                case '+':
                    n1 = scn.nextInt();
                    n2 = scn.nextInt();
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    n1 = scn.nextInt();
                    n2 = scn.nextInt();
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    n1 = scn.nextInt();
                    n2 = scn.nextInt();
                    System.out.println(n1 * n2);
                    break;
                case '/':
                    n1 = scn.nextInt();
                    n2 = scn.nextInt();
                    System.out.println(n1 / n2);
                    break;
                case '%':
                    n1 = scn.nextInt();
                    n2 = scn.nextInt();
                    System.out.println(n1 % n2);
                    break;
                default:
                    System.out.println("Invalid operation. Try again.");
                    break;
            }
            ch= scn.next().charAt(0);
        }
    }
}
