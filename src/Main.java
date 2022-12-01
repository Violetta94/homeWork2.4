import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import transport.*;

public class Main {
    public static void main(String[] args) {
        PassengerCar lada = new PassengerCar("Lada","Kalina", 1.7f, TypeOfBody.CROSSOVER);
        PassengerCar audi = new PassengerCar("Audi","A8 50 L TDI quattro", 1.7f, TypeOfBody.COPE);
        PassengerCar bmw = new PassengerCar("BMW", "Z8", 2f, TypeOfBody.HATCHBACK);
        PassengerCar kia = new PassengerCar("Kia","Sportage 4-го поколения",1.5f, TypeOfBody.SEDAN);

        Trucks volkswagenTrucks = new Trucks("Volkswagen", "Caddy", 1.6f, Weight.N1);
        Trucks citroenTrucks = new Trucks("Citroen", "C25", 1.5f,Weight.N3);
        Trucks fiatTrucks = new Trucks("Fiat", "Doblo", 1.6f,Weight.N1);
        Trucks FordTrucks = new Trucks("Ford", "Cargo", 7.3f,Weight.N3);


        Bus mercedec = new Bus( "Mercedec","Granta", 3f, Capacity.LARGE);
        Bus audiBus = new Bus("Audi","Quattro", 2.7f,Capacity.MEDIUM);
        Bus bmwBus = new Bus("BMW", "Q8", 6f,Capacity.LARGE);
        Bus volkswagenBus= new Bus("Volkswagen", "A5", 3f,Capacity.SMALL);


        DriverB saxarov = new DriverB("Сахаров Максим Иванович", true,5,lada);
        DriverC ivanov = new DriverC("Иванов Иван Иванович",true,2,fiatTrucks);
        DriverD anohin = new DriverD("Анахон Влад Владимирович", true, 10,mercedec);
        System.out.println(saxarov);
        lada.printType();
        bmwBus.printType();
    }
}