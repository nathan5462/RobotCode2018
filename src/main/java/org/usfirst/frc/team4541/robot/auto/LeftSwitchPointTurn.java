package org.usfirst.frc.team4541.robot.auto;

import org.usfirst.frc.team4541.motionProfiling.Constants;
import org.usfirst.frc.team4541.motionProfiling.PathHandler.PATHS;
import org.usfirst.frc.team4541.robot.ElevatorConstants;
import org.usfirst.frc.team4541.robot.commands.auto.DriveForward;
import org.usfirst.frc.team4541.robot.commands.auto.DrivePath;
import org.usfirst.frc.team4541.robot.commands.auto.DriveToPosAtAngle;
import org.usfirst.frc.team4541.robot.commands.auto.TurnToAngle;
import org.usfirst.frc.team4541.robot.commands.auto.ZeroYaw;
import org.usfirst.frc.team4541.robot.commands.elevator.ElevatorToHeight;
import org.usfirst.frc.team4541.robot.commands.EjectCube;
import org.usfirst.frc.team4541.robot.commands.ShiftGear;
import org.usfirst.frc.team4541.robot.commands.setIntakeSpeed;
import org.usfirst.frc.team4541.robot.commands.ToggleIntakeWheels;
import org.usfirst.frc.team4541.robot.commands.setIntakeContracted;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftSwitchPointTurn extends CommandGroup {

    public  LeftSwitchPointTurn() {
    	addSequential(new ShiftGear(true));
    	addSequential(new ZeroYaw());
    	addSequential(new setIntakeContracted(true));
    	addParallel(new ElevatorToHeight(ElevatorConstants.switchHeight)); // move up elevator
    	
    	addSequential(new DriveToPosAtAngle(3, 0)); //drive to switch
    	addSequential(new TurnToAngle(90));
    	addSequential(new DriveToPosAtAngle(4, 90));
    	addSequential(new TurnToAngle(0));
    	addSequential(new DriveToPosAtAngle(5.5, 0));
    	
    	addSequential(new DriveForward(AutoConstants.driveForwardVel, AutoConstants.driveForwardTime)); //make sure that we're touching the wall by driving forward a bit
    	addParallel(new setIntakeSpeed(AutoConstants.ejectVelocity)); //spin wheels at speed while opening grabber
    	addSequential(new setIntakeContracted(false));
    }
}
