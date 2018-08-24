class Help {
    public static void main (String args[]) throws java.io.IOException {
        System.out.println("Help on:\n\t1. if\n\t2. switch\nChoose one:");

        char choice = (char) System.in.read();

        switch (choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("\tcase constant:");
                System.out.println("\t\tstatement sequence");
                System.out.println("\t\tbreak;");
                System.out.println("\t// ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Not an option.");
        }
    }
}