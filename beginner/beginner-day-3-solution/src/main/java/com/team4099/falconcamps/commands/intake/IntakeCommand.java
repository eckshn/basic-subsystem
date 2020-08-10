package com.team4099.falconcamps.commands.intake;

import com.team4099.falconcamps.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class IntakeCommand extends CommandBase {
    private final IntakeSubsystem intake;

    public IntakeCommand(IntakeSubsystem intake) {
        this.intake = intake;
        this.addRequirements(intake);
    }

    @Override
    public void initialize() {
        intake.setPercentOutput(1.0);
    }
}