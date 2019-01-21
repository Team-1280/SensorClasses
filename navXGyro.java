package frc.robot.SensorClasses;

import edu.wpi.first.wpilibj.AnalogInput;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SPI.Port;


public class navXGyro {
    int port;
    AHRS gyroscope;
    public navXGyro(int kPort) {
        this.kPort = port;
        gyroscope = new AHRS(SPI.Port.kMXP); //Note: The Constructor asks for an integer but SPI.Port is an enum class so this might/should/will work?
    }
    public void reset() { //"Resets the Yaw gyro" (straight from API Documentation)
        gyroscope.reset();
    }
    public void zero() { //Zeroes yaw value to current angle 
        gyroscope.zeroYaw();
    }
    public double getTotalAngle() { //returns accumulated angle
        return gyroscope.getAngle();
    }
    public float getCurrentAngle() { //returns current compass bearing (i.e. 0-360)
        return gyroscope.getCompassHeading();
    }
}
