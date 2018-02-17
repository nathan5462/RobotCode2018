package org.usfirst.frc.team4541.robot.commands;

import org.usfirst.frc.team4541.robot.ElevatorConstants;
import org.usfirst.frc.team4541.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ManualMoveElevator extends Command {
	
	
	public ManualMoveElevator() {
	requires(Robot.elevator);
	}
    
	protected void initiatlize() {
		Robot.elevator.getPIDVel().enable();
		Robot.elevator.getPIDMotorOutput().enable();
		
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double elevPos  = Robot.elevator.getElevatorPos();
    	double upTrig   = Robot.oi.getJoystick().getRawAxis(3);
    	double downTrig = Robot.oi.getJoystick().getRawAxis(2);
    	if (upTrig <= 0.05 && downTrig <= 0.05 || upTrig  > 0.05 && downTrig > 0.05) { //if neither are pressed, or if both are pressed, do nothing
    		//both or neither triggers pressed, maintain current pos
          this.setSetpoint(elevPos);
    		
    	} else if (upTrig  > 0.05) {
    		
    		this.setSetpoint(elevPos + (upTrig * ElevatorConstants.triggerCoefficient));
    		
    	} else if (downTrig > 0.05) {
    		
    		this.setSetpoint(elevPos - (downTrig * ElevatorConstants.triggerCoefficient));
    	}
    	
    	
    	
    	if(elevPos > ElevatorConstants.upperDangerZone) {
    		Robot.elevator.getPIDVel().setOutputRange(-ElevatorConstants.maxSpeed, ElevatorConstants.maxSpeed/2);
    	}
    	else if(elevPos< ElevatorConstants.lowerDangerZone) {
    		Robot.elevator.getPIDVel().setOutputRange(-ElevatorConstants.maxSpeed/2, ElevatorConstants.maxSpeed);
    	}
    	else {
    		Robot.elevator.getPIDVel().setOutputRange(-ElevatorConstants.maxSpeed, ElevatorConstants.maxSpeed);
    	}
    }
    
    protected void interrupted() {
    	
    }
    protected boolean isFinished() {
        return false;
    }
    public void setSetpoint(double setPoint) {
    	if (setPoint < 0) {
    		Robot.elevator.getPIDVel().setSetpoint(0);
    	} else if (setPoint > ElevatorConstants.maxElevatorHeight) {
    		Robot.elevator.getPIDVel().setSetpoint(ElevatorConstants.maxElevatorHeight);
    	} else {
    		Robot.elevator.getPIDVel().setSetpoint(setPoint);
    	}
    }

    protected void end() {
    }
    
    
	
}
