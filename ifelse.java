import java.util.Scanner;

public class ifelse {

    public static void main(String[] var0){

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter your age ");
    int age = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    // Group a
    if(name.isEmpty())
        System.out.println("You haven't eantered your name.");
    else
        System.out.println("Hello, " + name);



    // Group b

    if (age >= 65){
        System.out.println("You are an senior.");
    }
    else if (age >= 18){
        System.out.println("You are an adult.");
    }
    else if (age < 0){
        System.out.println("You are not born yet.");
    }
    else if(age == 0){
        System.out.println("You are a baby");
    }
    else{
        System.out.println("You are a child.");
    }

    scanner.close();
    }
}
