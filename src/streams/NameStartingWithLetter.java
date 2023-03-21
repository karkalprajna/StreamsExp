package streams;

import java.util.List;

public class NameStartingWithLetter {
    public static void main(String[] args) {
        // Obtain the list of names
        List<String> listOfNames = List.of("Prajna Karkal","Robert Johns","Eva Johnson","Praveen Vanchira");

        long numberOfLastNameWith =listOfNames.stream().map(name->name.split(" ")[1])
                .filter(lastName->lastName.startsWith("J"))
                .peek(System.out::println)
                .count();
        System.out.println("numberOfLastNameWith : "+numberOfLastNameWith);
    }
}

