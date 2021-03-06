package org.usfirst.frc.team4541.robot.auto;

import org.usfirst.frc.team4541.motionProfiling.PathHandler.PATHS;
import org.usfirst.frc.team4541.robot.ElevatorConstants;
import org.usfirst.frc.team4541.robot.commands.ShiftGear;
import org.usfirst.frc.team4541.robot.commands.setIntakeContracted;
import org.usfirst.frc.team4541.robot.commands.setIntakeSpeed;
import org.usfirst.frc.team4541.robot.commands.auto.DriveForward;
import org.usfirst.frc.team4541.robot.commands.auto.DrivePath;
import org.usfirst.frc.team4541.robot.commands.auto.DrivePath_2;
import org.usfirst.frc.team4541.robot.commands.auto.DriveToPosAtAngle;
import org.usfirst.frc.team4541.robot.commands.auto.ZeroYaw;
import org.usfirst.frc.team4541.robot.commands.elevator.ElevatorToHeight;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.TimedCommand;

public class LeftTwoCubeSwitch extends CommandGroup{
	public  LeftTwoCubeSwitch() {
		addSequential(new ShiftGear(true));
		addSequential(new ZeroYaw());
		addSequential(new setIntakeContracted(true));
		addParallel(new ElevatorToHeight(ElevatorConstants.switchHeight));
		addSequential(new TimedCommand(0.4));
		
    	addSequential(new DrivePath(PATHS.FAST_LEFT_SWITCH)); //drive to switch
    	
    	addSequential(new DriveForward(AutoConstants.driveForwardVel, AutoConstants.driveForwardTime)); //make sure that we're touching the wall by driving forward a bit
    	addParallel(new setIntakeSpeed(-0.5)); //spin wheels at speed while opening grabber
    	addSequential(new TimedCommand(0.25));
//    	addSequential(new TimedCommand(2));
//    	addSequential(new setIntakeSpeed(0));
    	
    	addParallel(new ElevatorToHeight(ElevatorConstants.minElevatorHeight));
    	addSequential(new DriveToPosAtAngle(-8.5, 0, 0.8)); //back away from the switch
    	
    	addSequential(new setIntakeContracted(false));
    	addSequential(new setIntakeSpeed(1));
    	addSequential(new DrivePath(PATHS.LEFT_TO_CUBE)); //drive to switch
    	addSequential(new DriveForward(AutoConstants.driveForwardVel, 0.2)); //make sure that we're touching the cube by driving forward a bit
    	addSequential(new setIntakeContracted(true));
    	addSequential(new setIntakeSpeed(0));
    	
    	addSequential(new DriveToPosAtAngle(-5, 0, 0.8)); //back away from the switch
    	
    	addParallel(new ElevatorToHeight(ElevatorConstants.switchHeight));
    	addSequential(new DrivePath(PATHS.FAST_LEFT_SWITCH)); //drive to switch
    	addSequential(new DriveForward(AutoConstants.driveForwardVel, AutoConstants.driveForwardTime)); //make sure that we're touching the wall by driving forward a bit
    	addParallel(new setIntakeSpeed(-0.5)); //spin wheels at speed while opening grabber
    	
	}
}
