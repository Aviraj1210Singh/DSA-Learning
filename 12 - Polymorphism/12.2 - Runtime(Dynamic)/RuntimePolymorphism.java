import java.util.Scanner;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        
        /* Runtime Polymorphism - Runtime Polymorphism is also called Dynamic Polymorphism or Method Overriding.
                                - When the method that gets executed is decided at runtime based on the actual 
                                  type of the object.
                                - A superclass (or interface) reference can refer to objects of different subclasses.
                                - When an overridden method is called through the reference, Java automatically invokes
                                  the appropriate method of the actual object. This process is called 
                                  "Dynamic Method Dispatch"
        
        */

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }

        scanner.close();

    }
    
}
