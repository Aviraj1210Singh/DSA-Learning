public class Friend {

    int numOfFriends1;
    static int numOfFriends2; // it belongs to the Class, not to individual objects. 
    String name;

    Friend(String name){
        this.name = name;
        numOfFriends1++;
        numOfFriends2++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends2 + " total friends"); /* 
        here we did not use "this" followed by "." (this.), 
        because numOfFriend2 is a static variable
        */
    }
    
}
