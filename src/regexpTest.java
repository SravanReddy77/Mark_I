public class regexpTest {

    public static final String EXAMPLE_STRING = "Hello Sravan " + " Welcome to Java ";
    public static void main(String args[]) {
        System.out.println(EXAMPLE_STRING.matches("\\ws.*"));
        String[] splitString = (EXAMPLE_STRING.split("\\s+"));
        System.out.println(splitString.length);
        System.out.println("\t");

        for (String s: splitString) {
            System.out.println(splitString);
        }
        System.out.println(EXAMPLE_STRING.replaceAll("\\s+", "\t"));

    }
}