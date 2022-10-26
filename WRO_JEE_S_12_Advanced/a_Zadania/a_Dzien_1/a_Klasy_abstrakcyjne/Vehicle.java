package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

abstract public class Vehicle {
    private Integer maxSpeed;
    protected String model;

    public Vehicle(Integer maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String toString(){
        return "Class: " + getClass().getSimpleName() + " model: " + getModel() + ", max speed: " + getMaxSpeed();

    }
}
