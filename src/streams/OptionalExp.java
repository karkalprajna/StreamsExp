package streams;

import java.util.Optional;

public class OptionalExp {

    public static void main(String[] args) {
        // To create empty optional
        Optional optional = Optional.empty();

        String opName = "Prajna";
        Optional optional1 = Optional.of(opName);

        // Optional.of() will throw NPE if null value is passed
        try {
            String opName1 = null;
            Optional optional2 = Optional.of(opName1);
        }catch (NullPointerException e){
            System.out.println("Obtained NPE");
        }

        /**
         * But in case we expect some null values, we can use the ofNullable() method:
         * By doing this, if we pass in a null reference, it doesn't throw an exception but rather returns an empty Optional object:
         */
        String opName3 = null;
        Optional optional3 = Optional.ofNullable(opName3); // Optional.empty();
        if(optional3.isPresent())
            System.out.println("Optional is present");
        else
            System.out.println("null value is present");


        //ifPresent() use instead of if(name != null)
        String userName = "Prajna";
        Optional<String> optUserName = Optional.of(userName);
        optUserName.ifPresent(name -> System.out.println("opt name : "+name.length()));

        // if(name != null) multiple check
        Optional.ofNullable(userName).ifPresent(name->{
            name.toUpperCase();
        });

        // if string is null
        String userNoName = null;
        Optional<String> optUserNoName = Optional.ofNullable(userNoName);
        optUserNoName.ifPresent(name -> System.out.println("opt no name : "+name.length()));

        // orElse() and get()
        String userNull = null;
        String optUserNull = Optional.ofNullable(userNull).orElse("value");
        System.out.println("optUserNull : "+optUserNull);


    }
}
