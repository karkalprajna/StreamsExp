package practice;

public class PoolPuzzleOne {
    public static void main(String[] args) {
        // a noise annoys an oyster
        int x = 0;
        while(x < 4){
            System.out.println("a");
            if(x < 1){
                System.out.println(" ");
            }

            System.out.print("n");

            if ( x > 1 ) {
                System.out.print(" oyster");
                x = x + 2;
            }
            if ( x == 1 ) {
                System.out.print("noys");
            }
            if ( x < 1 ) {
                System.out.print("oise");
            }
            System.out.println();

            x = x + 1;

        }
    }
}
