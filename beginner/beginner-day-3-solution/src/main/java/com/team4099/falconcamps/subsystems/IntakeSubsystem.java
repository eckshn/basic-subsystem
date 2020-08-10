package com.team4099.falconcamps.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import static com.team4099.falconcamps.Constants.Intake.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    private final TalonSRX intakeMotor = new TalonSRX(INTAKE_ID);

    public IntakeSubsystem() {
        super();
    }

    public void setPercentOutput(double percentOutput) {
        intakeMotor.set(ControlMode.PercentOutput, percentOutput);
    }

    @Override
    public void periodic() {}
}