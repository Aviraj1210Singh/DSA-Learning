public abstract class Shape {

    // this class is abstract that means we can not create it's objects

    abstract double area(); // this is an ABSTRACT method, that means it must be defined/ overriden in the child classes

    void display(){ // This is a CONCRETE method
        System.out.println("THis ia a shape");
    }
}
