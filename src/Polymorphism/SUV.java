package Polymorphism;

public class SUV extends vehicle {

    public SUV (String model, String make, int year){
        super(model, make, year);
    }

    void Start(){
        System.out.println(String.format("Starting SUV Vehicle, Model = %s, Make = %s, year = %d", getModel(), getMake(), getYear() ));
    }
    void Stop(){
        System.out.println(String.format("Stopping SUV Vehicle, Model = %s, Make = %s, year = %d", getModel(), getMake(), getYear() ));
    }
}
