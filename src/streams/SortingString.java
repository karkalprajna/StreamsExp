package streams;

import java.util.Comparator;
import java.util.List;

public class SortingString {
    public static void main(String[] args) {
        List<String> listToBeSorted = List.of("prajna","Aarya","kavan","Eva","Nova");
        listToBeSorted.stream().sorted().forEach(s-> System.out.println(s)); // asc
        listToBeSorted.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // descending order

        // sort all the values greater than 500 first and rest after that

    }
}
