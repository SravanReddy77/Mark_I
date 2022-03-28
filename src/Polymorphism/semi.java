package Polymorphism;

public class semi extends vehicle {
    public semi (String model, String make, int year){
        super(model, make,year);
    }

    void Start(){
        System.out.println(String.format("Starting Semi Vehicle, Model = %s, Make = %s, year = %d", getModel(), getMake(), getYear() ));
    }
    void Stop(){
        System.out.println(String.format("Stopping Semi Vehicle, Model = %s, Make = %s, year = %d", getModel(), getMake(), getYear() ));
    }
}
