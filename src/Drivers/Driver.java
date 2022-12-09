package Drivers;

import transport.Transport;

public abstract class Driver <T extends Transport> {
    private String fio;
    private boolean hasDriverLicense;
    private int experience;
    private final T car;


    public String validateStringParametrs(String value){
        return value == null || value.isBlank() || value.isEmpty() ? "Иванов Иван Иванович" : value;
    }
    public int validateIntParametrs(int value){
        return value <= 0 ? 1 : Math.abs(value);
    }

    public Driver(String fio, boolean hasDriverLicense, int experience, T car) {
        this.fio = fio;
        this.hasDriverLicense = hasDriverLicense;
        this.experience = experience;
        this.car = car;
    }

   /* public Driver(String fio, boolean hasDriverLicense, int experience) {
        this.fio = fio;
        this.hasDriverLicense = hasDriverLicense;
        this.experience = experience;
    }*/

    public void startMove() {
        System.out.printf("Водитель %s разгоняется.\n", getFio());
    }
    public void stop() {
        System.out.printf("Водитель %s тормозит.\n", getFio());
    }
    public void refill() {
        System.out.printf("Водитель %s заправляет авто.\n", getFio());
    }


    public void driverInfo(T car) {
        System.out.printf("Водитель %s, управляет автомобилем %s %s и будет участвовать в заезде.\n", this.getFio(), this.car.getBrand(), this.car.getModel());
    }

    public String getFio() {
        return fio;
    }


    public void setFio(String fio) {
        this.fio = fio;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return String.format("Водитель: %s, со стажем вождения: %d лет. Наличие прав: %b.", getFio(), getExperience(), isHasDriverLicense());
    }
}
