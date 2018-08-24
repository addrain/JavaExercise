class EvenFib {
    public static void main(String args[]) {
        int sum = 0;
        int secondFib = 2;
        int firstFib = 1;
        int temp = 0;
        while(secondFib < 4000000){
            System.out.print(secondFib + " ");
            if(secondFib % 2 == 0) sum += secondFib;
            temp = secondFib;
            secondFib += firstFib;
            firstFib = temp;
        }
        System.out.println("Sum: " + sum);
    }
}