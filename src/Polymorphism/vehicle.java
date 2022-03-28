package Polymorphism;

public class vehicle {
    private String model;
    private String make;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void start(){
        System.out.println("Starting");
    }

    public void stop(){
        System.out.println("stopping");
    }

    public vehicle(String model, String make, int year){
        this.model = model;
        this.make = make;
        this.year = year;
    }
}
