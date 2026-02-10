public class Stringmethods {

    public static void main(String[] var0){

        String name = "Aviraj";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("r");
        int lastIndex = name.lastIndexOf("a");

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("a", "e");

        if(name.isEmpty())
            System.out.print("Please enter a name.");

        if(name.contains(" "))
            System.out.print("Your name has space in it.");

        if(name.equalsIgnoreCase("password")) 
            System.out.print("Your name cannot be password.");



    }
    
}
