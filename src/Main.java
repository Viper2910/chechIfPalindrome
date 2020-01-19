public class Main {
    public static void main(String[] args) {
        //Implement program.
        while (true){
            String input = CheckIfPalindrome.getInputFromUser();
            String reversedInput = CheckIfPalindrome.reverseInputGivenByUser(input);
            boolean checkResult = CheckIfPalindrome.checkIfInputIsPalindrome(input, reversedInput);
            CheckIfPalindrome.giveAnswerToUser(checkResult);
        }
    }
}
