import java.util.Scanner;

public class Compoundinteresrcalculator {

    public static void main(String[] var0){

        //Compound interest calculator
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompounded;
        int year;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the # of times compounded per year: ");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        year = scanner.nextInt();

        // amount = principal((1 + (rate/timeCompounded))^(timeCompounded * years)
        amount = principal * Math.pow(1 + (rate / timeCompounded) , timeCompounded * year);

        System.out.printf("The amount after %d years is: $%f.", year, amount);
        
        scanner.close();

    } 
    
}
