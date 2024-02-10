// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  private TalonFX motor1;
  private TalonFX motor2;

  public ExampleSubsystem() {

    motor1 = new TalonFX(0);
    motor2 = new TalonFX(1);
  }

  // /**
  //  * Example command factory method.
  //  *
  //  * @return a command
  //  */
  // public CommandBase exampleMethodCommand() {
  //   return new 
  // }

  public void runMotorPercent(double percent) {
    motor1.set(TalonFXControlMode.PercentOutput, percent);
    motor2.set(TalonFXControlMode.PercentOutput, percent);

  }


  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
