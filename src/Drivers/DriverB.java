package Drivers;

import transport.PassengerCar;

public class DriverB extends Driver<PassengerCar>{

    public DriverB(String fio, boolean hasDriverLicense, int experience, PassengerCar car) {
        super(fio, hasDriverLicense, experience, car);
    }

}
