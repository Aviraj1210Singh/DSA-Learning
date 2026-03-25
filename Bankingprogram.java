import java.util.Scanner;

public class Bankingprogram {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] var0){

        double balance=0;
        boolean run = true;

        while(run){

        System.out.println("*******************");
        System.out.println("Welcome to ABC Bank");
        System.out.println("*******************");

         //Welcome note and menu
        System.out.println("Select an option from below mentioned list.");
        System.out.println("1. Balance Check");
        System.out.println("2. Deposite");
        System.out.println("3. Withdrow");
        System.out.println("4. Exit");

        //User selects one ooption
        System.out.print("Enter your preference (1-4): ");
        int process = scanner.nextInt();

        switch(process){
            case 1 -> balance(balance);
            case 2 -> balance += deposite();
            case 3 -> balance -= withdrow(balance);
            case 4 -> run = false;
            default -> System.out.println("Enter valid option");
        }

        System.out.println("********************************");
        System.out.println("Thanks for banking woth ABC Bank");
        System.out.println("********************************");
        }



        //Exit
    }

        //Balance check
     static void balance(double balance){
        System.out.printf("$%.2f \n", balance);
     }

        //Deposite
     static double deposite(){
        boolean run=true;
        double deposite = 0;
        while(run){
        System.out.print("Enter the amount you want to deposite: ");
        deposite = scanner.nextDouble();

        if(deposite < 0){
            System.out.println("Enter valid amount");
        }
        else{
             run = false;
        }    
        }
        return deposite;
     }

        //Withdrow
     static double withdrow(Double balance){
        boolean run=true;
        double withdrowAmt = 0;

        while(run){

            System.out.println("Enter the amount you want to withdrow: ");
            withdrowAmt=scanner.nextDouble();

            if(withdrowAmt < 0){
                System.out.println("Enter valid amount");
            }
            else if(withdrowAmt > balance){
                System.out.println("You do not have enough balance");
            }
            else{
                run = false;
            }

        }
        return withdrowAmt;
     }
    
}
