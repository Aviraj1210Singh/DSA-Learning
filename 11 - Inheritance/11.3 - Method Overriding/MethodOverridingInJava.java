public class MethodOverridingInJava {

    public static void main(String[] args) {
        
        /*
        Method overriding = When a subclass(child class) provides its own
                            implementation of a method that is already defined in superclass(parent class).
                            Allows for reusability and give specific implementations.        
        */ 

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move(); // Here we are using the overriden method
        


    }
    
}
