//Playing with static variables and static methods.

class Thing {
    int i;
    int j;
    static int num = 3;

    Thing (int i, int j) {
        this.i = i;
        this.j = j;
    }
    void printNum() {
        System.out.println("num: " + num);
    }

    static void printNum1() {
        System.out.println("num: " + num);
    }
}

class StaticEx {
    public static void main (String args[]) {
        Thing thing1 = new Thing(1, 2);
        Thing thing2 = new Thing(3, 4);

        thing1.printNum();
        thing2.printNum();

        Thing.num++;

        thing1.printNum();
        thing2.printNum();

        Thing.printNum1();
    }
}