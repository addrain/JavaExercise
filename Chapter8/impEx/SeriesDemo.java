package impEx;

class SeriesDemo {
    public static void main(String args[]) {
        ByTwos ob = new ByTwos();
        ByThrees ob1 = new ByThrees();

        for(int i=0; i < 5; i++) 
            System.out.println("Next value is " + ob.getNext());

        System.out.println("\nResetting");
        ob.reset();
        for(int i=0; i < 5; i++) 
            System.out.println("Next value is " + ob.getNext());
        
        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for(int i = 0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());
        System.out.println("\nByThrees:");
        for(int i=0; i < 5; i++) 
        System.out.println("Next value is " + ob1.getNext());

        System.out.println("\nResetting");
        ob1.reset();
        for(int i=0; i < 5; i++) 
            System.out.println("Next value is " + ob1.getNext());
        
        System.out.println("\nStarting at 100");
        ob1.setStart(100);
        for(int i = 0; i < 5; i++)
            System.out.println("Next value is " + ob1.getNext());    
    }
}