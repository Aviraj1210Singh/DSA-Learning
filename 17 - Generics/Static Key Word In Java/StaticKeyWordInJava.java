public class StaticKeyWordInJava {
    public static void main(String[] args) {
        
        //static = Makes a variabla or method belong to the class
        //         rather than to any specific object.
        //         Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");

        System.out.println("Frinend1: (non static count)" + friend1.numOfFriends1);
        System.out.println("Frinend1: (static count)" + friend1.numOfFriends2);

        System.out.println("Frinend2: (non static count)" + friend2.numOfFriends1);
        System.out.println("Frinend2: (static count)" + friend2.numOfFriends2);

        System.out.println("Frinend3: (non static count)" + friend2.numOfFriends1);
        System.out.println("Frinend3: (static count)" + friend2.numOfFriends2);

        /*
        Note:-
        - when accassing a static variable or calling 
        a static method it's actually best to
        do so through Class itself rather than any 
        object created from that class. 
        
        - It is best practice to use Class name while
        accessing a static member for clarity for 
        other developers. So that other developers 
        can easily understand that it is an static 
        variable. 
        */
         System.out.println(Friend.numOfFriends2);
         Friend.showFriends();

         /*
         Another place we see stataic members is throught
         Math class.
         */
        //Example:-
        System.out.println(Math.round(3.99));
    }
    
}
