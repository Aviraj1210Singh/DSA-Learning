public class Student {

    String name; // we are going to assign value to this variable using constructor and "this" key word and "." operator
    int age; // we are going to assign value to this variable using constructor and "this" key word and "." operator
    double gpa; // we are going to assign value to this variable using constructor and "this" key word and "." operator
    boolean isEnrolled;

    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }
}
