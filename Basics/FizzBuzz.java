import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any Number: ");
        byte number= scanner.nextByte();
        if(number%3==0 && number%5==0){
            System.out.print("FizzBuzz");
        }
        else if(number%3==0){
            System.out.print("Fizz");
        }
        else if(number%5==0){
            System.out.print("Buzz");
        }
        else System.out.println(number);
    }
}
