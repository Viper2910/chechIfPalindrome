import java.util.Scanner;

public class CheckIfPalindrome{

    // Take input from user
    public String getInputFromUser(){

        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to check if it is a palindrome: \n");
        input = scanner.nextLine();

        return input;
    }

    

}