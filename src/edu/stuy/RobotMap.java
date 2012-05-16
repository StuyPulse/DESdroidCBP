package edu.stuy;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    public static final int FRONT_LEFT_MOTOR = 7;
    public static final int REAR_LEFT_MOTOR = 8;
    public static final int FRONT_RIGHT_MOTOR = 9;
    public static final int REAR_RIGHT_MOTOR = 10;

    public static final int ARM_MOTOR_CHANNEL = 3;

    public static final int GAMEPAD_PORT = 1;
}
