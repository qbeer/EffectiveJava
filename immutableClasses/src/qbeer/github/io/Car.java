package qbeer.github.io;

public class Car extends Vehicle {

    private final String color;

    private Car(float fuelConsumption, String distanceUnitName, String volumeUnitName, String color) {
        super(fuelConsumption, distanceUnitName, volumeUnitName);
        this.color = color;
    }

    static class CarBuilder {

        private float fuelConsumption;
        private String distanceUnit;
        private String volumeUnit;
        private String color;

        CarBuilder fuelConsumption(float fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
            return this;
        }

        CarBuilder distanceUnit(String distanceUnit) {
            this.distanceUnit = distanceUnit;
            return this;
        }

        CarBuilder volumeUnit(String volumeUnit) {
            this.volumeUnit = volumeUnit;
            return this;
        }

        CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        Car build() {
            return new Car(fuelConsumption, distanceUnit, volumeUnit, color);
        }

    }

    @Override
    public String toString() {
        String vehicle = super.toString();
        return vehicle + " ...and colored=" + color;
    }

}
