package frc.robot.SensorClasses;
import edu.wpi.first.wpilibj.DigitalInput;

public class UltrasonicAnalogSensor {
    int port;
    DigitalInput sensor;
  
    public void DiffuseSensor(int port) {
        this.port = port;
        sensor = new DigitalInput(port);
    }
    public int getPort() {
        return this.port;
    }
    public boolean get() {
        return sensor.get();
    }
}