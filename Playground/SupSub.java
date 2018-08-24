class Sup {
    int i;
    Sup(int i) {
        this.i = i;
    }
}

class Sub extends Sup {
    int j;
    Sub(int i, int j) {
        super(i);
        this.j = j;
    }

    void printThis() {
        System.out.println("i: " + super.i + "\nj: " + j);
    }
}

class SupSub {
    public static void main(String args[]){
        Sub foo = new Sub(1, 2);
        Sup joo;
        joo = foo;

        foo.printThis();
        System.out.println("joo.i: " + joo.i);
        //joo.printThis(); //won't compile because a super class can't reference subclass methods.
    }
}
