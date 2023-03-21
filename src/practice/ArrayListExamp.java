package practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamp {
    public static void main(String[] args) {
        List<String> arrayListString = new ArrayList<>();
        arrayListString.add("write");
        arrayListString.add("the bad");
        arrayListString.add("code");
        arrayListString.add("write");
        arrayListString.add("the worst");
        arrayListString.add("code");
        arrayListString.add("but");
        arrayListString.add("write the");
        arrayListString.add("code");

        // print the code
        printArrayList(arrayListString);

        // remove
        arrayListString.remove(1);
        arrayListString.remove(3);
        printArrayList(arrayListString);

        // contains
        if (arrayListString.contains("code")){
            System.out.println("you are going to be a coder");
        }

        //
        arrayListString.add(7, "be a coder");
        printArrayList(arrayListString);

        // contains all
        if(!arrayListString.containsAll(List.of("bad","worst"))){
            System.out.println("you are a coder");
        }

        // add in the middle of the index
        arrayListString.add(0, "write good"); // it does not replace the value, insted it pushes the rest of the value down
        printArrayList(arrayListString);

        // get
        System.out.println("Get last element form the array list :"+arrayListString.get(arrayListString.size()-1));

        // replace use set
        arrayListString.set(5,"always");
        printArrayList(arrayListString);

        // What does the elements return
        Boolean result = (arrayListString.add("new value"))? true : false;
        System.out.println("result :"+result);

        // clear
        arrayListString.clear();
        printArrayList(arrayListString);
    }

    private static void printArrayList(List<String> arrayListString) {
        System.out.println("------------------");
        arrayListString.stream().forEach(System.out::println);
        /*for (String arr :
                arrayListString) {
            System.out.println(arr);
        }*/
    }


}
