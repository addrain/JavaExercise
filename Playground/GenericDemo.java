//Getting ahead of myself.  This is in chapter 14

class Gen<T,V> {
    T var1;
    V var2;

    Gen(T i, V j) {
        var1 = i;
        var2 = j;
    }
    void printContents() {
        System.out.println("var1 contains: " + var1);
        System.out.println("var2 contains: " + var2);
    }
}

class GenericDemo {
    public static void main(String args[]) {
        Gen<Integer, String> foo = new Gen<>(1, "Hello");
        Gen<Double, Character> zoo = new Gen<>(3.14, 'A');

        System.out.println("foo contains:");
        foo.printContents();
        System.out.println("zoo contains:");
        zoo.printContents();

    }
}