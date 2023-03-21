package streams.CarExp;

import streams.CarExp.dto.Car;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class CarFunctions {

    public static void main(String[] args) {
        //display all cars
        makeCars().stream().forEach(System.out::println);
        System.out.println("---------------------------------------------------");

        // display cars of the specified color
        makeCars().stream().filter(car -> car.getColour().equals("white"))
                .forEach(System.out::println);
        System.out.println("---------------------------------------------------");

        //display cars more expensive than the specified price
        makeCars().stream().filter(car -> car.getCost()>120000)
                .forEach(System.out::println);
        System.out.println("-------------------year--------------------------------");

        // display cars whose year of manufacture is in the specified range
        makeCars().stream().filter(car -> car.getIssuedYear().isAfter(LocalDate.of(2012, 6, 30)))
                .forEach(System.out::println);

        // sort cars in descending order of value
        System.out.println("-------------------sort cars in descending order of value--------------------------------");
        makeCars().stream().sorted(Comparator.comparingInt(Car::getCost).reversed())
                .forEach(System.out::println);
    }

    private static List<Car> makeCars() {
        return List.of(new Car("xl6", "white", LocalDate.of(2020, 11, 26), 130000, 100),
                new Car("ford", "red", LocalDate.of(2019, 10, 26), 140000, 100),
                new Car("Toyoto", "black", LocalDate.of(2015, 9, 15), 180000, 500),
                new Car("Honda", "Grey", LocalDate.of(2011, 10, 06), 170000, 100),
                new Car("Nisan", "white", LocalDate.of(2022, 8, 20), 110000, 100));
    }
}
