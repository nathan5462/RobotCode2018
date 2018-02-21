package org.usfirst.frc.team4541.robot.commandGroups;

import org.usfirst.frc.team4541.motionProfiling.Constants;
import org.usfirst.frc.team4541.motionProfiling.PathHandler.PATHS;
import org.usfirst.frc.team4541.robot.ElevatorConstants;
import org.usfirst.frc.team4541.robot.commands.DrivePath;
import org.usfirst.frc.team4541.robot.commands.DriveToPosAtAngle;
import org.usfirst.frc.team4541.robot.commands.EjectCube;
import org.usfirst.frc.team4541.robot.commands.ElevatorToHeight;
import org.usfirst.frc.team4541.robot.commands.TurnToAngle;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftSwitch extends CommandGroup {

    public  LeftSwitch() {
//    	addSequential(new ElevatorToHeight(ElevatorConstants.maxElevatorHeight / 2));
//    	addSequential(new DrivePath(PATHS.LEFT_SWITCH));
//    	addSequential(new EjectCube());
    	addSequential(new DriveToPosAtAngle(3, 0));
    	addSequential(new TurnToAngle(90));
    	addSequential(new DriveToPosAtAngle(4, 90));
    	addSequential(new TurnToAngle(0));
    	addSequential(new DriveToPosAtAngle(4.5, 0));
    }
}