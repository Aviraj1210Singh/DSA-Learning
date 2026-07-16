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


    * In inheritance, when a child object is created, Java automatically invokes constructors from the top of the inheritance hierarchy down to the child.
    *Constructor execution order:
        - Grandparent -> Parent -> Child
    */
        Dog dog = new Dog(); // constructors of Organism Class(Grand parent), Animal Class(Parent), & Dog class will automatically be called here, respectively. 
        Cat cat = new Cat(); // constructors of Organism Class(Grand parent), Animal Class(Parent), & Cat class will automatically be called here, respectively. 
        Plant plant = new Plant(); // constructors of Organism Class(Parent), & Plant Class will automatically be called here, respectively. 
 
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
