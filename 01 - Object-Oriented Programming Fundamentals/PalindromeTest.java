import java.util.Scanner;
class PalindromeChecker{
    private String text;
    public PalindromeChecker(String text){
        this.text = text;
    }
    public boolean isPalindrome(){
        int left = 0, right = text.length() - 1;
        while (left < right){
            if (text.charAt(left) != text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public void displayResult(){
        if (isPalindrome()){
            System.out.println("The text \"" + text + "\" is a plaindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }
}
public class PalindromeTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        PalindromeChecker checker = new PalindromeChecker(inputText);
        checker.displayResult();
        scanner.close();
    }
}
