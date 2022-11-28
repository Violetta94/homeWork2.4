package Drivers;

import transport.PassengerCar;

public class DriverB <B extends PassengerCar> extends Driver{

    public DriverB(String fio, boolean hasDriverLicense, int experience) {
        super(fio, hasDriverLicense, experience);
    }
    @Override
    public void startMove() {
        System.out.printf("Водитель %s легкового автомобиля разгоняется.\n", getFio());
    }

    @Override
    public void stop() {
        System.out.printf("Водитель %s легкового автомобиля тормозит.\n", getFio());
    }

    @Override
    public void refill() {
        System.out.printf("Водитель %s заправляет легковой авто.\n", getFio());
    }


    public void driverInfo(B car) {
        System.out.printf("Водитель %s, управляет автомобилем %s %s и будет участвовать в заезде.\n", getFio(), car.getBrand(), car.getModel());
    }

}
