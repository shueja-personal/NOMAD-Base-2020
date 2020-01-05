/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.wrappers;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedController;

/**
 * Add your docs here.
 */
public class NomadTalonSRX extends WPI_TalonSRX{
    /**
     * Constructs a TalonSRX, reverts it to factory default, and sets brake mode.
     * @param port The CAN ID of this Talon
     */
    public NomadTalonSRX(int port){
        super(port);
        this.configFactoryDefault();
        this.setNeutralMode(NeutralMode.Brake);
    }

    /**
     * Constructs a TalonSRX, reverts it to factory default, and sets brake mode and inversion status.
     * @param port The CAN ID of this Talon.
     * @param inverted True for inverted, false if not.
     */
    public NomadTalonSRX(int port, boolean inverted) {
        this(port);
        this.setInverted(inverted);
    }
    /**
     * Constructs a TalonSRX, reverts it to factory default, sets brake mode and inversion status, and slaves it to a specified NomadTalonSRX.
     * @param port The CAN ID of this Talon.
     * @param inverted True for inverted, false if not.
     * @param master The NomadTalonSRX to follow.
     */    
    public NomadTalonSRX(int port, boolean inverted, NomadTalonSRX master){
        this(port, inverted);
        this.follow(master);
    }
}
