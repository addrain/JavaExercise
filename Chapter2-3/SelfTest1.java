class SelfTest1 {
    public static void main (String args[]) throws java.io.IOException {
        int count = 0;
        char input;

        System.out.println("Write a sentence: ");
        do {
            input = (char) System.in.read();
            if(input >= 'a' && input <= 'z') input -= 32;
            else if(input >= 'A' && input <= 'Z') input += 32;
            System.out.print(input);
            if (input == ' ') count++;
        } while (input != '.');
        System.out.println("\nSpace count: " + count);
    }
}