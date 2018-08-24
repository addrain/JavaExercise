class ExcTest {
    static void genException(){
        /*
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        nums[7] = 10;
        System.out.println("this won't be displayed");
        */
        try {
            int nums[] = new int[4];

            System.out.println("Before exception is generated.");

            nums[7] = 10;
            System.out.println("this won't be displayed");
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
        }
    }
}

class ExcDemo2 {
    public static void main(String args[]) {
        /*
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
        }
        */
        ExcTest.genException();
        System.out.println("After catch statement.");
    }
}