package frc.robot.SensorClasses;

import edu.wpi.first.wpilibj.AnalogInput;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SPI.Port;


public class navXGyro {
double bearing;
public static int port;
AHRS gyroscope;

    public navXGyro(int kPort) {
        this.kPort = port;
        gyroscope = new AHRS(SPI.Port port);
    }
    public void reset() {
        gyroscope.reset();
    }
    public void zero() {
        gyroscope.zeroYaw();
    }
    public double getTotalAngle() {
        return gyroscope.getAngle();
    }
    public float getCurrentAngle() {
        return gyroscope.getCompassHeading;
    }
}
