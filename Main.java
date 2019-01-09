class vehicle {
    int passengers;
    int doors;
    int range;
    double mpg;
    int topSpeed;

    //My created variables
    double torque;
    int hp;
    String engine;

    //My new methods (distance from LA to NYC is approximately 2700 miles.)
    double fuelToNYC (double mpg){ //Calculates how many gallons of fuel are required to go to NYC from LA
        double gallons = (double)2700 / mpg;
        gallons *= 10;
        gallons = Math.round(gallons);
        gallons /= 10;
        return gallons;
    }
    double timeToNYC (int topSpeed){
        double hours = (2700 / (double)topSpeed);
        hours *= 10;
        hours = Math.round(hours);
        hours /= 10;
        return hours;
    }
    double refuelStopsNYC (int range){
        double stops = (2700 / (double)range);
        stops *= 10;
        stops = Math.round(stops);
        stops /= 10;
        return stops;
    }
}

public class Main {
    public static void main(String[] args) {
        vehicle accord = new vehicle();
        vehicle M5 = new vehicle();
        vehicle huracan = new vehicle();

        accord.passengers = 5;
        accord.doors = 4;
        accord.range = 350; //in miles
        accord.mpg = 32;
        accord.topSpeed = 155;
        accord.torque = 190;
        accord.hp = 192;
        accord.engine = "4-cylinder CVT";

        M5.passengers = 5;
        M5.doors = 4;
        M5.range = 370;
        M5.mpg = 17;
        M5.topSpeed = 163;
        M5.torque = 553;
        M5.hp = 600;
        M5.engine = "V8";

        huracan.passengers = 2;
        huracan.doors = 2;
        huracan.range = 376;
        huracan.mpg = 17;
        huracan.topSpeed = 202;
        huracan.torque = 442;
        huracan.hp = 631;
        huracan.engine = "V10";

        System.out.println("The Accord can carry " + accord.passengers + " passengers.");
        System.out.println("The Accord has " + accord.doors + " doors and can drive " + accord.range + " miles before running out of range.");
        System.out.println("The Accord has an average mpg of " + accord.mpg);
        System.out.println("The Accord has a top speed of " + accord.topSpeed + "mph, while producing " + accord.torque + " lb-ft of torque and " + accord.hp + " horsepower using a " + accord.engine + " engine.");
        System.out.println("To drive from Los Angeles to New York, you will need at least " + accord.fuelToNYC(accord.mpg) + " gallons of fuel.");
        System.out.println("Driving at top speed, you can get to NYC in " + accord.timeToNYC(accord.topSpeed) + " hours.");
        System.out.println("However, you will need to stop for fuel " + accord.refuelStopsNYC(accord.range) + " times.");

        System.out.println("\nThe BMW M5 can carry " + M5.passengers + " passengers.");
        System.out.println("The BMW M5 has " + M5.doors + " doors and can drive " + M5.range + " miles before running out of range.");
        System.out.println("The BMW M5 has an average mpg of " + M5.mpg);
        System.out.println("The BMW M5 has a top speed of " + M5.topSpeed + "mph, while producing " + M5.torque + " lb-ft of torque and " + M5.hp + " horsepower using a " + M5.engine + " engine.");
        System.out.println("To drive from Los Angeles to New York, you will need at least " + M5.fuelToNYC(M5.mpg) + " gallons of fuel.");
        System.out.println("Driving at top speed, you can get to NYC in " + M5.timeToNYC(M5.topSpeed) + " hours.");
        System.out.println("However, you will need to stop for fuel " + M5.refuelStopsNYC(M5.range) + " times.");

        System.out.println("\nThe Lambourghini Huracan Performante can carry " + huracan.passengers + " passengers.");
        System.out.println("The Lambourghini Huracan Performante has " + huracan.doors + " doors and can drive " + huracan.range + " miles before running out of range.");
        System.out.println("The Lambourghini Huracan Performante has an average mpg of " + huracan.mpg);
        System.out.println("The Lambourghini Huracan Performante has a top speed of " + huracan.topSpeed + "mph, while producing " + huracan.torque + " lb-ft of torque and " + huracan.hp + " horsepower using a " + huracan.engine + " engine.");
        System.out.println("To drive from Los Angeles to New York, you will need at least " + huracan.fuelToNYC(huracan.mpg) + " gallons of fuel.");
        System.out.println("Driving at top speed, you can get to NYC in " + huracan.timeToNYC(huracan.topSpeed) + " hours.");
        System.out.println("However, you will need to stop for fuel " + huracan.refuelStopsNYC(huracan.range) + " times.");
    }
}
