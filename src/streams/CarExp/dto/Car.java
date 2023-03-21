package streams.CarExp.dto;

import java.time.LocalDate;

public class Car {
    private String carName;
    private String colour;
    private LocalDate issuedYear;
    private Integer cost;
    private Integer engineVolume;

    public Car(String carName, String colour, LocalDate issuedYear, Integer cost, Integer engineVolume) {
        this.carName = carName;
        this.colour = colour;
        this.issuedYear = issuedYear;
        this.cost = cost;
        this.engineVolume = engineVolume;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public LocalDate getIssuedYear() {
        return issuedYear;
    }

    public void setIssuedYear(LocalDate issuedYear) {
        this.issuedYear = issuedYear;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Integer engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", colour='" + colour + '\'' +
                ", issuedYear=" + issuedYear +
                ", cost=" + cost +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
