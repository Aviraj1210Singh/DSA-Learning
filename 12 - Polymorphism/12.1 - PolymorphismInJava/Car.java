public class Car extends Vehicle implements Color{

    @Override
    void go(){
        System.out.println("You drive the car");
    }

    @Override
    public void myColor(){
        System.out.println("I am red colored Car");
    }
    
}
