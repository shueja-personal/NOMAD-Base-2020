/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.controllerprofiles;

import edu.wpi.first.wpilibj.GenericHID;
import frc.robot.utility.inputs.DriverControllerProfile;

/**
 * An example driver controller profile that shows 
 */
public class XboxControllerTriggerDriveProfile extends DriverControllerProfile {
    private int usbPort = 0;
    private int fwdBackAxis = 1; //TODO update with actual mappings
    private int leftRightAxis = 2;
    private int leftTriggerAxis = 3;
    private int rightTriggerAxis = 4;
    @Override
    public double getFwdBackAxisValue(GenericHID controller){
        return controller.getRawAxis(leftTriggerAxis) - controller.getRawAxis(rightTriggerAxis);
    }

    @Override
    public int getUsbPort() {
        return usbPort;
    }

    @Override
    public int getFwdBackAxisID() {
        return fwdBackAxis;
    }

    @Override
    public int getLeftRightAxisID() {
        return leftRightAxis;
    }
}
