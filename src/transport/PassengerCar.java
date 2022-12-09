package transport;

public class PassengerCar extends Transport implements Competing{

    private TypeOfBody typeOfBody;


    public PassengerCar(String brand, String model, float engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип авто - " + typeOfBody); }
    }

    @Override
    public void refill() {

    }

    public boolean passDiagnostics() {
        return this.isDiagnosticsPassed();
    }
    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public void startMoving() {
        System.out.println("start");
    }

    @Override
    public void finishMoving() {
        System.out.println("end");
    }

    public void repair() {

    }

    @Override
    public String toString() {
        return String.format("Класс: %s, марка: %s, модель: %s, мощность двигателя %.1fлс.", Bus.class.getSimpleName(), getBrand(), getModel(), getEngineVolume());
    }

    @Override
    public void pitStop() {
        System.out.printf("Автомобиль %s %s заезжает на Pit-stop.", getBrand(), getModel());
        System.out.printf("\nАвтомобиль %s %s прошел обслуживание, выезжает из Pit-stop.\n", getBrand(), getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время автомобиля %s %s составляет: %.0f минут(ы).\n", getBrand(), getModel(), (1+ Math.random() * (10)));
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость автомобиля %s %s  составила: %.1f км/ч.\n", getBrand(), getModel(), (100 + Math.random() * (100)));
    }
}
