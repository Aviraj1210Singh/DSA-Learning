public class usefulinloops {

    public static void main(String[] var0){

        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        int i;
        for(i = 1; i <= 10; i++){
            if(i==5){
                System.out.println();// just change the line 
                break;
            }
            System.out.print(i);
        }


        for(i = 1; i <= 10; i++){
            if(i==5){
                continue;
            }
            System.out.print(i);
        }

    }
    
}
