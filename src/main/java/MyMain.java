import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int counterABC = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || (str.charAt(i) == 'b') || (str.charAt(i) == 'c')) {
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
        if (y == -1 && x == -1) {
            System.out.println("Your statement didn't contain THE");
            return false;
        }
        else {
            System.out.println("Your statement did contain THE");
            return true;

            }

        }




    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        int len = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(len)) {
                len = len - 1;
                if (len == 0) {
                    System.out.println("This is a palindrome");
                }
            } else {
                System.out.println("This is not a palindrome");
                break;
            }
        }

        return false;

    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word please: ");
        String str = scan.nextLine();

        System.out.println(countABC(str));
        System.out.println(containsThe(str));
        System.out.println(isPalindrome(str));


    }
}
