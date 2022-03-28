public class conditionalExecution {
    public static void main(String args[]){
        String weather = "raining";
        boolean raining = true;
        if(weather.equals("raining")) {
            System.out.println("I will stay home");
        }else{
            System.out.println("I will go out for a walk");
        }
        if(raining && weather.equals("raining")){
            System.out.println("I will stay home");
        }else{
            System.out.println("I will go out for a walk");
        }
    }
}
