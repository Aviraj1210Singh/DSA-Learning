import java.util.Scanner;

public class temeratureconvertor {
    public static void main(String[] var0){

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.println("Convert to Celsius or Fehrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();// connecting two different methods using "."

        // (condition) ? true : false
        newTemp = (unit.equals("c")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;
        
        System.out.printf("%.1f\u00B0C%s", newTemp, unit);

        scanner.close();
    }
    
}
