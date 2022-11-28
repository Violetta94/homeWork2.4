package transport;

public abstract class Transport {
    private  String brand;
    private  String model;

    private float engineVolume;

  /*  private final int year;
    private final String country;
    private String color;
    private int maxSpeed;*/

    public Transport(String brand, String model, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public abstract void startMoving ();
    public abstract void finishMoving ();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume<=0) {
            this.engineVolume = 1;
        }
        this.engineVolume = engineVolume;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank() || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
    }

/*    public abstract void refill();

public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            color = "default";
        }
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <=0 ) {
            maxSpeed =0;
        }
        this.maxSpeed = maxSpeed;
    }*/
}
