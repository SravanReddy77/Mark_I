public class conditionalExecution_part3 {
    public static void main(String args[]){
        String grade = "D";
        switch (grade) {
            case "A": case " A+": case "A-":
                System.out.println("You are a great student");
                break;
            case "B": case "B+": case "B-":
                System.out.println("You are a good student");
                break;
            case "C": case "C+": case "C-":
                System.out.println("You are a Poor student");
                break;
            default:
                System.out.println("You failed");
                break;
        }
    }
}
