import java.util.Scanner;

public class SizeofArray {

    public static void main(String[] var0){

        Scanner scanner = new Scanner(System.in);
        int size;

        String[] foods;//array with no specific size. It is different from "String[] foods = {};" which has a size of 0.

        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size]; //assigning the size of the array

        for(int i = 0; i<size; i++){
            System.out.print("Enter the food item: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }
        scanner.close();
    }
    
}
