package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.ColorType;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(1, "Fiat car", 50.0, ColorType.BLACK);

        vehicle.startEngine();
        vehicle.stopEngine();
    }
}
