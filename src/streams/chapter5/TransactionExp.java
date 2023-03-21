package streams.chapter5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TransactionExp {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        // Find all transactions in the year 2011 and sort them by value (small to high).
        transactions.stream()
                .filter(f->f.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .forEach(System.out::println);

        // What are all the unique cities where the traders work?
        transactions.stream()
                .map(transaction -> transaction.getTrader().getPlace())
                .distinct()
                .forEach(System.out::println);

        // Find all traders from Cambridge and sort them by name.
        transactions.stream()
                .filter(t->t.getTrader().getPlace().equals("Cambridge"))
                .map(traders->traders.getTrader())
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        // Return a string of all traders’ names sorted alphabetically.
        transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .sorted()
                .distinct()
                .forEach(System.out::println);

        // Are any traders based in Milan?
        Optional<Transaction> first = transactions.stream()
                .filter(transaction -> transaction.getTrader().getPlace().equals("Milan"))
                .findFirst();
        if(first.isPresent())
             System.out.println("present in Milan");
        else
            System.out.println("not present in Milan");

        boolean isMilan = transactions.stream()
                        .anyMatch(transaction -> transaction.getTrader().getPlace().equals("Milan"));
        System.out.println("boolean :"+isMilan);

        // Print all transactions’ values from the traders living in Cambridge.
        transactions.stream()
                .filter(t->t.getTrader().getPlace().equals("Cambridge"))
                .map(t->t.getValue())
                .forEach(System.out::println);

        // What’s the highest value of all the transactions?
        Optional<Transaction> max = transactions.stream()
                .max(Comparator.comparingInt(Transaction::getValue));

        Optional<Integer> max1 = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(max1.get());

        // Find the transaction with the smallest value.
        Optional<Integer> min = transactions.stream()
                .map(t -> t.getValue())
                .min(Integer::compareTo);
        System.out.println(min.get());
    }
}
