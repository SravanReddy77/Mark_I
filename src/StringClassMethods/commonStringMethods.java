package StringClassMethods;

// Common String Methods
// concat(String s) - concatenates specified string.
// replace(Char a, Char b) - replaces all the occurrences of specified char value.
// split (String regEx) - returns splitted string matching regex.
// toLowerCase() - returns string in lowercase.
// toUpperCase() - returns string in uppercase.
// trim() -  removes  beginning and ending spaces of this string.
// valueOf(int value) - converts given type into string.

import java.util.Locale;

public class commonStringMethods {
    public static void main(String args[]){
        String str1 = "Hello";
        String str2 = "Welcome";
        String str3 = "Java";
        String str4 = "Test";
        String str5 = "        String      ";
        int total = 50;
        String str6 = "abc, gef, cad";
        String[] count = str6.split("\\s+");
        System.out.println(str1.concat(str2));
        System.out.println(str1.replace('H', 'W'));
        System.out.println(str3.toUpperCase());
        System.out.println(str4.toLowerCase());
        System.out.println(str5.trim());
        System.out.println(String.valueOf(total));
        System.out.println(count.length);
        for(String s: count){
            System.out.println("Words " + s);
        }

    }
}
