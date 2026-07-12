public class superKewwordinJava {

    public static void main(String[] var0) {
        
        //super = Refers to the parent class (subclass <- superclass)
        //        Used in constructors and method overriding
        //        Calls the parent constructor to initialize attributes
        
        /*

        - In Java we use "super" keyword in child class to take the 
        values in the child's constructor and then send those values 
        to the parent class's constructor.

        - In other words:- When a child class extends a parent class, 
        the child constructor can receive values from the caller and 
        pass some (or all) of those values to the parent class's constructor 
        using super(...).

        - In other words:- "super" keyword is used to call parent class's 
        constructor from child class's constructor.

        */

        Person person = new Person("Harry", "Potter");
        Student student = new Student("Tom", "Riddle", 3.25);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);

        person.showName(); 
        student.showName();
        student.showGPA();
        employee.showName();
        employee.showSalary();

    }
    
}
