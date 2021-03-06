package org.usfirst.frc.team4541.robot.auto;

import org.usfirst.frc.team4541.motionProfiling.PathHandler.PATHS;
import org.usfirst.frc.team4541.robot.ElevatorConstants;
import org.usfirst.frc.team4541.robot.commands.auto.DriveForward;
import org.usfirst.frc.team4541.robot.commands.auto.DrivePath;
import org.usfirst.frc.team4541.robot.commands.auto.DrivePath_2;
import org.usfirst.frc.team4541.robot.commands.auto.DriveToPosAtAngle;
import org.usfirst.frc.team4541.robot.commands.auto.TurnToAngle;
import org.usfirst.frc.team4541.robot.commands.auto.ZeroYaw;
import org.usfirst.frc.team4541.robot.commands.elevator.ElevatorHome;
import org.usfirst.frc.team4541.robot.commands.elevator.ElevatorToHeight;
import org.usfirst.frc.team4541.robot.commands.ShiftGear;
import org.usfirst.frc.team4541.robot.commands.setIntakeContracted;
import org.usfirst.frc.team4541.robot.commands.setIntakeSpeed;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.TimedCommand;

public class RightSwitchMP extends CommandGroup {
	public  RightSwitchMP() {
		addSequential(new ShiftGear(true));
		addSequential(new ZeroYaw());
		addSequential(new setIntakeContracted(true));
		addSequential(new ElevatorToHeight(ElevatorConstants.twoInches));
		addSequential(new TimedCommand(1));
		
		addSequential(new ElevatorToHeight(ElevatorConstants.switchHeight)); // move up elevator
    	
    	//addSequential(new DrivePath(PATHS.RIGHT_SWITCH)); //drive to switch
    	addSequential(new DrivePath_2(PATHS.RIGHT_SWITCH, 15)); //drive to switch
    	
    	addSequential(new DriveForward(AutoConstants.driveForwardVel, AutoConstants.driveForwardTime)); //make sure that we're touching the wall by driving forward a bit
    	addParallel(new setIntakeSpeed(-0.5)); //spin wheels at speed while opening grabber
//    	addSequential(new setIntakeContracted(false));

    	addSequential(new TimedCommand(2));
    	addSequential(new setIntakeSpeed(0));
    	addSequential(new DriveToPosAtAngle(-4, 0)); //back away from the switch
    	addSequential(new ElevatorToHeight(ElevatorConstants.twoInches));

    	 
    	
	}
}
