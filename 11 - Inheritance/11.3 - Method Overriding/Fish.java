public class Fish extends Animal{

    @Override // the annotation (@Override) tells the the compiler to verify that move() really overrides a parent method 
    void move(){
        // This method overrides the parent method
        System.out.println("This animal is swimming");
    }
        
    
    
}
