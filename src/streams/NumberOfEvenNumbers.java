package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberOfEvenNumbers {
    public static void main(String[] args) {
        // Create a random array of numbers
        List<Integer> numberList = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            int number = rnd.nextInt(1000) % 100;
            numberList.add(number);
            //System.out.println("number : "+number);
        }

        long numberOfEvenNum = numberList.stream().filter(num -> (num % 2) == 0).peek(System.out::println).count();
        System.out.println("numberOfEvenNum : " + numberOfEvenNum);
    }
}
