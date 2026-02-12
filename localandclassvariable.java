public class localandclassvariable {

    int x = 3; // CLASS variable
    public static void main(String[] var0){

        int x = 1; // LOCAL varibles, i.e. it is defined inside a method.
        
        System.out.println(x);
        // LOCAL variable > CLASS variable
        doSomething();
    }

    static void doSomething(){
        int x = 2; // LOCAL variable
        System.out.println(x);
    }
    
}
