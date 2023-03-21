package stringexp;

public class StringExp {
    public static void main(String[] args) {
        // working of Java.lang.String.subSequence() function.working of Java.lang.String.subSequence() function.
        String str = "Welcome to geeksforgeeks";

        // print Welcome
        System.out.printf("Return[0-7] : %s \n",str.subSequence(0,7));
        System.out.printf("Return[11-24] : %s \n",str.subSequence(11,24));
        try {
            System.out.printf("Return Exception : %s \n",str.subSequence(-1,24));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Throws IndexOutOfBoundsException as the start index is negative");
        }

        // What is the difference b/w subSequence() & substring()
        // subSequence() returns CharSequence & substring() returns String

        System.out.printf("Return substring [0-7] : %s \n",str.substring(0,7));
        System.out.printf("Return substring [11-24] : %s \n",str.substring(11,24));
        System.out.printf("Return substring [7] : %s \n",str.substring(8));

        try {
            System.out.printf("Return substring [11-25] : %s \n",str.substring(11,25));
        }catch (IndexOutOfBoundsException e){
            System.out.printf("Throws IndexOutOfBoundsException as the end index is more than the length %d",str.length());
        }
    }
}
