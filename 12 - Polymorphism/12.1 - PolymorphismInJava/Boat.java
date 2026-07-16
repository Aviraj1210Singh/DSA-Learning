public class Boat extends Vehicle implements Color {

    @Override
    void go(){
        System.out.println("You sail the boat");
    }

     @Override
    public void myColor(){
        System.out.println("I am white colored Boat");
    }
    
}
