/*One away: There are three types of edits that can be perfomed on strings: 
    insert a character, 
    remove a character, 
    or replace a character. 
    Given two strings, write a function to check if they are one edit (or zero edits) away.
*/
import java.util.Scanner;

class p5 {
    public static boolean oneEdit(String str1, String str2) {
        int charCount[] = new int[128];
        
    }
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        String str1; 
        String str2;
        
        System.out.println("Enter a string: ");
        str1 = scnr.nextLine();
        System.out.println("Enter another string: ");
        str2 = scnr.nextLine();

        if(oneEdit(str1, str2))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}