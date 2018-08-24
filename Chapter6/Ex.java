//example of static methods and enhanced for-loops along with varargs

class Sum {
    static int sum(int ... v) {
        int result = 0;
        for(int x : v) result += x;
        return result;
    }
}

class Ex {
    public static void main (String args[]) {
        System.out.println(Sum.sum(1, 2, 3, 4));
    }
}