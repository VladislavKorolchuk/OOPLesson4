public class DriveC<C extends Truck> extends Driver {

    C car;

    public DriveC(String driverName, boolean drivingLicense, int drivingExperience, C car) {
        super(driverName, drivingLicense, drivingExperience);
        this.car = car;
    }

}
