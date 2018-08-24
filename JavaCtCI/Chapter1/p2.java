// Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.

import java.util.Scanner;

class p2 {
    public static boolean checkPerm(String str1, String str2) {
        if(str1.length() != str2.length()) return false;  //O(1)
        
        int charCnt[] = new int[128];
        //O(n)
        for(int i = 0; i < str1.length(); i++) {
            charCnt[str1.charAt(i)]++;
        }
        for(int i = 0; i < str2.length(); i++) {
            //charCnt[str2.charAt(i)]--;
            if(--charCnt[str2.charAt(i)] < 0) return false;
        }

        return true;
    }
    public static void main(String args[]) {
        String str1;
        String str2;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter str1: ");
        str1 = scnr.nextLine();
        System.out.println("Enter str2: ");
        str2 = scnr.nextLine();

        System.out.println("Permutation: " + checkPerm(str1, str2));

        scnr.close();
    }
}