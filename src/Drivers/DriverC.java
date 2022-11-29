package Drivers;

import transport.PassengerCar;
import transport.Trucks;

public class DriverC extends Driver<Trucks>{

    public DriverC(String fio, boolean hasDriverLicense, int experience, Trucks car) {
        super(fio, hasDriverLicense, experience, car);
    }
}
