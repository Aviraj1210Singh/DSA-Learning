public class twoDArrays {

    public static void main(String[] var0){
        // 2D array : An array where each element is an array
        //            Usful for storing the matrix of data 

        /*
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetable = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "egg", "fish"};

        String[][] groceries = {fruits, vegetable, meats};
        */

        String[][] groceries = {{"apple", "orange", "banana"}, {"potato", "onion", "carrot"}, {"chicken", "pork", "egg", "fish"}};

        groceries[0][2] = "watermelon";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
    
}
