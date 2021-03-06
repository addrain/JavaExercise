/*
    This program illustrates the differences between int and double.

    Call this file Example3.java.
*/
class Example3 {
    public static void main (String args[]) {
        int var; // this declares an int variable
        double x; // this declares a double variable

        var = 10;

        x = 10.0;

        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x : " + x);
        System.out.println();

        //now, divide both by 4
        var = var/4;
        x = x/4;

        System.out.println("var after division: " + var);
        System.out.println("x after division: " + x);
    }
}