package Polymorphism;

public class motorCycle extends vehicle {
    public motorCycle (String model, String make, int year){
        super(model, make,year);
    }

    void Start(){
        System.out.println(String.format("Starting MotorCycle Vehicle, Model = %s, Make = %s, year = %d", getModel(), getMake(), getYear() ));
    }
    void Stop(){
        System.out.println(String.format("Stopping MotorCycle Vehicle, Model = %s, Make = %s, year = %d", getModel(), getMake(), getYear() ));
    }
}
