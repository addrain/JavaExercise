class Factorial {
    int factR (int n) {
        int result = 1;
        if(n == 1) return 1;
        result = factR(n-1) * n;
        return result;
    }

    int factI (int n) {
        int result = 1;
        for(; n > 1; n--)
            result *= n;
        return result;
    }
}

class FactMain {
    public static void main (String args[]) {
        Factorial fact = new Factorial();
        System.out.println(fact.factR(3));
        System.out.println(fact.factI(3));
    }
}