public class VariableArgument {
    public static void main(String[] var0){
        /* vararg(Variable Arguments) : allows a method to accept varying number of arguments, makes methods more flexible,
                                        no need for overloaded methods java will pack the arguments into an array. 
                                        ... (ellipsis)
         */
        
        System.out.println(add(9,5,8,9,111));
        
    }
    /* overloaded methods:- 
    static int add( int a, int b){ return a+b; }
    static int add( int a, int b, int c){ return a+b+c; }
    static int add( int a, int b, int c, int d){ return a+b+c+d; }
    */

    static int add(int... numbers){
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }
        return sum;
    }


   
}
