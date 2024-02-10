// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class ExampleSubsystem2 extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  
  TalonFX motor1;
  TalonFX motor2;

  public ExampleSubsystem2() {
    motor1 = new TalonFX(2);
    motor2 = new TalonFX(3);
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
  public void periodic() {}

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
