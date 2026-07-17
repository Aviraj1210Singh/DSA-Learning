public class GetterSetterMethods {
    public static void main(String[] args){

        /* Getter & Setter Methods
        - They help protect object data and add rules for accessing or modifying them.
        - GETTERS = Methods that make a private field READABLE.
        - SETTERs = Methods that make a private field WRITEABLE. 
        */ 

        Car car = new Car("Charger", "Yellow", 10000);

        car.setColor("Blue");
        car.setPrice(5000);

        System.out.println(car.getColor() + " " + car.getModel() + " $" + car.getPrice());
    }
    
}
