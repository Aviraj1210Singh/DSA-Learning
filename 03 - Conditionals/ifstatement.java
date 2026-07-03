import java.util.Scanner;

public class ifstatement {

    public static void main(String[] var0){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("Are you above 65 years of age (true/false): ");
        boolean isSenior = scanner.nextBoolean();
        
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.print("You get a senior discount of 20%");
                System.out.print("You get a student discount of 10%");
                price *= 0.7;
            }
            else{
                System.out.print("You get a student discount of 10%");
                price *= 0.9;
            }
        }
        else{
            if(isSenior){
                System.out.print("You get a senior discount of 20%");
                price *= 0.8;
            }
            else{
                System.out.print("You are not a student and not a senior.");
                price *= 1.0;
            }
        }
        System.out.printf("Your ticket is %.2f.", price);

    }
    
}
