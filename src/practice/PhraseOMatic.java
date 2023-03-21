package practice;

import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"agnostic", "opinionated",
                "voice activated", "haptically driven", "extensible",
                "reactive", "agent based", "functional", "AI enabled",
                "strongly typed"};

        String[] wordListTwo = {"loosely coupled", "six sigma",
                "asynchronous", "event driven", "pub-sub", "IoT", "cloud native",
                "service oriented", "containerized", "serverless",
        "microservices", "distributed ledger"};

        String[] wordListThree = {"framework", "library",
                "DSL", "REST API", "repository", "pipeline", "service mesh",
                "architecture", "perspective", "design",
                "orientation"};

        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int secLength = wordListTwo.length;
        int thirdLength = wordListThree.length;

        // generate three random numbers
        Random random = new Random();
        int randomNum1 = random.nextInt(oneLength);
        System.out.println("randomNum1 :"+randomNum1);
        int randomNum2 = random.nextInt(secLength);
        System.out.println("randomNum2:"+randomNum2);
        int randomNum3 = random.nextInt(thirdLength);
        System.out.println("randomNum3:"+randomNum3);

        // now build a phrase
        String phase = wordListOne[randomNum1] + " " + wordListTwo[randomNum2] +" "+ wordListThree[randomNum3];
        System.out.println("what we need is a :"+phase);

        int justRandom = random.nextInt();
        System.out.println("justRandom:"+justRandom); // 9 digit random number



    }
}
