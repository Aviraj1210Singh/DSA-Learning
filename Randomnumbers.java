import java.util.Random;

public class Randomnumbers{
    public static void main(String[] var0){

        Random random = new Random();

        //fliping 3 dice
        int dice1 = random.nextInt(1, 7);// in this statement first number, i.e 1, is included in the random number pool and the later number, i.e. 7, is excluded.
        int dice2 = random.nextInt(1, 7);
        int dice3 = random.nextInt(1, 7);

        System.out.println(dice1);
        System.out.println(dice2);
        System.out.println(dice3);

        //Coin toss
        boolean isHeads;

        isHeads = random.nextBoolean();// it's random pool is true and false 
        
        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }

        //Random number between 0 and 1
        double number;
        number = random.nextDouble();// this is bounded between 0 and 1, i.e. 0<number<1
        System.out.println(number);

    }
    
}
