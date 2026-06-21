import java.util.Scanner;

public class searchinarray {

    public static void main(String[] var0){

        Scanner scanner = new Scanner(System.in);

        int[] number = {1,9,0,5,7,8};
        String[] fruits ={"banana", "apple", "lichi"};
        int target1;
        String target2;
        boolean isFound1 = false;
        boolean isFound2 = false;


        System.out.print("Enter number to search in array: ");
        target1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the fruit to search in the array: ");
        target2 = scanner.nextLine();

        for(int i = 0; i < number.length; i++){
            if(target1 == number[i]){
                System.out.printf("Your number is at index: %d\n", i);
                isFound1 = true;
                break;
            }
        }
        if(!isFound1){
            System.out.println("Number not found in array.");
        }

        for(int j = 0; j < fruits.length; j++){
            if(fruits[j].equals(target2)){
                System.out.printf("Your fruit is at index: %d\n", j);
                isFound2 = true;
                break;
            }
        }
        if(!isFound2){
            System.out.println("Fruit not found in array.");
        }

        scanner.close();
    }
    
}
