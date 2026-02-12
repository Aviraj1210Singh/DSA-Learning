import java.util.Scanner;

public class methodapplications {
    public static void main(String[] var0){

        // method = a block of reusable code that is executed when called ()

        Scanner scanner = new Scanner(System.in);

        String name = "Mojojojo";
        happyBirthday(name, 12);

        System.out.println(square(5));

        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Your full name: " +fullName(firstName, lastName));

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if(ageCheck(age)){
            System.out.println("You are adult.");
        }
        else{
           System.out.println("You are not an adult."); 
        }

        scanner.close();
    }
    static void happyBirthday(String birthdayperson, int yearsold){
        System.out.printf("Happy Birthday Dear %s.\n", birthdayperson);
        System.out.printf("You become %d years old. \n", yearsold);
    
    }    
    static double square(int a){return a*a;}
    static String fullName(String firstName, String lastName){return firstName + " " + lastName;}
    static boolean ageCheck(int age){
       /* 
       if(age >= 18){
            return true;
        }
        else{
            return false;
        }
       */ 
      return age >= 18 ; 
    }
}
