package streams.dishes;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Dishstream {
    public static void main(String[] args) {
        List<Dish> dishes = getDishes();
        // filter dishes less than 400 caloried
        // sort asc & discending order of calories
        // get the list of dish

        List<String> orderedDish = dishes.stream()
                .filter(dish -> dish.getCalories() > 400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed()) // desc order
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(orderedDish);

        // To execute this in parallel
        List<String> orderDishRunParallel = dishes.parallelStream()
                .filter(dish -> dish.getCalories() > 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(orderDishRunParallel);

        // filter only vegetarian
        List<Dish> vagetarianDishes = dishes.stream()
                .filter(Dish::isVegetarian)
        .collect(Collectors.toList());

        // list of even numbers
        List<Integer> intList = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        intList.stream()
                .filter(i->i%2 == 0)
                .distinct()
                .forEach(System.out::println);

        // list first 3 dishes more than 300 cal
        dishes.stream()
                .filter(f->f.getCalories() > 300)
                .skip(1)
                .limit(3)
                .forEach(System.out::println);
    }

    private static List<Dish> getDishes() {
        return List.of(new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );
    }
}
