import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input="";
        while(!input.equals("quit")){
            System.out.print("value: ");
            input= scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}
