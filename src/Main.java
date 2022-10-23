public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car("Lada", "Granta", 1.5);
        Car chevroletEpica = new Car("Chevrolet Epica", "V250", 1.8);
        Car lada = new Car("Lada", "2107", 1.3);
        Car hyundai = new Car("Hyundai", "Staria", 1.9);

        Truck kamaz = new Truck("КамАЗ", "5490", 6);
        Truck gaz = new Truck("ГАЗ", "22107", 4);
        Truck chana = new Truck("Chana", "SC1022DBN", 4);
        Truck fan = new Truck("FAW", "1031", 3);

        Bus gazel = new Bus("ГАЗЕЛЬ", "CITY", 7);
        Bus kavz = new Bus("КАВЗ", "4238", 6);
        Bus liaz = new Bus("ЛИАЗ", "5292", 6);
        Bus paz = new Bus("ВЕКТОР", "NEXT", 7.6);

        DriveB driver1 = new DriveB("Иванов А.С.", true, 15, ladaGranta);
        DriveC driver2 = new DriveC("Петров В.А.",true,9, kamaz);
        DriveD driver3 = new DriveD("Сидоров Д.В.", true, 5, gazel);

        System.out.println("Водитель" + driver1.toString() + "\nуправляет автомобилем " + driver1.car + " и будет участвовать в заезде");
        System.out.println("Водитель" + driver2.toString() + "\nуправляет автомобилем " + driver2.car + " и будет участвовать в заезде");
        System.out.println("Водитель" + driver3.toString() + "\nуправляет автомобилем " + driver3.car + " и будет участвовать в заезде");
        driver3.startMoving();
        driver3.stop();
        driver3.refuelTheCar();

        //PrintStream var10000 = System.out;

        // Car carLadaGranta = new Car("Lada", "", 1999, "Россия", "белый", 150, 1.5, "МКПП", "седан", "B045AA198", 5, true);
        //PrintStream var10000 = System.out;
        //String var10001 = carLadaGranta.toString();
        //var10000.println(var10001 + " \nИнформация о заправке: " + carLadaGranta.refill() + "\n");
        //Train swallow = new Train("Ласточка", "B-901", 2011, "Россия", (String)null, 301, 3500.0, (LocalDate)null, "Белорусский вокзал", "Минск-Пассажирский", 11);
        //var10000 = System.out;
        //var10001 = swallow.toString();
        //var10000.println(var10001 + " \nИнформация о заправке: " + swallow.refill() + "\n");
        //Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", (String)null, 270, 1700.0, (LocalDate)null, "Ленинградский вокзала", "Ленинград-Пассажирский", 8);
        //var10000 = System.out;
        //var10001 = leningrad.toString();
        //var10000.println(var10001 + " \nИнформация о заправке: " + leningrad.refill() + "\n");
        //Bus ikarus = new Bus("Икарус", "250", 1900, "", "красный", 100);
        //var10000 = System.out;
        //var10001 = ikarus.toString();
        //var10000.println(var10001 + " \nИнформация о заправке: " + ikarus.refill() + "\n");}

    }
}

