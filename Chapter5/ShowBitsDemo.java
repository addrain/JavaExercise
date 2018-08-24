class ShowBits {
    int numbits; //stores number of bits to be displayed

    ShowBits(int n) {
        numbits = n;
    }

    void show(long val) {
        long mask = 1;

        //left-shift a 1 into the proper position to be compared to val.
        mask <<= numbits-1;

        int spacer = 0;
        //compares each bit until mask is filled with zeroes as a result of unsigned right shifting
        for(; mask != 0; mask >>>= 1) {
            if((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            //prints a space after every 8 bits
            spacer++;
            if((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}

class ShowBitsDemo {
    public static void main (String args[]) {
        ShowBits b = new ShowBits(8);

        System.out.println("123 in binary: ");
        b.show(123);
    }
}