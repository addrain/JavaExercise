class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return mpg * fuelcap;
    }
}

class VehicleMain {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 16;        
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.println("Minivan can hold " + minivan.passengers + " passengers and has a range of " + minivan.range() + ".");
        System.out.println("Sportscar can hold " + sportscar.passengers + " passengers and has a range of " + sportscar.range() + ".");

    }
}