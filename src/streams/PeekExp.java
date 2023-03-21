package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekExp {
    public static void main(String[] args) {

        var listVal = Stream.of("one", "two","three","four","five")
                .filter(s->s.length()>3)
                .peek(System.out::println)
                .map(s->s.toString().toUpperCase())
                .peek(s -> System.out.println("After map : "+s))
                .collect(Collectors.joining(",","",""));
        System.out.println("Final :"+listVal);

        PeekExp peekExp = new PeekExp();
        peekExp.peekUsedInstedOfMap();


    }

    private void peekUsedInstedOfMap() {
        Stream<User> userStream = Stream.of(new User("Alice"), new User("Bob"), new User("Chuck"));
        // Modifying the object, if we try to use map it will replace the object with other type say string
        userStream.peek(u -> u.setName(u.getName().toLowerCase()))
                .forEach(System.out::println);

        // with Map
        Stream<User> userStream1 = Stream.of(new User("Alice"), new User("Bob"), new User("Chuck"));
        userStream1.map(u -> (u.getName().toLowerCase()))
                .forEach(System.out::println);
    }

    private class User{
        String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
