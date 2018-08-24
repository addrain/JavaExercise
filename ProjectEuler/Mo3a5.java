import java.util.Scanner;

class Mo3a5 {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        int max;
        int sum = 0;
        
        System.out.println("Enter an Integer: ");
        max = scnr.nextInt();
        
        for(int i = 0; i < max; i++){
            if(i % 3 == 0 || i % 5 == 0) sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}