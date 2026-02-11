import java.util.Scanner; 

public class Enhancedswitch {

    public static void main(String[] var0){

        // Enhanced switch = A replacement to many else if statements
        // (Java14 feature)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It's a weekday.");
            case "Saturday", "Sunday" -> System.out.print("It's a weekend.");
            default -> System.out.println(day + " is not a day.");
        }
        scanner.close();
    }
    
}
