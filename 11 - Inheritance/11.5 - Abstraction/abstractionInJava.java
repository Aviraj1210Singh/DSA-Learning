public class abstractionInJava {
    public static void main(String[] args){

        // abstract = It is a keword used to define abstract classes and method
        //            Abstraction is the process of hiding implementation details and showing only the essential features;
        //            Abstract classes CAN'T be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented or overridden in the child classes)
        //            Can contain 'concrete' methods (which are inherited)

        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(3, 4);
        Rectangle rectangle = new Rectangle(4, 5);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());


    }
    
}
