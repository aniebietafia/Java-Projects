package basics;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {

        String str1 = "Hello World";
        str1 += ", Aniebiet";

        String str2 = "Hello World";
        str2 += ", Aniebiet";

        boolean output1 = str1.equals(str2);
        System.out.println(output1);

        boolean output2 = str1 == str2;
        System.out.println(output2);

        // String class methods
        String sentence = "Little brown fox jumped over the green wall";

        int lengthOfString = sentence.length();
        System.out.println("Length of string: " + lengthOfString);

        System.out.println("Split string: " + Arrays.toString(sentence.split(" ")));
    }
}
