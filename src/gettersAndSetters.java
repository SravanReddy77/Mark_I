public class gettersAndSetters {
    String make;
    String model;
    int year;
    public gettersAndSetters(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //getter method

    public String getMake(){ return make; }

    public String getModel(){ return model; }

    public int getYear(){ return year;}

    // setter method

    public void setMake(String make) { this.make = make;}

    public void setModel(String model) { this.model = model;}

    public void setYear(int year) { this.year = year;}

    //Instance method
    public void instanceMethod(){
        System.out.println("Starting");
    }

    public static void main(String args[]){
        // Accessor(getter) method provide access to an object's instance variables.
        // Accessor method is used to get the value of a private field.
        gettersAndSetters object = new gettersAndSetters("ford", "GT-40", 2009);
        System.out.println("The name of car is " + object.getMake());
        System.out.println("The model of car is " + object.getModel());
        System.out.println("The year of car is " + object.getYear());

        object.instanceMethod();
        //Mutator method is used to set a value of private field
        //object.setMake("Ferrari");
        object.setModel("ST-50");
        object.setYear(1996);
        System.out.println("new values are " + object.getMake() + '\n' + object.getModel() + '\n' + object.getYear());
    }
}
