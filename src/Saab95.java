import java.awt.*;

public class Saab95 extends Vehicle{
    
    public Saab95(){
        super(2, 125, Color.red, "Saab95", true);
        stopEngine();
    }

    public double speedFactor(){
        double turbo = 1;
        if(hasTurbo) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    public void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}
