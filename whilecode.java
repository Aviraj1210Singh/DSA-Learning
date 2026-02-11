import java.util.Scanner;

public class whilecode {
    public static void main(String[] var0){

        Scanner scanner = new Scanner(System.in);

        String name = "";

        /*
         if(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        
            this if statement will run to next line after we enter just Enter and nothing else(meaning "name" string is still empty but the if condition will pass it if we just pressed Enter), that is why we used while loop because it will run the loop untill we enter a proper name.
        */

         while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
       

        System.out.printf("Hello %s\n", name);

        scanner.close();
    }
    
}
