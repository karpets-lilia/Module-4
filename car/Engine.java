package car;

public class Engine {
    private double power;
    private String fuelType;

    Engine(int power, String fuelType) {
        this.power = power;
        this.fuelType = fuelType;
    }
    public void setPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

}

