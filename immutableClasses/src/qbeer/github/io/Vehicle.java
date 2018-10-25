package qbeer.github.io;

public class Vehicle {

    private final float fuelConsumption;
    private final VolumeUnit volumeUnit;

    private enum VolumeUnit{
        L("liters"),
        G("gallons");

        private final String volumeUnitName;
        private VolumeUnit(String volumeUnitName){
            this.volumeUnitName = volumeUnitName;
        }
        public String getVolumeUnitName(){
            return volumeUnitName;
        }
        public static VolumeUnit getVolumeUnit(String volumeUnitName) {
            return VolumeUnit.fromString(volumeUnitName);
        }
        private static VolumeUnit fromString(String volumeUnitName) {
            for (VolumeUnit vu : VolumeUnit.values()) {
                if (vu.getVolumeUnitName().equalsIgnoreCase(volumeUnitName)) {
                    return vu;
                }
            }
            // DEFAULT
            System.out.println("Falling back to default: " + VolumeUnit.L.getVolumeUnitName());
            return VolumeUnit.L;
        }
    }

    private enum DistanceUnit{
        M("miles"),
        KM("kilometers");

        private final String distanceUnitName;
        private  DistanceUnit(String distanceUnitName) {
            this.distanceUnitName = distanceUnitName;
        }
        public String getDistanceUnitName(){
            return distanceUnitName;
        }
        public static DistanceUnit getDistanceUnit(String distanceUnitName) {
            return DistanceUnit.fromString(distanceUnitName);
        }
        private static DistanceUnit fromString(String distanceUnitName) {
            for (DistanceUnit du : DistanceUnit.values()) {
                if (du.getDistanceUnitName().equalsIgnoreCase(distanceUnitName)) {
                    return du;
                }
            }
            // DEFAULT
            System.out.println("Falling back to default: " + DistanceUnit.KM.getDistanceUnitName());
            return DistanceUnit.KM;
        }
    }

    private final DistanceUnit distanceUnit;

    public Vehicle(float fuelConsumption, String distanceUnitName, String volumeUnitName) {
        this.fuelConsumption = fuelConsumption;
        this.distanceUnit = DistanceUnit.getDistanceUnit(distanceUnitName);
        this.volumeUnit = VolumeUnit.getVolumeUnit(volumeUnitName);
    }

    @Override
    public String toString() {
        return "Vehicle=[consumption=" + fuelConsumption + " " + volumeUnit.getVolumeUnitName() +
                "/" + distanceUnit.getDistanceUnitName() + "]";
    }


}