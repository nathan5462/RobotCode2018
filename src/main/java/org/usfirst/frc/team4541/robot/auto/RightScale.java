package org.usfirst.frc.team4541.robot.auto;

import org.usfirst.frc.team4541.robot.ElevatorConstants;
import org.usfirst.frc.team4541.robot.commands.ShiftGear;
import org.usfirst.frc.team4541.robot.commands.setIntakeContracted;
import org.usfirst.frc.team4541.robot.commands.setIntakeSpeed;
import org.usfirst.frc.team4541.robot.commands.auto.DriveToPosAtAngle;
import org.usfirst.frc.team4541.robot.commands.auto.TurnToAngle;
import org.usfirst.frc.team4541.robot.commands.auto.ZeroYaw;
import org.usfirst.frc.team4541.robot.commands.elevator.ElevatorHome;
import org.usfirst.frc.team4541.robot.commands.elevator.ElevatorToHeight;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.TimedCommand;

public class RightScale extends CommandGroup {
	public RightScale() {
		//OLD SCALE
//		addSequential(new ShiftGear(true));
//		addParallel(new setIntakeContracted(true));
//    	addParallel(new ElevatorToHeight(ElevatorConstants.threeInches)); // move up elevator
//    	addParallel(new ZeroYaw());
//    	addSequential(new TimedCommand(1.5));
//    	
//    	addSequential(new DriveToPosAtAngle(22, 0));
//    	addSequential(new ElevatorToHeight(ElevatorConstants.maxElevatorHeight));
//    	addSequential(new TurnToAngle(-45));
//    	addSequential(new DriveToPosAtAngle(0.8, -45, true));
//    	addSequential(new setIntakeSpeed(AutoConstants.ejectVelocity)); //spin wheels at speed while opening grabber
////    	addSequential(new setIntakeContracted(false));
//    	addSequential(new TimedCommand(2));
//    	
//    	addSequential(new DriveToPosAtAngle(-2, -45, true)); //back away from the switch
//    	addSequential(new setIntakeSpeed(0));
//    	addSequential(new ElevatorToHeight(ElevatorConstants.twoInches));
		
		addSequential(new ShiftGear(true));
		addParallel(new setIntakeContracted(true));
    	addParallel(new ElevatorToHeight(ElevatorConstants.threeInches)); // move up elevator
    	addParallel(new ZeroYaw());
    	addSequential(new TimedCommand(1));
    	
    	addSequential(new DriveToPosAtAngle(25, 0));
    	addSequential(new TurnToAngle(-90));
    	addSequential(new DriveToPosAtAngle(-1, -90, true));
    	addSequential(new ElevatorToHeight(ElevatorConstants.maxElevatorHeight));
    	addSequential(new setIntakeSpeed(-0.7)); //spin wheels at speed while opening grabber
//    	addSequential(new setIntakeContracted(false));
    	addSequential(new TimedCommand(0.5));
    	
    	addSequential(new DriveToPosAtAngle(-2, -90, true)); //back away from the switch
    	addSequential(new setIntakeSpeed(0));
    	addSequential(new ElevatorToHeight(ElevatorConstants.twoInches));
	}
}