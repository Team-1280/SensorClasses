package frc.robot.SensorClasses;

import edu.wpi.first.wpilibj.AnalogInput;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SPI.Port;


public class navXGyro {
    public static int port;
    AHRS gyroscope;
    public navXGyro(int kPort) {
        this.kPort = port;
        gyroscope = new AHRS(SPI.Port port); //Note: this is giving me a syntax error on 'port' so it might be screwed up, I don't see what's wrong though
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
