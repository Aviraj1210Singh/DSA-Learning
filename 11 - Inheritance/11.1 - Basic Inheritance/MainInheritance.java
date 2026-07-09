public class MainInheritance {
    public static void main(String[] args) {
        
        /*
        Inheritance = One class inherits the attributes and methods from another class.
                      Child <- Parent <- Grandparent
        */

        /*
        Inheritance tree of this example:-

                            Organism                         (Grandparent)
                            /      \
                           /        \
                          /          \
                        Plant      Animal                    (Parents)
                                   /    \
                                  /      \
                                 /        \
                               Dog        Cat                (Grandchilds/ Child)
        */
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();
 
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

        plant.photosynthesizee();

    } 
    
}
