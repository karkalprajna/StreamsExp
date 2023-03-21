package behaviorParameterization;

import behaviorParameterization.dto.Apple;

public class FilterAppleByWeight implements AppleInterface{
    @Override
    public Boolean filterApple(Apple apple) {
        return apple.getWeight() > 40;
    }

}
