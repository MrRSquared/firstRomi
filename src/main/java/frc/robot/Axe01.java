/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Servo;

/**
 * Add your docs here.
 */

public class Axe01 {
    private static Servo lumberjack = new Servo(2);

    public void chop(double wood){
        lumberjack.set(wood);
    }
    public double getChop(){
        double chopAngle = -1;
        chopAngle = lumberjack.getAngle();
        return chopAngle;
    }
    public void setChopAngle(double woodChopAngle){
        lumberjack.setAngle(woodChopAngle);
    }
}
