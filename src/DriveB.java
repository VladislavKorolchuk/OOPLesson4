public class DriveB<B extends Car> extends Driver {

   B car;

    public DriveB(String driverName, boolean drivingLicense, int drivingExperience, B car) {
        super(driverName, drivingLicense, drivingExperience);
        this.car = car;
    }

}
