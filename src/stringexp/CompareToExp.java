package stringexp;

public class CompareToExp {
    public static void main(String[] args) {
        String str1 = "Compare";
        String str2 = new String("Compare");
        String str3 = new String("prajna");
        String str4 = "Compare";
        String str5 = "COMPARE";

        // 1 Object obj
        System.out.println("str1 compareTo str2 : "+ str1.compareTo(str2)); // 0
        System.out.println("str1 compareTo str3 : "+ str1.compareTo(str3)); // positive / negative

        // 2 string
        System.out.println("str1 compareTo str4 : "+ str1.compareTo(str4)); // 0
        System.out.println("str1 compareTo str5 : "+ str1.compareTo(str5)); // positive / negative

        // 3 ignore case
        System.out.println("str1 compareTo str5 : "+ str1.compareToIgnoreCase(str5)); // 0



    }
}
