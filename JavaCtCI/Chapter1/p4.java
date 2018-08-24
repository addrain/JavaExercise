//Palindrome Permutation
import java.util.Scanner;


class p4 {
    public static boolean checkPal(String input) {
        int charArr[] = new int[128];
        int oddCount = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != ' ')
                charArr[input.charAt(i)]++;
        }
        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] % 2 != 0)
                oddCount++;
        }
        if(oddCount > 1) return false;
        return true;
    }
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        String input;

        System.out.println("Enter potential Palindrome");
        input = scnr.nextLine();
        
        if(checkPal(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        
        
    }
}