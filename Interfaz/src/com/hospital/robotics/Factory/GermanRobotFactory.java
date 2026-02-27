package com.hospital.robotics.factory;

import com.hospital.robotics.arm.*;
import com.hospital.robotics.vision.*;

public class GermanRobotFactory implements SurgeryRobotFactory {

    @Override
    public RoboticArm createArm() {
        return new GermanArm();
    }

    @Override
    public VisionSystem createVision() {
        return new GermanVision();
    }
}