/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.stuy.subsystems;

import edu.stuy.RobotMap;
import edu.stuy.commands.ArmGamepadControl;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author admin
 */
public class Arm extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private Victor armMotor;

    public Arm() {
        armMotor = new Victor(RobotMap.ARM_MOTOR_CHANNEL);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new ArmGamepadControl());
    }

    public void moveArm(double stickVal) {
        if (stickVal >= 0.5) {
            armMotor.set(1);
        }
        else if (stickVal <= -0.5) {
            armMotor.set(-1);
        }
        else {
            armMotor.set(0);
        }
    }
}