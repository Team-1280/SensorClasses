package frc.robot.SensorClasses;
import edu.wpi.first.wpilibj.DigitalInput;

public class pushButton{
    int port;
    DigitalInput button;
    public pushButton(int port){
        this.port = port;
        button = new DigitalInput(port);
    }
    public int showPort(){
        return this.port;
    }
    public boolean get(){
        return button.get();
    }
}