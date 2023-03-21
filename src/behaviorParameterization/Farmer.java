package behaviorParameterization;

import behaviorParameterization.dto.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Farmer {

    public static void main(String[] args) {
        List<Apple> inventory = List.of(new Apple("red", 20),
                new Apple("yellow", 150),
                new Apple("green", 40),new Apple("green", 60));
        List<Apple> greenAppleList = filterGreenApple(inventory);
        System.out.println(greenAppleList);

        List<Apple> appleList = filterWeightGreaterThan(inventory);
        System.out.println(appleList);

        // Solution one - create interface
        List<Apple> greenAppleList1 = filterApple(inventory, new FilterGreenApple());
        System.out.println(greenAppleList1);

        List<Apple> appleList1 = filterApple(inventory, new FilterAppleByWeight());
        System.out.println(appleList1);

        // Solution 2: using anonums function - instead of interface define the implementaion in there

        // solution 3: using lambda exp - use predicate
        List<Apple> greenAppleList3 = filterApple(inventory, (Apple apple)-> apple.getColour().equals("green"));
        System.out.println("lambda :"+greenAppleList3);

        // Solution 4: Predicate
        List<Apple> greenAppleList4 = filter(inventory, (Apple apple)-> apple.getColour().equals("green"));
        System.out.println("predicate :"+greenAppleList4);

    }

    public interface Predicate<T>{
        boolean filter(T t);
    }
    private static<T> List<T> filter(List<T> inventory, Predicate<T> predicate){
        return inventory.stream().filter(f->predicate.filter(f)).collect(Collectors.toList());
    }

    private static List<Apple> filterApple(List<Apple> inventory, AppleInterface filterApple) {
        return inventory.stream().filter(apple -> filterApple.filterApple(apple)).collect(Collectors.toList());
    }

    private static List<Apple> filterWeightGreaterThan(List<Apple> inventory) {
        return inventory.stream().filter(apple -> apple.getWeight() > 40).collect(Collectors.toList());
    }

    // Obtain the list of apple with green colour
    private static List<Apple> filterGreenApple(List<Apple> inventory) {
        return inventory.stream().filter(apple -> apple.getColour().equals("green")).collect(Collectors.toList());
    }

    // Solution one

}
