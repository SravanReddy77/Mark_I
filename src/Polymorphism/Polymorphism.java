package Polymorphism;

public class Polymorphism {
    public static void main(String args[]){

        //create a Vehicle Object()
        vehicle vehicle = new vehicle("Ford", "GT-40",1969);
        vehicle.start();
        vehicle.stop();

        // Create SUV object()
        SUV suv = new SUV("Toyota", "RAV4", 1997);
        System.out.println("_______________________________________");
        suv.Start();


        // Create Mini object()
        semi semi = new semi("Mini", "Cooper", 1967);
        System.out.println("_______________________________________");
        semi.Start();

        // Create MotorCycle object()
        motorCycle motor = new motorCycle("Yamaha", "Apache", 2008);
        System.out.println("_______________________________________");
        motor.Start();

        System.out.println("Stopping all vehicles");
        semi.Stop();
        suv.Stop();
        motor.Stop();
    }
}
