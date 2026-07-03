import java.util.Arrays;

public class introtoarrays {

    public static void main(String[] var0){
        int lengthofarray;

        //defineing an array
        String[] fruits ={"apple", "orange", "coconut", "banana"};

        //printing a value of array
        System.out.println(fruits[1]);

        //changing a value of the array
        fruits[0] = "pineapple";

        //calculating the numbeer of elements or members in the arrary
        lengthofarray = fruits.length;
        System.out.println(lengthofarray);

        //printing all elaments of array using for loop
        for(int i = 0; i < lengthofarray; i++){
            System.out.println(fruits[i]);
        }
        System.out.println("*******************");

        //sorting the elements of array using Arrays.sort(); method 
        Arrays.sort(fruits);
        //printing all elements of array using enhanced for loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        //changing all the elements with a common value using Arrays.fill(); method
        Arrays.fill(fruits, "pineapple");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
    
}
