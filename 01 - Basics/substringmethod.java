import java.util.Scanner;

public class substringmethod {
    public static void main(String[] var0){
        // .substring() = A method used to extract a portion of a string
        // .substring(strating index, ending index); if the ending index is the last index of the sting then we can just avoide entering it.
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            System.out.printf("Your username is %s.\n", username);
            System.out.printf("Your domain is %s.\n", domain);
        }
        else{
            System.out.print("Please enter correct email.");
        }
        scanner.close();
    }
}
