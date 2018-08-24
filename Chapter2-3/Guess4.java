class Guess4 {
    public static void main (String args[]) throws java.io.IOException{
        char ch, ignore, answer = 'K';

        do {
            System.out.println("Guess a letter between 'A' and 'Z'.");

            ch = (char) System.in.read();

            /*
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            */

            if (ch == answer) System.out.println ("**RIGHT**");
            else {
                System.out.print("...Sorry, you're answer " + (int)ch + " is ");
                if (ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again.");
            }
        } while (answer != ch);
    }
}