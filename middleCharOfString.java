package class12.Homework;

public class middleCharOfString {
    public static void main(String[] args) {
        /*
        Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
For Example String str=hello =>l
         */

        String word = "car";

       // for (int i = 1; i < word.length(); i++) {
            if (!word.isEmpty() && word.length() % 2 != 0 && word.length()>=3) {
                System.out.println(word.charAt(1));
            }
        }
    }


