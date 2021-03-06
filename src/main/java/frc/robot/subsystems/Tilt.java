package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Tilt extends SubsystemBase
{ 
    private SpeedController tiltMotor;  
    private DigitalInput tiltLimit;

    public Tilt(SpeedController tiltMotor, DigitalInput tiltLimit) 
    {
         this.tiltMotor = tiltMotor;
         this.tiltLimit = tiltLimit;
    }
    public void moveTilt(double speed)
    {
        tiltMotor.set(speed);
    }
    public void stop()
    {
       tiltMotor.stopMotor();
    }

    public boolean getLimit() 
    {
        return !tiltLimit.get();
    }

    @Override
    public void periodic() 
    {
        
    }
}