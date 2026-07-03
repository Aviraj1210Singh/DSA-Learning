import java.util.Scanner; // we need to import this because only after this we can use Scanner constructer to take inputs.

public class InputValues {

    public static void main(String[] var0){


        /*
        Think of it like this. 
        Scanner is defining the datatype of variable 'scanner'. 
        Then the scanner variable is getting a task assigned, instead of value like for normal variables, 
        to do what the constructer on right hand side is doing. 
        Then we have 'new Scanner()' on right hand side, 
        this is the function that performs task of taking input from different channels. 
        Then we specified the input channel by writing 'System.in', which points to inputs from keyboard, in the brackets of 'Scanner()'. 
        Then we just finished the command by typing ';' in the end. 
        
        Q. Can we type something else in place of 'System.in', 
        say for taking input from some other source like a microphone? 
        A. Yes! Scanner can read from different sources:
            - From keyboard
            Scanner scanner = new Scanner(System.in);

            - From a file
            Scanner scanner = new Scanner(new File("data.txt"));

            - From a String
            Scanner scanner = new Scanner("Hello World");
            However, for microphone audio, you'd need different tools 
            (like Java Sound API), not Scanner. 
            Scanner only reads text-based input. 

        Q. Can we write "Scanner name = Scanner(System.in).nextLine();" instead of writing "String name = scanner.nextLine();"?
        A. This works, but it's not recommended because:
            - You can't reuse the Scanner for multiple inputs.
            - You can't close the Scanner properly.
            - It creates a new Scanner every time (wasteful).
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Very Important Note: this is done because we are taking an string input after integer so the next string takes "Enter" pressed after entering the integer value as a string. And this line stops from that happening by reading that "Enter" as input for itself.
        // we need to add this this line when we are taking input as string after taken inputs as integer or double. 

        System.out.print("Enter your favorite color ");
        String color = scanner.nextLine();

        System.out.print("What is your GPA:");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false):");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("You are " + age + " years old.");
        System.out.println("You link color " + color + ".");


        if(isStudent)
            System.out.println("You are a student.");
        else
            System.out.println("You are not student.");


        if(gpa > 80)
            System.out.println("You are pass.");
        else
            System.out.println("You are not pass.");
        


        scanner.close();

    }
    
}
