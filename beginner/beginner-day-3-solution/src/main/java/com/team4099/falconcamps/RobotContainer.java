package com.team4099.falconcamps;

import static com.team4099.falconcamps.Constants.Controllers.*;

import com.team4099.falconcamps.commands.intake.IntakeIdleCommand;
import com.team4099.falconcamps.subsystems.IntakeSubsystem;
import com.team4099.falconcamps.commands.intake.IntakeCommand;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {
    private IntakeSubsystem intake = new IntakeSubsystem();
    private XboxController driverController = new XboxController(DRIVER_CONTROLLER);

    public RobotContainer() {
        intake.setDefaultCommand(new IntakeIdleCommand(intake));

        new Trigger(driverController::getAButton).whileActiveOnce(new IntakeCommand(intake));
    }
}
