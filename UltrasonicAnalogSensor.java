package frc.robot.SensorClasses;
import edu.wpi.first.wpilibj.DigitalInput;

public class UltrasonicAnalogSensor {
    int port;
    double distance;
    double voltInches;
    DigitalInput sensor;
  
    public void UltrasonicSensor(int port) {
        this.port = port;
        sensor = new DigitalInput(port);
        // Sensor and DigitalInput are screwed up and we need to go over them again
    }
    public int getPort() {
        return this.port;
    }
    public void setVoltInches(double voltInches) {
    }
    public double getDistance() {
        distance = voltInches*voltage
        // Get the voltage and multiply by volt-inches to get the distance!
        // Remember to set the distance!
        return distance;
    }
}