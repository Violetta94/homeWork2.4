import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import exceptions.Data;
import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;
import transport.*;

import java.util.List;

public class Main {
public static void main(String[] args) {

    Mechanic<PassengerCar> petr = new Mechanic<PassengerCar>("Petr", "Ivanov", "Loppi");
    Mechanic<Transport> aleks = new Mechanic<Transport>("Aleks", "Ivanov", "Loppi");
    Sponsor jou = new Sponsor("Jou", 1_000_000);
    Sponsor hop = new Sponsor("Hop", 2_000_000);

        PassengerCar lada = new PassengerCar("Lada","Kalina", 1.7f, TypeOfBody.CROSSOVER);
//        PassengerCar audi = new PassengerCar("Audi","A8 50 L TDI quattro", 1.7f, TypeOfBody.COPE);
//        PassengerCar bmw = new PassengerCar("BMW", "Z8", 2f, TypeOfBody.HATCHBACK);
//        PassengerCar kia = new PassengerCar("Kia","Sportage 4-го поколения",1.5f, TypeOfBody.SEDAN);

        lada.addDriver(new DriverB("Сахаров Максим Иванович", true,5,lada));
        lada.addMechanic(petr);
        lada.addSponsor(jou,hop);


        Trucks volkswagenTrucks = new Trucks("Volkswagen", "Caddy", 1.6f, Weight.N1);
//        Trucks citroenTrucks = new Trucks("Citroen", "C25", 1.5f,Weight.N3);
//        Trucks fiatTrucks = new Trucks("Fiat", "Doblo", 1.6f,Weight.N1);
//        Trucks fordTrucks = new Trucks("Ford", "Cargo", 7.3f,Weight.N3);

    volkswagenTrucks.addDriver(new DriverC("Сахаров Максим Иванович", true,5,volkswagenTrucks));
    volkswagenTrucks.addMechanic(aleks);
    volkswagenTrucks.addSponsor(hop);


        Bus mercedec = new Bus( "Mercedec","Granta", 3f, Capacity.LARGE);
//        Bus audiBus = new Bus("Audi","Quattro", 2.7f,Capacity.MEDIUM);
//        Bus bmwBus = new Bus("BMW", "Q8", 6f,Capacity.LARGE);
//        Bus volkswagenBus= new Bus("Volkswagen", "A5", 3f,Capacity.SMALL);


    mercedec.addDriver(new DriverD("Анахон Влад Владимирович", true,5,mercedec));
    mercedec.addMechanic(aleks);
    mercedec.addSponsor(jou);

//        DriverB saxarov = new DriverB("Сахаров Максим Иванович", true,5,lada);
//        DriverC ivanov = new DriverC("Иванов Иван Иванович",true,2,fiatTrucks);
//        DriverD anohin = new DriverD("Анахон Влад Владимирович", true, 10,mercedec);
//        System.out.println(saxarov);
//        lada.printType();
//        bmwBus.printType();


    List<Transport> transports = List.of(lada, volkswagenTrucks, mercedec);

    for (Transport transport: transports) {
        printInfo(transport);
    }


    }

    private static void printInfo (Transport transport) {
        System.out.println("Инфоррмация по автомобилю " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: ");
        for (Driver<?> driver: transport.getDrivers()) {
            System.out.println(driver.getFio());
        }
        System.out.println("Спонсоры: ");
        for (Sponsor sponsor: transport.getSponsors()) {
            System.out.println(sponsor.getName() + " сумма: " + sponsor.getAmount());
        }
        System.out.println("Механики: ");
        for (Mechanic<?> mechanic: transport.getMechanics()) {
            System.out.println(mechanic.getName() + " " + mechanic.getSurName());
        }
    }

    public static void checkTransport (Transport...transports) {
       int count = 0;
        for (Transport transport: transports) {
                if (!transport.passDiagnostics()) {
                        try {
                                throw  new RuntimeException(transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
                        } catch ( RuntimeException e) {
                                System.out.println(e.getMessage());
                        }
                } else {
                        count++;
                }
        }
            System.out.println(count);
    }
}
