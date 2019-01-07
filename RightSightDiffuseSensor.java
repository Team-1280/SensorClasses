package frc.robot;
import edu.wpi.first.wpilibj.DigitalInput;

public class RightSightDiffuseSensor {
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