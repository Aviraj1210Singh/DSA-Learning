public class PolymorphismInJava {
    public static void main(String[] args){

        // Polymorphism = "POLY" = "MANY"
        /*               - "MORPH" = "SHAPE"
                         - Objects, of different classes, 
                           can be treated as objects of a common superclass.
                         - We need to define a reference variable of 
                           superclass/interface type. 
                         - Polymorphism allows one reference variable to refer 
                           to objects of different classes, provided they share a 
                           common superclass or implement the same interface.
        */                

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        // Now we want to put these objects of different classes in a single array.
        // For this we are going to crete an array of reference of parent class / interface

        Vehicle[] vehicles = {car, bike, boat}; // example of polymorphism, 
        // here "vehicles[]" is a reference array variable of the superclass

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
        
    }
}
