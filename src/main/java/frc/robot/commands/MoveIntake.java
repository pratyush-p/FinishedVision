package frc.robot.commands;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
public class MoveIntake extends CommandBase
{
    private double speed;

    public MoveIntake(double speed)
    {
        addRequirements(RobotContainer.getIntake());
        this.speed = speed;
    }

    @Override
    public void initialize()
    {
        RobotContainer.getIntake().moveIntake(RobotContainer.getJoy());
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.getIntake().stop();
    }

    @Override
    public void execute() {
        RobotContainer.getIntake().moveIntake(RobotContainer.getJoy());
    }

    @Override
    public boolean isFinished()
    {
        return false;
    }
}