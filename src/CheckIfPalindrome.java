import java.util.Scanner;

public class CheckIfPalindrome{

    // Take input from user.
    public static String getInputFromUser(){

        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to check if it is a palindrome: \n");
        input = scanner.nextLine();

        return input;
    }

    //Reverse input given bu user.
    public static String reverseInputGivenByUser(String input){
        StringBuilder reversedInput = new StringBuilder();

        for (int i = input.length()-1; i >= 0; i--){
            reversedInput.append(input.charAt(i));
        }

        return reversedInput.toString();
    }



}