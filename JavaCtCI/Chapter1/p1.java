import java.util.HashSet;
import java.util.Scanner;

class p1{
    public static boolean isUnique(String in) {
        HashSet<Character> hashInt = new HashSet<Character>();
        for(int i = 0; i < in.length(); i++){
            if(!hashInt.add(in.charAt(i))) return false;
        }
        return true;
    }
    public static boolean isUnique2(String in) {
        boolean bool[] = new boolean[128];
        for(int i = 0; i < in.length(); i++) {
            if(bool[in.charAt(i)]) return false;
            bool[in.charAt(i)] = true;
        }
        return true;
    }

    public static void main(String args[]) {
        String input;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please put in a unique string");
        input = scnr.nextLine();

        System.out.println("You entered: " + input);
        if(isUnique(input))
            System.out.println("Is Unique.");
        else
            System.out.println("Isn't Unique.");

        if(isUnique2(input))
            System.out.println("Is Unique.");
        else
            System.out.println("Isn't Unique.");

        scnr.close();
    }
}