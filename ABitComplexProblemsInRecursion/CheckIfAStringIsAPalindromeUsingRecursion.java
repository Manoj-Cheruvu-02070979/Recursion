package ABitComplexProblemsInRecursion;

public class CheckIfAStringIsAPalindromeUsingRecursion {
    private static String word;
    public static boolean isPalindrome(int i){
        if(i >= (word.length())/2){
                return true;
        }
        if(word.charAt(i) != word.charAt(word.length() - i - 1)){
            return false;
        }
        return isPalindrome(i+1);
    }
    public static void main(String[] args) {
        CheckIfAStringIsAPalindromeUsingRecursion palindromeChecker = new CheckIfAStringIsAPalindromeUsingRecursion();
        palindromeChecker.word = "MADAM";
        System.out.println(palindromeChecker.isPalindrome(0));
        palindromeChecker.word = "MADSM";
        System.out.println(palindromeChecker.isPalindrome(0));
    }
}


