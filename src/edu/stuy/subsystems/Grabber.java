/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.stuy.subsystems;

import edu.stuy.RobotMap;
import edu.stuy.commands.GrabberStop;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author admin
 */
public class Grabber extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private Victor upperRoller;
    private Victor lowerRoller;

    public Grabber() {
        upperRoller = new Victor(RobotMap.GRABBER_UPPER_ROLLER_PORT);
        lowerRoller = new Victor(RobotMap.GRABBER_LOWER_ROLLER_PORT);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new GrabberStop());
    }

    public void in() {
        upperRoller.set(-1);
        lowerRoller.set(1);
    }

    public void out() {
        upperRoller.set(1);
        lowerRoller.set(-1);
    }

    public void rotateUp() {
        upperRoller.set(-1);
        lowerRoller.set(-1);
    }

    public void rotateDown() {
        upperRoller.set(1);
        lowerRoller.set(1);
    }

    public void stop() {
        upperRoller.set(0);
        lowerRoller.set(0);
    }
}