package streams;

public class StaticExp {

    public static void main(String[] args) {

        Calender.count(2,4);
    }

}

  class Calender{

    public static int count(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
}

 interface ICalender{

}