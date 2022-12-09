package Drivers;

import transport.Bus;
import transport.PassengerCar;

public class DriverD extends Driver<Bus>{

    public DriverD(String fio, boolean hasDriverLicense, int experience, Bus car) {
        super(fio, hasDriverLicense, experience, car);
    }

}
