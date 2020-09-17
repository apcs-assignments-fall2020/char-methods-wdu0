import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (ch >= 65 && ch <= 90) {
            int de = ch;
            de += 32;
            char lower = (char) (de);
            return lower;
        }
        else {
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char ch1 = toLower(ch);
            result += ch1;
        }
        return result;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (ch >= 97 && ch <= 122) {
            int de = ch;
            de -= 32;
            char upper = (char) (de);
            return upper;
        }
        else {
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char ch1 = toUpper(ch);
            result += ch1;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String input = scan.next();

        System.out.println("What would you like to make your string lowercase or uppercase?");
        String input2 = scan.next();
        String lower = "lowercase";
        String upper = "uppercase";

        if (lower.equals(input2)) {
            System.out.println("Here is your string in lowercase: " + myToLowerCase(input));
        } else if (upper.equals(input2)) {
            System.out.println("Here is your string in uppercase: " + myToUpperCase(input));
        }
        scan.close();
    }
}
