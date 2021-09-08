import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int counterABC = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf("a") != -1) {
                counterABC = counterABC + 1;
            }
            else if (str.indexOf("c") != -1) {
                counterABC = counterABC + 1;
            }
            else if (str.indexOf("b") != -1); {
                counterABC = counterABC + 1;
            }

        }
        System.out.println("There were " + counterABC + " A's, B's, and C's");
        return -1;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        int y = str.indexOf("The");
        int x = str.indexOf("the");
        if (y == -1 || x == -1) {
            return false;
        }
        else {
            return true;
            }

        }




    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i).equals(str.charAt(len))) {
                len = len - 1;
                if (len = 0) {
                    return true;
                }
            }
            else {
                return false;
            }


    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // YOUR CODE HERE
    }
}
