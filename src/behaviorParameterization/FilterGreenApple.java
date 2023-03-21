package behaviorParameterization;

import behaviorParameterization.dto.Apple;

import java.util.List;

public class FilterGreenApple implements AppleInterface{

    @Override
    public Boolean filterApple(Apple apple) {
        return apple.getColour().equals("green");
    }

}
