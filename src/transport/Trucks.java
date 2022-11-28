package transport;

public class Trucks extends Transport implements Competing{

    public Trucks(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMoving() {
        System.out.println("start");
    }

    public void finishMoving() {
        System.out.println("end");
    }

    @Override
    public String toString() {
        return String.format("Класс: %s, марка: %s, модель: %s, мощность двигателя %.1fлс.", Bus.class.getSimpleName(), getBrand(), getModel(), getEngineVolume());
    }

    @Override
    public void pitStop() {
        System.out.printf("Грузовой автомобиль %s %s заезжает на Pit-stop.", getBrand(), getModel());
        System.out.printf("\nГрузовой автомобиль %s %s прошел обслуживание, выезжает из Pit-stop.\n", getBrand(), getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время грузового автомобиля %s %s составляет: %.0f минут(ы).\n", getBrand(), getModel(), (1+ Math.random() * (10)));
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость грузового автомобиля %s %s  составила: %.1f км/ч.\n", getBrand(), getModel(), (100 + Math.random() * (100)));
    }
}
