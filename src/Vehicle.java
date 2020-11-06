import java.awt.*;

public abstract class Vehicle implements Driveable, Moveable{
    private int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name

    public boolean hasTurbo;

    public Vehicle(int nrDoors, double enginePower, Color color, String modelName, boolean hasTurbo) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        this.hasTurbo = hasTurbo;
    }

    public void setColor(Color clr){
        color = clr;
    }
    public Color getColor(){
        return color;
    }

    public int getNrDoors(){
        return nrDoors;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }
    public void stopEngine(){
        currentSpeed = 0;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setTurboOn(){
        hasTurbo = true;
    }

    public void setTurboOff(){
        hasTurbo = false;
    }

    public abstract void incrementSpeed(double amount);
    public abstract void decrementSpeed(double amount);

    public void move(){

    }

    public void turnLeft(){

    }
    public void turnRight(){

    }

}
