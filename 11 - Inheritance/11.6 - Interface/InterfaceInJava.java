public class InterfaceInJava {

    public static void main(String[] args){
        
        //Interface = A blueprint for a class that specifies a set of abstract methods
        //            that implementing classes MUST define.
        //            Supports multiple inheritance-like behaiour.
        //            The class uses the "implements" keyword to implement an interface
        /*            A class implementing an interface must implement all its abstract menthods, 
                      unless the class is declared "abstract" */   
        //            An inheritance cannot be instantiated(we cannot create objects directly from an interface)
        //            All interface methods are public and abstract by default (unless declared default, static, or private in newer Java versions).
        //            All variables declared in an interface are public static final by default (i.e, constants).


        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

    }
    
}
