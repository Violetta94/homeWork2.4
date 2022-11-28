package transport;

public class Bus extends Transport implements Competing{

    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("start");
    }

    @Override
    public void finishMoving() {
        System.out.println("end");
    }

    @Override
    public String toString() {
        return String.format("Класс: %s, марка: %s, модель: %s, мощность двигателя %.1fлс.", Bus.class.getSimpleName(), getBrand(), getModel(), getEngineVolume());
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус %s %s заезжает на Pit-stop.", getBrand(), getModel());
        System.out.printf("\nАвтобус %s %s прошел обслуживание, выезжает из Pit-stop.\n", getBrand(), getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время автобуса %s %s составляет: %.0f минут(ы).\n", getBrand(), getModel(), (1+ Math.random() * (10)));
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость автобуса %s %s  составила: %.1f км/ч.\n", getBrand(), getModel(), (100 + Math.random() * (100)));
    }
}
