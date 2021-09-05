package Palindrome;

import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        String testString = "abbba";
        System.out.println("Is \"" + testString + "\" a palindrome: " + isPalindromeStack(testString));
        System.out.println("Is \"" + testString + "\" a palindrome: " + isPalindromeForLoop(testString));

        String[] listOfPalindrome = {"abba", "adda", "a", ""};
        System.out.println("The list is a Palindrome: " + isListOfWordsPalindrome(listOfPalindrome));
    }

    public static boolean isPalindromeStack(String testPalindrome) {
        char[] characters = testPalindrome.toCharArray();
        Stack stack = new Stack();

        for(int i = 0; i < characters.length; i++) {
            stack.push(characters[i]);
        }

        for (int i = 0; i < characters.length; i++) {
            char character = (char)stack.pop();
            int testCharacter = Character.valueOf(character).compareTo(characters[i]);
            if(testCharacter !=0 ) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeForLoop(String testPalindrome) {

        char[]  characters = testPalindrome.toCharArray();
        int endIndex = characters.length - 1;
        for(int i = 0; i < characters.length; i++) {
            String sFrontCharacter = String.valueOf(characters[i]);
            String sEndCharacter = String.valueOf(characters[endIndex]);

            if(!sFrontCharacter.equalsIgnoreCase(sEndCharacter)) {
                return false;
            }
            endIndex = endIndex - 1;
        }
        return true;
    }

    public static boolean isListOfWordsPalindrome(String[] testListPalindrome) {
        boolean isWordsInListPalindrome = true;
        boolean isWordPalindrome = true;
        if(testListPalindrome.length == 0) {
            System.out.println("List is empty");
            return false;
        }
        for(int i=0; i < testListPalindrome.length; i++) {

            String sTestPalindrome = testListPalindrome[i];


            char[] characters = sTestPalindrome.toCharArray();

            if(sTestPalindrome.equals("")) {
                isWordsInListPalindrome = false;
                isWordPalindrome = false;
                System.out.println("Word is empty");
            } else if(characters.length == 1) {
                System.out.println(sTestPalindrome + " is a Palindrome");
                isWordsInListPalindrome = true;
                isWordPalindrome = true;
            } else {
                int endIndex = characters.length - 1;
                for (int j = 0; j < characters.length; j++) {
                    String frontCharacter = String.valueOf(characters[j]);
                    String endCharacter = String.valueOf(characters[endIndex]);
                    if (!frontCharacter.equalsIgnoreCase(endCharacter)) {
                        isWordsInListPalindrome = false;
                        isWordPalindrome = false;
                    }
                    endIndex = endIndex - 1;
                }
                if (isWordPalindrome) {
                    System.out.println(sTestPalindrome + " is a Palindrome");
                } else {
                    System.out.println(sTestPalindrome + " is Not a Palindrome");
                }
            }
        }
        return isWordsInListPalindrome;
    }

}
