/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.utility.inputs;

import edu.wpi.first.wpilibj.GenericHID;

/**
 * Add your docs here.
 */
public abstract class DriverControllerProfile {
    public int usbPort;
    public int fwdBackAxis;
    public int leftRightAxis;
    public double customFwdBackAxis(GenericHID controller){
        return controller.getRawAxis(fwdBackAxis);
    }
    public double customLeftRightAxis(GenericHID controller){
        return controller.getRawAxis(leftRightAxis);
    }
}