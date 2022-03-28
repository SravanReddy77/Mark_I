public class stringMethods {
    public static void main(String args[]){
        // java.lang.String class provides many useful methods to perform operations on sequence of char values.
        // length() - returns the length of string.
        // format(String s) - returns formatted string.
        // substring(int index) - returns substring for given begin index.
        // substring(int beginIndex, int endIndex) - returns substring starting from the begin index and end index.
        // contains( Char c) - returns true or false after matching the sequence of char value.
        // equals(String) - check the equality of string with object.
        // equalsIgnoreCase(String) - compares another string ignores uppercase and lowercase
        //isEmpty() - checks if the string is empty.
         String str1 = "Hello Sravan" + "Welcome to America";
         String str2 = "Welcome";
         String str3 = "";
         System.out.println(str1.length());
         System.out.println(String.format("%s", str1));
         System.out.println(str1.substring(1));
         System.out.println(str1.substring(1, 10));
         System.out.println(str1.contains("S"));
         System.out.println(str2.equals("Welcome"));
         System.out.println(str2.equalsIgnoreCase("welcome"));
         System.out.println(str3.isEmpty());
    }
}
