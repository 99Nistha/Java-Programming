import java.text.NumberFormat;
import java.util.Scanner;

public class Cal {
    public static void main(String[] args){
        final byte MONTH_IN_YEAR=12;
        final byte PERCENTAGE= 100;

        Scanner scanner= new Scanner(System.in);

        int principal;
        while (true){
            System.out.print("Principal($1K-$1M): ");
            principal= scanner.nextInt();
            if(principal>=1000 && principal<=1000000){
                break;
            }
            else{
                System.out.println("Invalid Value Please enter the principal value between 1000 to 1000000");
            }
        }

        float annualInterest;
        while(true){
            System.out.print("Annual Interest rate: ");
            annualInterest= scanner.nextFloat();
            if(annualInterest>0 && annualInterest<=30) break;
            else System.out.println("Invalid Value Please enter the annual interest value more then 0 or less that or equal to 30");
        }

        float monthlyInterest= annualInterest/PERCENTAGE/MONTH_IN_YEAR;

        byte years;
        while(true) {
            System.out.print("Period (Years): ");
            years= scanner.nextByte();
            if (years > 0 && years <= 30) break;
            else
                System.out.println("Invalid Value Please enter the years value more then 0 or less that or equal to 30");
        }

        int numberOfPayments= years*MONTH_IN_YEAR;

        double mortgage= principal*(Math.pow(monthlyInterest+1, numberOfPayments))/(Math.pow(monthlyInterest+1, numberOfPayments)-1);

        String mortgageFormatted= NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Montage: "+ mortgageFormatted);
    }
}
