package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SreamsExp {
    public static void main(String[] args) {
        // Empty stream
        //Stream stream = Stream.empty();

        // Stream operation on json objects

        // Arrays as stream
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stringStream = Stream.of(arr).filter(s->s.equals("a"));
        //System.out.println(stringStream);

        Stream<String> stringStream1 = Stream.<String>builder().add("abc").add("xyz").build();
        //stringStream1.map(System.out::println);

        Stream<String> stream = Stream.of("a", "b", "c").filter(element -> element.contains("b"));
        Optional<String> anyElement = stream.findAny();
        System.out.println("anyElement : "+anyElement.get());

        // However, an attempt to reuse the same reference after calling the terminal operation will trigger the IllegalStateException:
        /*Optional<String> firstElement = stream.findFirst();
        System.out.println("firstElement : "+firstElement.get());*/

        List<String> list = Arrays.asList("abc1", "abc5", "abc2");
        long count = list.stream().skip(1).map(s -> s.substring(0,3)).sorted().count();
        System.out.println(count);

        Optional<String> stream22 = list.stream().filter(element -> {
            System.out.println("filter() was called " + element);
            return element.contains("2");
        }).map(element -> {
            System.out.println("map() was called");
            return element.toUpperCase();
        }).findFirst();

        int reducedTwoParams = IntStream.range(1, 4).reduce(10, (a,b) -> a+b);
        System.out.println(reducedTwoParams);

        List<Product> productList = Arrays.asList(new Product("23", "potatoes"),
                new Product("14", "orange"), new Product("13", "lemon"),
                new Product("23", "bread"), new Product("13", "sugar"));

        List<String> listProductName = productList.stream().map(product -> product.getName()).collect(Collectors.toList());
        Set<String> setProductName =productList.stream().map(product -> product.getName()).collect(Collectors.toSet());
        Collection<String> stringCollection = productList.stream().map(product -> product.getName()).collect(Collectors.toCollection(LinkedList::new));

        // Joining : it will concatinate the string, output : potatoesorangelemonbreadsugar
        String listToString = productList.stream().map(product -> product.getName()).collect(Collectors.joining());

        // Output : [potatoes,orange,lemon,bread,sugar]
        String listToString1 = productList.stream().map(product -> product.getName()).collect(Collectors.joining(",","",""));
        System.out.println("listToString :" +listToString1);

        // Processing the average value of all numeric elements of the stream:
        double avgValue = productList.stream().map(product -> product.getId()).peek(System.out::println)
                .collect(Collectors.averagingInt(num -> Integer.parseInt(num)));
        System.out.println("avgValue : "+avgValue);
    }
}
