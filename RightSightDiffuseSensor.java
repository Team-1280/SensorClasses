package frc.robot.SensorClasses.SensorClassesIntegration.src.main.java.frc.robot.SensorClasses;
import edu.wpi.first.wpilibj.DigitalInput;

public class RightSightDiffuseSensor {
    int port;
    DigitalInput sensor;
  
    public void DiffuseSensor(int port) {
        this.port = port;
        sensor = new DigitalInput(port);
    }
    public int getPort() {
        return this.port;
    }
    public boolean getDistance() {
        return sensor.get();
    }
}