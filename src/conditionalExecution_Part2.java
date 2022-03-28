public class conditionalExecution_Part2 {
    public static void main(String args[]) {
        double accountBalance = 1050600.84;
        int age = 54;
/*        if (accountBalance >= 1000000 || age > 65){
//            System.out.println("Good luck, you can retire now!");
//        }else {
//            System.out.println("You need to save more for retirement");
      } */
        if (accountBalance >= 1000000 && age > 65){
            System.out.println("Good luck, you can retire now!");
        }else {
            System.out.println("You need to save more for retirement");
        }
        double grade = 1.0;
        if (grade ==4.0){
            System.out.println("You did great");
        }else if(grade >= 3.5 && grade < 4.0){
            System.out.println("You did better");
        }else if(grade >= 2.5 && grade < 3.5){
            System.out.println("You did good");
        }else if(grade >= 1.5 && grade < 2.5){
            System.out.println("You can do better");
        }else{
            System.out.println("You failed");
        }
    }
}
