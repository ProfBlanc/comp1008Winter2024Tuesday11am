package wk6;

import java.util.ArrayList;

public class Car {

    private String color = "black";
    private int doors = 2;
    private double speed;

    enum TransmissionType {MANUAL, AUTOMATIC}
    private TransmissionType transmission = TransmissionType.AUTOMATIC;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        ArrayList<String> allowedColors = new ArrayList<>();
        allowedColors.add("black");
        allowedColors.add("white");
        allowedColors.add("blue");

        if(allowedColors.contains(color.toLowerCase())){
            this.color = color;
        }
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if(doors == 2 || doors == 4 || doors == 5)
            this.doors = doors;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if(speed>=0 && speed <= 300)
            this.speed = speed;
    }

    public TransmissionType getTransmission() {
        return transmission;
    }

    public void setTransmission(TransmissionType transmission) {
        this.transmission = transmission;
    }
    public void setTransmission(String transmission){

        this.transmission = switch (transmission.toUpperCase()){
            case "MANUAL"-> TransmissionType.MANUAL;
            default -> TransmissionType.AUTOMATIC;
        };
    }
}
