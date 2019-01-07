package frc.robot.SensorClasses;
import edu.wpi.first.wpilibj.DigitalInput;

public class UltrasonicSensor {
    int kPort;
    DigitalInput sensor;
  
    public void DiffuseSensor(int port) {
        kPort = port;
        sensor = new DigitalInput(kPort);
    }
    public boolean getObjectDetected() {
        return sensor.get();
    }
}