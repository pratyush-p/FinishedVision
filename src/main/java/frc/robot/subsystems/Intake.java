package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Intake extends SubsystemBase
{ 
    private SpeedController intake;  

    public Intake(SpeedController intake) 
    {
         this.intake = intake;
    }
    public void moveIntake(XboxController joy)
    {
        intake.set(joy.getTriggerAxis(Hand.kLeft));
    }
    public void moveIntakeAuto(Double speed)
    {
        intake.set(speed);
    }
    public void stop()
    {
       intake.stopMotor();
    }
    public boolean isMoving()
    {
        return intake.get() > 0.1 || intake.get() < -0.1;
    }

    @Override
    public void periodic() {
        SmartDashboard.putNumber("Intake", intake.get());
    }
}