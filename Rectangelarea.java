import java.util.Scanner; // we need to import this because only after this we can use Scanner constructer to take inputs.

public class Rectangelarea {

     public static void main(String[] var0){

        double weidth=0.0;
        double height=0;
        double area=0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter weidth of the rectangle:(in cm) ");
        weidth = scanner.nextDouble();

        System.out.print("Enter height of the rectangle:(in cm) ");
        height = scanner.nextDouble();

        area = weidth*height;
        
        System.out.println("Are of you rectangel: " + area + "cm\u00B2"); // the \u00B2 here is called unicode to print 2 in the raised power. Similarly we can write \u00B3 for 3 and so on. 
        
        scanner.close();

     }
}