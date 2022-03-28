public class loops_part2 {
    public static void main(String args[]) {
        int[] names = {1,5,10,14,17,19};
        int sum = 0;
        int max = names[0];
        for(int i = 0; i < names.length; i++){
            sum = sum + names[i];
            System.out.println(sum);
            if(names[0] < names[i]){
                max = names[i];
            }
        }
        System.out.println(" The Largest Number is " + max);
        String[] celebs = {"Robert Downey Jr", "Chris Evans", "Chris Hemsworth", "Tom Holland", "Mark ruffulao" };
        for(String done: celebs){
            System.out.print(done);
            System.out.print(", ");
        }
        System.out.println("\n");
        for (int dune: names){
            System.out.println(dune);
        }
    }
}
