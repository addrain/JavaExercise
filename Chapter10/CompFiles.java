import java.io.*;

class CompFiles {
    public static void main(String args[]) {
        int i = 0, j = 0;

        if(args.length != 2){
            System.out.println("Usage: Compare two files");
            return;
        }

        try (FileInputStream file1 = new FileInputStream(args[0]);
            FileInputStream file2 = new FileInputStream(args[1])) {
            do {
                i = file1.read();
                j = file2.read();
                //System.out.println("file1: " + (char) i + "\nfile2: " + (char) j);
                if(i != j) break;
            } while(i != -1 || j != -1);
            if(i != j)
                System.out.println("Files differ");
            else
                System.out.println("Files are the same.");
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}