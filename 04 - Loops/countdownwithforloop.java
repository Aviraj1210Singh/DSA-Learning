import java.util.Scanner;

public class countdownwithforloop {

    public static void main(String[] var0) throws InterruptedException{

        //for loop = executes some code a certain amount of times

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        } 

        System.out.println("HAPPY NEW YEAR!");
        
        scanner.close();

    }
    
}
