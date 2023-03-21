package practice;

public class LabeledForLoop {
    public static void main(String[] args) {
        int arr[] = {4,5,6,5,7};

        aa:
        for (int i = 0; i < 5; i++) {
            bb:
            for (int j = 0; j < 5; j++) {
                if(i == 0 && j == 2){
                    System.out.println("break");
                    break bb;
                }
                System.out.println("i="+i +" j :"+j);
            }
        }
    }
}
