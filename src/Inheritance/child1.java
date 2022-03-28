package Inheritance;

 class child1 extends Parent {
    private String SSN;

     public String getSSN() {
         return SSN;
     }

     public void setSSN(String SSN) {
         this.SSN = SSN;
     }
}

 class Inheritance_Example {
    public static void main(String args[]){
    // create Parent object()
        Parent parent = new Parent();
        parent.setName("Sravan Reddy Annadi");
        parent.setAge(23);
        System.out.println(String.format("%s's  age is %s", parent.getName(), parent.getAge()));
    // create child1 object()

        child1 child = new child1();
        child.setName("Annadi Chandu Reddy");
        child.setAge(21);
        child.setSSN("234-46576");
        System.out.println(String.format("%s age is %s and his SSS number is: %s", child.getName(), child.getAge(), child.getSSN()));

        // create child2 object()
        child1 child_1 = new child1();
        child_1.setName("Tony Stark");
        child_1.setAge(55);
        child_1.setSSN("34567");

        System.out.println(String.format("%s age is %s and his SSS number is: %s", child_1.getName(), child_1.getAge(), child_1.getSSN()));

        //create child3 object()
        child1 child_2 = new child1();
        child_2.setName("Pepper potts");
        child_2.setAge(45);
        child_2.setSSN("6782324");

        System.out.println(String.format("%s age is %s and her SSS number is: %s", child_2.getName(), child_2.getAge(), child_2.getSSN()));

    }
}