import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import transport.Bus;
import transport.PassengerCar;
import transport.Trucks;

public class Main {
    public static void main(String[] args) {
        PassengerCar lada = new PassengerCar( "Lada","Granta", 1.5f);
        PassengerCar audi = new PassengerCar("Audi","A8 50 L TDI quattro", 1.7f);
        PassengerCar bmw = new PassengerCar("BMW", "Z8", 2f);
        PassengerCar kia = new PassengerCar("Kia","Sportage 4-го поколения",1.5f);

        Trucks volkswagenTrucks = new Trucks("Volkswagen", "Caddy", 1.6f);
        Trucks citroenTrucks = new Trucks("Citroen", "C25", 1.5f);
        Trucks fiatTrucks = new Trucks("Fiat", "Doblo", 1.6f);
        Trucks FordTrucks = new Trucks("Ford", "Cargo", 7.3f);


        Bus mercedec = new Bus( "Mercedec","Granta", 3f);
        Bus audiBus = new Bus("Audi","Quattro", 2.7f);
        Bus bmwBus = new Bus("BMW", "Q8", 6f);
        Bus volkswagenBus= new Bus("Volkswagen", "A5", 3f);


        DriverB<PassengerCar> saxarov = new DriverB<>("Сахаров Максим Иванович", true,5);
        saxarov.driverInfo(lada);
        DriverC<Trucks> ivanov = new DriverC<>("Иванов Иван Иванович",true,2);
        ivanov.driverInfo(fiatTrucks);
        DriverD<Bus> anohin = new DriverD<>("Анахон Влад Владимирович", true, 10);
        anohin.driverInfo(mercedec);
    }
}