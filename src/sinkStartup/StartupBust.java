package sinkStartup;

import java.util.ArrayList;
import java.util.List;

public class StartupBust {
    GameHelper gameHelper = new GameHelper();
    List<Startups> startupsList = new ArrayList<>();
    Integer numOfGuesses = 0;

    public static void main(String[] args) {



    }

    public void setUpGame(){
        // 3 startup companies
        Startups one = new Startups();
        one.setName("Myshore");

        Startups two = new Startups();
        two.setName("Aayda");

        Startups three = new Startups();
        three.setName("Unilog");

        startupsList = List.of(one,two,three);

        System.out.println("Your gold is to sink three startups");



    }

    public void startPlaying(){

    }

    public void checkUserGuess(){}
    public void finishGame(){}
}
