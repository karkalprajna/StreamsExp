package stringexp;

import java.util.Arrays;

public class StringToCharExp {
    public static void main(String[] args) {
        String str1 = "my name is Prajna";

        char[] charArray = str1.toCharArray();
        System.out.println("charArray : ");
        printCharArray(charArray);

        char c = str1.charAt(1);
        System.out.println("Char at index 1 : "+c);

        // the start index is exclusive, char is obtained from the start index +1
        char[] dstChar = new char[6];
        str1.getChars(11,str1.length(),dstChar,0);
        System.out.println("dstChar :");
        printCharArray(dstChar);

        System.out.println("String length:"+str1.length());
    }

    private static void printCharArray(char[] charArray) {
        Arrays.asList(charArray).stream().forEach(System.out::println);
    }
}
