public class overloadedmethods {
    public static void main(String[] var0){

        //overloaded methods = methods that share the same name, but different parameters.
        //                     signature = name + parameters

        int num1 =4, num2 = 5, num3 = 12;
        System.out.println(add(num1, num2));

        System.out.println(add(num1, num2, num3));

    }
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){
        return a + b + c;
    }
}
