public class DriveD<D extends Bus> extends Driver {
    D car;

    public DriveD(String driverName, boolean drivingLicense, int drivingExperience, D car) {
        super(driverName, drivingLicense, drivingExperience);
        this.car = car;
    }

}
