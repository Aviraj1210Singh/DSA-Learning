public class ArrayOfObjects {
    public static void main(String[] args) {
        
        /*
        one way of creating an Array of objects:-

        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        Car[] cars = {car1, car2, car3};

        */

        // one way of creating an Array of objects:-
        Car[] cars = {new Car("Mustang", "Red"), 
                      new Car("Corvette", "Blue"), 
                      new Car("Charger", "Yellow")};
        /* 
        one way to print output using for loop:-

        for(int i = 0; i < cars.length; i++){
            cars[i].drive();
        }

        */

        // second way to print output using for loop:-

        for(Car car: cars){
            car.drive();
        }

        for(Car car: cars){
            car.color = "black";
        }

        for(Car car: cars){
            car.drive();
        }
    }
}
