public class printfstatement {

    public static void main(String[] var0){

        // printf() = is a method used to format output
        //format can look like:- %[flag][width][.precision][specifier-character]

        /*
            Here,
            % - place holder, where actual value of variable comes
            flag - mentioned below
            width - mentioned below
            .precision - we can limit the amount of digits that display after decimal
            specifier-character - this tells the datatype of the variable[c -> char; s -> string; d -> int; f -> float/double; b -> boolean] 
         */

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height); // without .precision
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old.\n", name, age);


        // [flag]
        /*
        + = output a plus
        ( = negetive number are enclosed in ()
         , = comma grouping seperator
         space = display a minus if negetive, space if positive
        */

        double price1 = 99456939.88;
        double price2 = 5699.80;
        double price3 = -4539.01;

        System.out.printf("The length is %,.1f inches\n", price1); // with .precision and flag ','
        System.out.printf("The length is %+.1f inches\n", price2); // with .precision and flag ','
        System.out.printf("The length is %(.1f inches\n", price3); // with .precision and flag '('
        System.out.printf("The lengths are % .1f inches\n", price3); // with .precision and flag ' '

        // [width]
        /*
        0 = zero padding
        number = right justified padding
        negative number = left justified padding
        */ 

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%4d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%10d\n", id4);
    } 
    
}
