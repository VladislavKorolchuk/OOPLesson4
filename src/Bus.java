// Автобус
final class Bus extends Transport implements Competing {

    private double engineCapacity; // Обьем двигателя

    // public Bus(String brand, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed) {
    //    super(brand, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed);
    // }

    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
    }

    //   public String toString() {
    //       String var10000 = this.getBrand();
    //      return var10000 + " " + this.getModel() + ", цвет кузова  " + this.getBodyColor() + ", год производства " + this.getYearOfRelease() + ", страна сборки " + this.getCountryOfManufacture() + ", максимальная скорость " + this.getMaximumMovementSpeed();
    // }

    //String refill() {
    //   return "можно заправлять бензином или дизелем на заправке";
    // }

    @Override
    public void pitStop() {
        System.out.println("Класс Автобус Пит-Стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Класс Автобус Лучшее время круга");
    }

    @Override
    public void voidmaximumSpeed() {
        System.out.println("Класс Автобус Максимальная скорость");
    }

    @Override
    String refill() {
        return null;
    }

}
