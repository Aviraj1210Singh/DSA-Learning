public class Bike extends Vehicle implements Color {

    @Override
    void go(){
        System.out.println("You ride the bike");
    }

     @Override
    public void myColor(){
        System.out.println("I am blue colored Bike");
    }
    
}
