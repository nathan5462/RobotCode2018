package org.usfirst.frc.team4541.superProfiling;

import org.usfirst.frc.team4541.motionProfiling.Constants;

public class SuperConstants {
	//path following constants
	public static double kP = 0.04;
	public static double kI = 0.00;
	public static double kV = 0.00; //much higher than the poof's value of 0.02
	
	public static double mKffv = 0.04;
	public static double mKffa = 0.02; //untested - taken from cheezypoof's code
	
//	public static double kP = 0.9;
//	public static double kI = 0;
//	public static double kV = 0; //much higher than the poof's value of 0.02
//	
//	public static double mKffv = 0;
//	public static double mKffa = 0; //untested - taken from cheezypoof's code
	
	public static double kRotationP = 0.04;

}
