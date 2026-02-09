import java.util.Scanner;

public class ifelse {

    public static void main(String[] var0){

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter your age ");
    int age = scanner.nextInt();

    if (age >= 18){
        System.out.println("You are an adult");
    }
    else if (age < 0){
        System.out.println("You are not born yet.");
    }
    else{
        System.out.println("You are a child");
    }

    scanner.close();
    }
}
