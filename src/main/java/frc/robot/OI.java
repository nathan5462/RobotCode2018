/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import java.lang.reflect.Field;
import java.util.Hashtable;

import frc.robot.commands.EjectCube;
import frc.robot.commands.elevator.ElevatorHome;
import frc.robot.commands.elevator.ElevatorToHeight;
import frc.robot.commands.ShiftGear;
import frc.robot.commands.ToggleIntakeWheels;
import frc.robot.commands.ToggleIntakeContracted;
import frc.robot.commands.setIntakeContracted;
import frc.robot.commands.control.ChangeTriggerMode;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableBuilder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

import java.util.Hashtable;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public enum SENSOR {
		ENCODER_RIGHT_WHEELS, ENCODER_LEFT_WHEELS, ENCODER_ELEVATOR
	};
	public enum TRIG_MODE {
		ELEVATOR, INTAKE
	}
	public TRIG_MODE currentTriggerSetting = TRIG_MODE.ELEVATOR;

	public static Joystick joy = new Joystick(0);
	public static JoystickButton a_button = new JoystickButton(joy, 1);
	public static JoystickButton b_button = new JoystickButton(joy, 2);
	public static JoystickButton x_button = new JoystickButton(joy, 3);
	public static JoystickButton y_button = new JoystickButton(joy, 4);

	public static JoystickButton l_bump = new JoystickButton(joy, 5);
	public static JoystickButton r_bump = new JoystickButton(joy, 6);
	public static JoystickButton left_middle = new JoystickButton(joy, 7);
	public static JoystickButton right_middle = new JoystickButton(joy, 8);
	public static JoystickButton left_stick = new JoystickButton(joy, 9);
	public static JoystickButton right_stick = new JoystickButton(joy, 10);
	public int lastDpad = -1;

	public OI() {
		r_bump.whenPressed(new ShiftGear(false)); //right is high
		l_bump.whenPressed(new ShiftGear(true)); //left is low
	}

	public void processDPadInput() {
		if (lastDpad != joy.getPOV()) {
			switch (joy.getPOV()) {
			case 0: {
				// Top; move to scale max height
				new ElevatorToHeight(ElevatorConstants.maxElevatorHeight).start();
				break;
			}
			case 90: {
				// Right; move to switch
				new ElevatorToHeight(ElevatorConstants.avgScaleHeight).start();
				break;
			}
			case 180: {
				// Bottom; move to bottom of elevator
				new ElevatorToHeight(0).start();
				break;
			}
			case 270: {
				// Left; move to average height of elevator
				new ElevatorToHeight(ElevatorConstants.switchHeight).start();
				break;
			}
			}
		}
		lastDpad = joy.getPOV();

	}

	public void initPostSubsystemButtons() {
		a_button.whenPressed(new ToggleIntakeWheels());
  		b_button.whenPressed(new ToggleIntakeContracted());
  		y_button.whenPressed(new EjectCube());

  		right_middle.whenPressed(new ElevatorHome());
  		
	}

	public Joystick getJoystick() {
		return joy;
	}

	public PIDSource getPIDSource(SENSOR sensor) {
		return new PIDSource() {

			@Override
			public void setPIDSourceType(PIDSourceType pidSource) {
			}

			@Override
			public PIDSourceType getPIDSourceType() {
				return PIDSourceType.kDisplacement;
			}

			@Override
			public double pidGet() {
				switch (sensor) {
				case ENCODER_RIGHT_WHEELS:
					return Robot.drivetrain.getRightTalon().getSelectedSensorPosition(0);
				case ENCODER_LEFT_WHEELS:
					return Robot.drivetrain.getLeftTalon().getSelectedSensorPosition(0);
				case ENCODER_ELEVATOR:
					return Robot.elevator.getElevatorPos();
				}
				return 0;
			}
		};
	}

	public double addDeadZone(double input) {
		if (Math.abs(input) <= .05)
			input = 0;
		else if (input < 0)
			input = -Math.pow(input, 2);
		else
			input = Math.pow(input, 2);
		return input;
	}
}