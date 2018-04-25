package org.usfirst.frc.team4541.motionProfiling;

public class PathHandler {
	public enum PATHS {
		DEFAULT_PATH,
		RIGHT_TURN,
		LEFT_SWITCH,
		RIGHT_SWITCH,
		LEFT_OPP_SCALE,
		RIGHT_OPP_SCALE,
		TEN_FT_TEST,
		FAST_RIGHT_SWITCH,
		FAST_RIGHT_SWITCH_REV,
		RIGHT_TO_CUBE
	}
	public static double[][] tenFtTest = new double[][] {
		  { 0.000005, 0, 10 },
		  { 0.000005, 0, 10 },
		  { 0.000055, 0.005, 10 },
		  { 0.00018, 0.0125, 10 },
		  { 0.00036, 0.018, 10 },
		  { 0.000605, 0.0245, 10 },
		  { 0.000925, 0.032, 10 },
		  { 0.00133, 0.0405, 10 },
		  { 0.00183, 0.05, 10 },
		  { 0.002435, 0.0605, 10 },
		  { 0.003155, 0.072, 10 },
		  { 0.004, 0.0845, 10 },
		  { 0.00498, 0.098, 10 },
		  { 0.006105, 0.1125, 10 },
		  { 0.007385, 0.128, 10 },
		  { 0.00883, 0.1445, 10 },
		  { 0.01045, 0.162, 10 },
		  { 0.012255, 0.1805, 10 },
		  { 0.014255, 0.2, 10 },
		  { 0.01646, 0.2205, 10 },
		  { 0.01888, 0.242, 10 },
		  { 0.021525, 0.2645, 10 },
		  { 0.024405, 0.288, 10 },
		  { 0.02753, 0.3125, 10 },
		  { 0.03091, 0.338, 10 },
		  { 0.034555, 0.3645, 10 },
		  { 0.038475, 0.392, 10 },
		  { 0.04268, 0.4205, 10 },
		  { 0.04718, 0.45, 10 },
		  { 0.051985, 0.4805, 10 },
		  { 0.057105, 0.512, 10 },
		  { 0.06255, 0.5445, 10 },
		  { 0.06833, 0.578, 10 },
		  { 0.074455, 0.6125, 10 },
		  { 0.080935, 0.648, 10 },
		  { 0.08778, 0.6845, 10 },
		  { 0.095, 0.722, 10 },
		  { 0.102605, 0.7605, 10 },
		  { 0.110605, 0.8, 10 },
		  { 0.119005, 0.84, 10 },
		  { 0.127805, 0.88, 10 },
		  { 0.137005, 0.92, 10 },
		  { 0.146605, 0.96, 10 },
		  { 0.156605, 1, 10 },
		  { 0.167005, 1.04, 10 },
		  { 0.177805, 1.08, 10 },
		  { 0.189005, 1.12, 10 },
		  { 0.200605, 1.16, 10 },
		  { 0.212605, 1.2, 10 },
		  { 0.225005, 1.24, 10 },
		  { 0.237805, 1.28, 10 },
		  { 0.251005, 1.32, 10 },
		  { 0.264605, 1.36, 10 },
		  { 0.278605, 1.4, 10 },
		  { 0.293005, 1.44, 10 },
		  { 0.307805, 1.48, 10 },
		  { 0.323005, 1.52, 10 },
		  { 0.338605, 1.56, 10 },
		  { 0.354605, 1.6, 10 },
		  { 0.371005, 1.64, 10 },
		  { 0.387805, 1.68, 10 },
		  { 0.405005, 1.72, 10 },
		  { 0.422605, 1.76, 10 },
		  { 0.440605, 1.8, 10 },
		  { 0.459005, 1.84, 10 },
		  { 0.477805, 1.88, 10 },
		  { 0.497005, 1.92, 10 },
		  { 0.516605, 1.96, 10 },
		  { 0.536605, 2, 10 },
		  { 0.557005, 2.04, 10 },
		  { 0.577805, 2.08, 10 },
		  { 0.599005, 2.12, 10 },
		  { 0.620605, 2.16, 10 },
		  { 0.642605, 2.2, 10 },
		  { 0.665005, 2.24, 10 },
		  { 0.687805, 2.28, 10 },
		  { 0.711005, 2.32, 10 },
		  { 0.734605, 2.36, 10 },
		  { 0.758605, 2.4, 10 },
		  { 0.783005, 2.44, 10 },
		  { 0.807805, 2.48, 10 },
		  { 0.833005, 2.52, 10 },
		  { 0.858605, 2.56, 10 },
		  { 0.884605, 2.6, 10 },
		  { 0.911005, 2.64, 10 },
		  { 0.937805, 2.68, 10 },
		  { 0.965005, 2.72, 10 },
		  { 0.992605, 2.76, 10 },
		  { 1.020605, 2.8, 10 },
		  { 1.049005, 2.84, 10 },
		  { 1.077805, 2.88, 10 },
		  { 1.107005, 2.92, 10 },
		  { 1.136605, 2.96, 10 },
		  { 1.166605, 3, 10 },
		  { 1.197005, 3.04, 10 },
		  { 1.227805, 3.08, 10 },
		  { 1.259005, 3.12, 10 },
		  { 1.290605, 3.16, 10 },
		  { 1.322605, 3.2, 10 },
		  { 1.355, 3.2395, 10 },
		  { 1.38778, 3.278, 10 },
		  { 1.420935, 3.3155, 10 },
		  { 1.454455, 3.352, 10 },
		  { 1.48833, 3.3875, 10 },
		  { 1.52255, 3.422, 10 },
		  { 1.557105, 3.4555, 10 },
		  { 1.591985, 3.488, 10 },
		  { 1.62718, 3.5195, 10 },
		  { 1.66268, 3.55, 10 },
		  { 1.698475, 3.5795, 10 },
		  { 1.734555, 3.608, 10 },
		  { 1.77091, 3.6355, 10 },
		  { 1.80753, 3.662, 10 },
		  { 1.844405, 3.6875, 10 },
		  { 1.881525, 3.712, 10 },
		  { 1.91888, 3.7355, 10 },
		  { 1.95646, 3.758, 10 },
		  { 1.994255, 3.7795, 10 },
		  { 2.032255, 3.8, 10 },
		  { 2.07045, 3.8195, 10 },
		  { 2.10883, 3.838, 10 },
		  { 2.147385, 3.8555, 10 },
		  { 2.186105, 3.872, 10 },
		  { 2.22498, 3.8875, 10 },
		  { 2.264, 3.902, 10 },
		  { 2.303155, 3.9155, 10 },
		  { 2.342435, 3.928, 10 },
		  { 2.38183, 3.9395, 10 },
		  { 2.42133, 3.95, 10 },
		  { 2.460925, 3.9595, 10 },
		  { 2.500605, 3.968, 10 },
		  { 2.54036, 3.9755, 10 },
		  { 2.58018, 3.982, 10 },
		  { 2.620055, 3.9875, 10 },
		  { 2.659975, 3.992, 10 },
		  { 2.69993, 3.9955, 10 },
		  { 2.73991, 3.998, 10 },
		  { 2.779905, 3.9995, 10 },
		  { 2.819905, 4, 10 },
		  { 2.859905, 4, 10 },
		  { 2.899905, 4, 10 },
		  { 2.939905, 4, 10 },
		  { 2.979905, 4, 10 },
		  { 3.019905, 4, 10 },
		  { 3.059905, 4, 10 },
		  { 3.099905, 4, 10 },
		  { 3.139905, 4, 10 },
		  { 3.179905, 4, 10 },
		  { 3.219905, 4, 10 },
		  { 3.259905, 4, 10 },
		  { 3.299905, 4, 10 },
		  { 3.339905, 4, 10 },
		  { 3.379905, 4, 10 },
		  { 3.419905, 4, 10 },
		  { 3.459905, 4, 10 },
		  { 3.499905, 4, 10 },
		  { 3.539905, 4, 10 },
		  { 3.579905, 4, 10 },
		  { 3.619905, 4, 10 },
		  { 3.659905, 4, 10 },
		  { 3.699905, 4, 10 },
		  { 3.739905, 4, 10 },
		  { 3.779905, 4, 10 },
		  { 3.819905, 4, 10 },
		  { 3.859905, 4, 10 },
		  { 3.899905, 4, 10 },
		  { 3.939905, 4, 10 },
		  { 3.979905, 4, 10 },
		  { 4.019905, 4, 10 },
		  { 4.059905, 4, 10 },
		  { 4.099905, 4, 10 },
		  { 4.139905, 4, 10 },
		  { 4.179905, 4, 10 },
		  { 4.219905, 4, 10 },
		  { 4.259905, 4, 10 },
		  { 4.299905, 4, 10 },
		  { 4.339905, 4, 10 },
		  { 4.379905, 4, 10 },
		  { 4.419905, 4, 10 },
		  { 4.459905, 4, 10 },
		  { 4.499905, 4, 10 },
		  { 4.539905, 4, 10 },
		  { 4.579905, 4, 10 },
		  { 4.619905, 4, 10 },
		  { 4.659905, 4, 10 },
		  { 4.699905, 4, 10 },
		  { 4.739905, 4, 10 },
		  { 4.779905, 4, 10 },
		  { 4.819905, 4, 10 },
		  { 4.859905, 4, 10 },
		  { 4.899905, 4, 10 },
		  { 4.939905, 4, 10 },
		  { 4.979905, 4, 10 },
		  { 5.019905, 4, 10 },
		  { 5.059905, 4, 10 },
		  { 5.099905, 4, 10 },
		  { 5.139905, 4, 10 },
		  { 5.179905, 4, 10 },
		  { 5.219905, 4, 10 },
		  { 5.259905, 4, 10 },
		  { 5.299905, 4, 10 },
		  { 5.339905, 4, 10 },
		  { 5.379905, 4, 10 },
		  { 5.419905, 4, 10 },
		  { 5.459905, 4, 10 },
		  { 5.499905, 4, 10 },
		  { 5.539905, 4, 10 },
		  { 5.579905, 4, 10 },
		  { 5.619905, 4, 10 },
		  { 5.659905, 4, 10 },
		  { 5.699905, 4, 10 },
		  { 5.739905, 4, 10 },
		  { 5.779905, 4, 10 },
		  { 5.819905, 4, 10 },
		  { 5.859905, 4, 10 },
		  { 5.899905, 4, 10 },
		  { 5.939905, 4, 10 },
		  { 5.979905, 4, 10 },
		  { 6.019905, 4, 10 },
		  { 6.059905, 4, 10 },
		  { 6.099905, 4, 10 },
		  { 6.139905, 4, 10 },
		  { 6.179905, 4, 10 },
		  { 6.219905, 4, 10 },
		  { 6.259905, 4, 10 },
		  { 6.299905, 4, 10 },
		  { 6.339905, 4, 10 },
		  { 6.379905, 4, 10 },
		  { 6.419905, 4, 10 },
		  { 6.459905, 4, 10 },
		  { 6.499905, 4, 10 },
		  { 6.539905, 4, 10 },
		  { 6.579905, 4, 10 },
		  { 6.619905, 4, 10 },
		  { 6.659905, 4, 10 },
		  { 6.699905, 4, 10 },
		  { 6.739905, 4, 10 },
		  { 6.779905, 4, 10 },
		  { 6.819905, 4, 10 },
		  { 6.859905, 4, 10 },
		  { 6.899905, 4, 10 },
		  { 6.939905, 4, 10 },
		  { 6.979905, 4, 10 },
		  { 7.019905, 4, 10 },
		  { 7.059905, 4, 10 },
		  { 7.099905, 4, 10 },
		  { 7.139905, 4, 10 },
		  { 7.179905, 4, 10 },
		  { 7.219905, 4, 10 },
		  { 7.2599, 3.999501, 10 },
		  { 7.29988, 3.998004, 10 },
		  { 7.339835, 3.995506, 10 },
		  { 7.379755, 3.992009, 10 },
		  { 7.41963, 3.987511, 10 },
		  { 7.45945, 3.982014, 10 },
		  { 7.499206, 3.975516, 10 },
		  { 7.538886, 3.968019, 10 },
		  { 7.578481, 3.959521, 10 },
		  { 7.617981, 3.950024, 10 },
		  { 7.657377, 3.939526, 10 },
		  { 7.696657, 3.928029, 10 },
		  { 7.735812, 3.915531, 10 },
		  { 7.774832, 3.902034, 10 },
		  { 7.813708, 3.887536, 10 },
		  { 7.852428, 3.872039, 10 },
		  { 7.890984, 3.855541, 10 },
		  { 7.929364, 3.838044, 10 },
		  { 7.96756, 3.819546, 10 },
		  { 8.00556, 3.800049, 10 },
		  { 8.043356, 3.779551, 10 },
		  { 8.080936, 3.758054, 10 },
		  { 8.118292, 3.735556, 10 },
		  { 8.155412, 3.712059, 10 },
		  { 8.192288, 3.687561, 10 },
		  { 8.228908, 3.662064, 10 },
		  { 8.265264, 3.635566, 10 },
		  { 8.301345, 3.608069, 10 },
		  { 8.337141, 3.579571, 10 },
		  { 8.372641, 3.550074, 10 },
		  { 8.407837, 3.519576, 10 },
		  { 8.442718, 3.488079, 10 },
		  { 8.477274, 3.455581, 10 },
		  { 8.511494, 3.422084, 10 },
		  { 8.54537, 3.387586, 10 },
		  { 8.578891, 3.352089, 10 },
		  { 8.612047, 3.315591, 10 },
		  { 8.644828, 3.278094, 10 },
		  { 8.677224, 3.239596, 10 },
		  { 8.709225, 3.200099, 10 },
		  { 8.740826, 3.1601, 10 },
		  { 8.772027, 3.1201, 10 },
		  { 8.802828, 3.0801, 10 },
		  { 8.833229, 3.0401, 10 },
		  { 8.86323, 3.0001, 10 },
		  { 8.892831, 2.9601, 10 },
		  { 8.922032, 2.9201, 10 },
		  { 8.950833, 2.8801, 10 },
		  { 8.979234, 2.8401, 10 },
		  { 9.007235, 2.8001, 10 },
		  { 9.034836, 2.7601, 10 },
		  { 9.062037, 2.7201, 10 },
		  { 9.088838, 2.6801, 10 },
		  { 9.115239, 2.6401, 10 },
		  { 9.14124, 2.6001, 10 },
		  { 9.166841, 2.5601, 10 },
		  { 9.192042, 2.5201, 10 },
		  { 9.216843, 2.4801, 10 },
		  { 9.241244, 2.4401, 10 },
		  { 9.265245, 2.4001, 10 },
		  { 9.288846, 2.3601, 10 },
		  { 9.312047, 2.3201, 10 },
		  { 9.334848, 2.2801, 10 },
		  { 9.357249, 2.2401, 10 },
		  { 9.37925, 2.2001, 10 },
		  { 9.400851, 2.1601, 10 },
		  { 9.422052, 2.1201, 10 },
		  { 9.442853, 2.0801, 10 },
		  { 9.463254, 2.0401, 10 },
		  { 9.483255, 2.0001, 10 },
		  { 9.502856, 1.9601, 10 },
		  { 9.522057, 1.9201, 10 },
		  { 9.540858, 1.8801, 10 },
		  { 9.559259, 1.8401, 10 },
		  { 9.57726, 1.8001, 10 },
		  { 9.594861, 1.7601, 10 },
		  { 9.612062, 1.7201, 10 },
		  { 9.628863, 1.6801, 10 },
		  { 9.645264, 1.6401, 10 },
		  { 9.661265, 1.6001, 10 },
		  { 9.676866, 1.5601, 10 },
		  { 9.692067, 1.5201, 10 },
		  { 9.706868, 1.4801, 10 },
		  { 9.721269, 1.4401, 10 },
		  { 9.73527, 1.4001, 10 },
		  { 9.748871, 1.3601, 10 },
		  { 9.762072, 1.3201, 10 },
		  { 9.774873, 1.2801, 10 },
		  { 9.787274, 1.2401, 10 },
		  { 9.799275, 1.2001, 10 },
		  { 9.810876, 1.1601, 10 },
		  { 9.822077, 1.1201, 10 },
		  { 9.832878, 1.0801, 10 },
		  { 9.843279, 1.0401, 10 },
		  { 9.85328, 1.0001, 10 },
		  { 9.862881, 0.9601, 10 },
		  { 9.872082, 0.9201, 10 },
		  { 9.880883, 0.8801, 10 },
		  { 9.889284, 0.8401, 10 },
		  { 9.897285, 0.8001, 10 },
		  { 9.904891, 0.760599, 10 },
		  { 9.912112, 0.722096, 10 },
		  { 9.918958, 0.684594, 10 },
		  { 9.925439, 0.648091, 10 },
		  { 9.931565, 0.612589, 10 },
		  { 9.937346, 0.578086, 10 },
		  { 9.942791, 0.544584, 10 },
		  { 9.947912, 0.512081, 10 },
		  { 9.952718, 0.480579, 10 },
		  { 9.957219, 0.450076, 10 },
		  { 9.961424, 0.420574, 10 },
		  { 9.965345, 0.392071, 10 },
		  { 9.968991, 0.364569, 10 },
		  { 9.972372, 0.338066, 10 },
		  { 9.975497, 0.312564, 10 },
		  { 9.978378, 0.288061, 10 },
		  { 9.981023, 0.264559, 10 },
		  { 9.983444, 0.242056, 10 },
		  { 9.985649, 0.220554, 10 },
		  { 9.98765, 0.200051, 10 },
		  { 9.989455, 0.180549, 10 },
		  { 9.991076, 0.162046, 10 },
		  { 9.992521, 0.144544, 10 },
		  { 9.993802, 0.128041, 10 },
		  { 9.994927, 0.112539, 10 },
		  { 9.995908, 0.098036, 10 },
		  { 9.996753, 0.084534, 10 },
		  { 9.997473, 0.072031, 10 },
		  { 9.998078, 0.060529, 10 },
		  { 9.998579, 0.050026, 10 },
		  { 9.998984, 0.040524, 10 },
		  { 9.999304, 0.032021, 10 },
		  { 9.999549, 0.024519, 10 },
		  { 9.99973, 0.018016, 10 },
		  { 9.999855, 0.012514, 10 },
		  { 9.999935, 0.008011, 10 },
		  { 9.99998, 0.004509, 10 },
		  { 10, 0.002006, 10 },
		  { 10.000005, 0.000504, 10 },
		  { 10.000005, 0.000001, 10 },
		  { 10.000005, 0, 10 }
	};

	public static double[][] getRightPointsForPath(PATHS path) {
		switch (path) {
//		case DEFAULT_PATH:
//			return defaultPathRightStraight;
//		case RIGHT_TURN:
//			return defaultPathRightTurn;
		case LEFT_SWITCH: 
			return leftSwitch.leftSwitch_right;
		case RIGHT_SWITCH: 
			return rightSwitch.rightSwitch_right;
		case TEN_FT_TEST:
			return tenFtTest;
		case LEFT_OPP_SCALE:
			return LeftOppSide.LeftOppSide_right;
//		case RIGHT_OPP_SCALE:
//			return LeftOppSide.LeftOppSide_left;
		case RIGHT_OPP_SCALE:
			return RightOppScale.rightOppScale_right;
		case FAST_RIGHT_SWITCH:
			return FastRightSwitch.FastRightSwitch_right;
		case FAST_RIGHT_SWITCH_REV:
			return FastRightSwitchReverse.FastRightSwitchReverse_right;
		case RIGHT_TO_CUBE:
			return RightToCube.RightToCube_right;
		}
		return null;
	}
	public static double[][] getLeftPointsForPath(PATHS path) {
		switch (path) {
//		case DEFAULT_PATH:
//			return defaultPathLeftStraight;
//		case RIGHT_TURN:
//			return defaultPathLeftTurn;
		case LEFT_SWITCH: 
			return leftSwitch.leftSwitch_left;
		case RIGHT_SWITCH: 
			return rightSwitch.rightSwitch_left;
		case TEN_FT_TEST:
			return tenFtTest;
		case LEFT_OPP_SCALE:
			return LeftOppSide.LeftOppSide_left;
//		case RIGHT_OPP_SCALE:
//			return LeftOppSide.LeftOppSide_right;
		case RIGHT_OPP_SCALE:
			return RightOppScale.rightOppScale_left;
		case FAST_RIGHT_SWITCH:
			return FastRightSwitch.FastRightSwitch_left;
		case FAST_RIGHT_SWITCH_REV:
			return FastRightSwitchReverse.FastRightSwitchReverse_left;
		case RIGHT_TO_CUBE:
			return RightToCube.RightToCube_left;
		}
		return null;
	}
}
